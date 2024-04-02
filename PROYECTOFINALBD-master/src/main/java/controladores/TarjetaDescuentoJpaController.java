/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import controladores.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Cliente;
import entidades.Reserva;
import entidades.TarjetaDescuento;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author fer
 */
public class TarjetaDescuentoJpaController implements Serializable {

    public TarjetaDescuentoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TarjetaDescuento tarjetaDescuento) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente = tarjetaDescuento.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getId());
                tarjetaDescuento.setCliente(cliente);
            }
            em.persist(tarjetaDescuento);
            if (cliente != null) {
                TarjetaDescuento oldIdTarjetaDOfCliente = cliente.getIdtarjetaD();
                if (oldIdTarjetaDOfCliente != null) {
                    oldIdTarjetaDOfCliente.setCliente(null);
                    oldIdTarjetaDOfCliente = em.merge(oldIdTarjetaDOfCliente);
                }
                cliente.setIdtarjetaD(tarjetaDescuento);
                cliente = em.merge(cliente);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TarjetaDescuento tarjetaDescuento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TarjetaDescuento persistentTarjetaDescuento = em.find(TarjetaDescuento.class, tarjetaDescuento.getId());
            Cliente clienteOld = persistentTarjetaDescuento.getCliente();
            Cliente clienteNew = tarjetaDescuento.getCliente();
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getId());
                tarjetaDescuento.setCliente(clienteNew);
            }
            tarjetaDescuento = em.merge(tarjetaDescuento);
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                clienteOld.setIdtarjetaD(null);
                clienteOld = em.merge(clienteOld);
            }
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                TarjetaDescuento oldIdTarjetaDOfCliente = clienteNew.getIdtarjetaD();
                if (oldIdTarjetaDOfCliente != null) {
                    oldIdTarjetaDOfCliente.setCliente(null);
                    oldIdTarjetaDOfCliente = em.merge(oldIdTarjetaDOfCliente);
                }
                clienteNew.setIdtarjetaD(tarjetaDescuento);
                clienteNew = em.merge(clienteNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tarjetaDescuento.getId();
                if (findTarjetaDescuento(id) == null) {
                    throw new NonexistentEntityException("The tarjetaDescuento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TarjetaDescuento tarjetaDescuento;
            try {
                tarjetaDescuento = em.getReference(TarjetaDescuento.class, id);
                tarjetaDescuento.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tarjetaDescuento with id " + id + " no longer exists.", enfe);
            }
            Cliente cliente = tarjetaDescuento.getCliente();
            if (cliente != null) {
                cliente.setIdtarjetaD(null);
                cliente = em.merge(cliente);
            }
            em.remove(tarjetaDescuento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TarjetaDescuento> findTarjetaDescuentoEntities() {
        return findTarjetaDescuentoEntities(true, -1, -1);
    }

    public List<TarjetaDescuento> findTarjetaBancariaEntities(int maxResults, int firstResult) {
        return findTarjetaDescuentoEntities(false, maxResults, firstResult);
    }

    private List<TarjetaDescuento> findTarjetaDescuentoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TarjetaDescuento.class));
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

    public TarjetaDescuento findTarjetaDescuento(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TarjetaDescuento.class, id);
        } finally {
            em.close();
        }
    }

    public int getTarjetaDescuentoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TarjetaDescuento> rt = cq.from(TarjetaDescuento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    

    // Método añadido, usando una named query de la entidad habitacion
    public TarjetaDescuento findByIDTarjetaDescuento(int id) {
        EntityManager em = getEntityManager();
        // Se crea la query usando el nombre de la named query
        Query q = em.createNamedQuery("TarjetaDescuento.findByIDTarjetaDescuento");
        // Se establece el parámetro de la consulta
        q.setParameter("id", id);
        return (TarjetaDescuento) q.getSingleResult();
    }
    
     public TarjetaDescuento findByIDTarjetaDescuento(String fecha_caducidad) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        EntityManager em = getEntityManager();
        // Se crea la query usando el nombre de la named query
        Query q = em.createNamedQuery("TarjetaDescuento.findByFechaTarjetaDescuento");
        // Se establece el parámetro de la consulta
        
        q.setParameter("fecha_caducidad", dateFormat.parse(fecha_caducidad));
        return (TarjetaDescuento) q.getSingleResult();
    }
    

}
