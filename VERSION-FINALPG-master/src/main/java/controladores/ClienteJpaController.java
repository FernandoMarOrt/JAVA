/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import controladores.exceptions.IllegalOrphanException;
import controladores.exceptions.NonexistentEntityException;
import entidades.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.TarjetaDescuento;
import entidades.Reserva;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author fer
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        if (cliente.getReservaList() == null) {
            cliente.setReservaList(new ArrayList<Reserva>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TarjetaDescuento idtarjetaD = cliente.getIdtarjetaD();
            if (idtarjetaD != null) {
                idtarjetaD = em.getReference(idtarjetaD.getClass(), idtarjetaD.getId());
                cliente.setIdtarjetaD(idtarjetaD);
            }
            List<Reserva> attachedReservaList = new ArrayList<Reserva>();
            for (Reserva reservaListReservaToAttach : cliente.getReservaList()) {
                reservaListReservaToAttach = em.getReference(reservaListReservaToAttach.getClass(), reservaListReservaToAttach.getId());
                attachedReservaList.add(reservaListReservaToAttach);
            }
            cliente.setReservaList(attachedReservaList);
            em.persist(cliente);

            if (idtarjetaD != null) {
                Cliente oldClienteOfIdTarjeta = idtarjetaD.getCliente();
                if (oldClienteOfIdTarjeta != null) {
                    oldClienteOfIdTarjeta.setIdtarjetaD(null);
                    oldClienteOfIdTarjeta = em.merge(oldClienteOfIdTarjeta);
                }
                idtarjetaD.setCliente(cliente);
                idtarjetaD = em.merge(idtarjetaD);
            }

            for (Reserva reservaListReserva : cliente.getReservaList()) {
                Cliente oldIdClienteOfReservaListReserva = reservaListReserva.getCliente();
                reservaListReserva.setCliente(cliente);
                reservaListReserva = em.merge(reservaListReserva);
                if (oldIdClienteOfReservaListReserva != null) {
                    oldIdClienteOfReservaListReserva.getReservaList().remove(reservaListReserva);
                    oldIdClienteOfReservaListReserva = em.merge(oldIdClienteOfReservaListReserva);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getId());
            TarjetaDescuento idtarjetaDOld = persistentCliente.getIdtarjetaD();
            TarjetaDescuento idtarjetaDNew = cliente.getIdtarjetaD();
            List<Reserva> reservaListOld = persistentCliente.getReservaList();
            List<Reserva> reservaListNew = cliente.getReservaList();
            List<String> illegalOrphanMessages = null;
            for (Reserva reservaListOldReserva : reservaListOld) {
                if (!reservaListNew.contains(reservaListOldReserva)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Reserva " + reservaListOldReserva + " since its idCliente field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (idtarjetaDNew != null) {
                idtarjetaDNew = em.getReference(idtarjetaDNew.getClass(), idtarjetaDNew.getId());
                cliente.setIdtarjetaD(idtarjetaDNew);
            }
            List<Reserva> attachedReservaListNew = new ArrayList<Reserva>();
            for (Reserva reservaListNewReservaToAttach : reservaListNew) {
                reservaListNewReservaToAttach = em.getReference(reservaListNewReservaToAttach.getClass(), reservaListNewReservaToAttach.getId());
                attachedReservaListNew.add(reservaListNewReservaToAttach);
            }
            reservaListNew = attachedReservaListNew;
            cliente.setReservaList(reservaListNew);
            cliente = em.merge(cliente);

            if (idtarjetaDOld != null && !idtarjetaDOld.equals(idtarjetaDNew)) {
                idtarjetaDOld.setCliente(null);
                idtarjetaDOld = em.merge(idtarjetaDOld);
            }
            if (idtarjetaDNew != null && !idtarjetaDNew.equals(idtarjetaDOld)) {

                Cliente oldClienteOfIdTarjeta = idtarjetaDNew.getCliente();
                if (oldClienteOfIdTarjeta != null) {
                    oldClienteOfIdTarjeta.setIdtarjetaD(null);
                    oldClienteOfIdTarjeta = em.merge(oldClienteOfIdTarjeta);
                }

                idtarjetaDNew.setCliente(cliente);
                idtarjetaDNew = em.merge(idtarjetaDNew);
            }

            for (Reserva reservaListNewReserva : reservaListNew) {
                if (!reservaListOld.contains(reservaListNewReserva)) {
                    Cliente oldIdClienteOfReservaListNewReserva = reservaListNewReserva.getCliente();
                    reservaListNewReserva.setCliente(cliente);
                    reservaListNewReserva = em.merge(reservaListNewReserva);
                    if (oldIdClienteOfReservaListNewReserva != null && !oldIdClienteOfReservaListNewReserva.equals(cliente)) {
                        oldIdClienteOfReservaListNewReserva.getReservaList().remove(reservaListNewReserva);
                        oldIdClienteOfReservaListNewReserva = em.merge(oldIdClienteOfReservaListNewReserva);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = cliente.getId();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Reserva> reservaListOrphanCheck = cliente.getReservaList();
            for (Reserva reservaListOrphanCheckReserva : reservaListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Cliente (" + cliente + ") cannot be destroyed since the Reserva " + reservaListOrphanCheckReserva + " in its reservaList field has a non-nullable idCliente field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            TarjetaDescuento idtarjetaD = cliente.getIdtarjetaD();
            if (idtarjetaD != null) {
                idtarjetaD.setCliente(null);
                idtarjetaD = em.merge(idtarjetaD);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    // Método añadido, usando una named query de la entidad cliente
    public Cliente findByNif(String dni) {
        EntityManager em = getEntityManager();
        // Se crea la query usando el nombre de la named query
        Query q = em.createNamedQuery("Cliente.findByDni");
        // Se establece el parámetro de la consulta
        q.setParameter("dni", dni);
        return (Cliente) q.getSingleResult();
    }

    // Método añadido, usando una named query de la entidad cliente
    public Cliente findByNombre(String nombre) {
        EntityManager em = getEntityManager();
        // Se crea la query usando el nombre de la named query
        Query q = em.createNamedQuery("Cliente.findByNombre");
        // Se establece el parámetro de la consulta
        q.setParameter("nombre", nombre);
        return (Cliente) q.getSingleResult();
    }

}
