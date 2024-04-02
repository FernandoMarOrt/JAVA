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
import entidades.Habitacion;
import entidades.Reserva;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author fer
 */
public class ReservaJpaController implements Serializable {

    public ReservaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Reserva reserva) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente idCliente = reserva.getCliente();
            if (idCliente != null) {
                idCliente = em.getReference(idCliente.getClass(), idCliente.getId());
                reserva.setCliente(idCliente);
            }
            Habitacion idHabitacion = reserva.getHabitacion();
            if (idHabitacion != null) {
                idHabitacion = em.getReference(idHabitacion.getClass(), idHabitacion.getId());
                reserva.setHabitacion(idHabitacion);
            }
            em.persist(reserva);
            if (idCliente != null) {
                idCliente.getReservaList().add(reserva);
                idCliente = em.merge(idCliente);
            }
            if (idHabitacion != null) {
                idHabitacion.getReservaList().add(reserva);
                idHabitacion = em.merge(idHabitacion);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Reserva reserva) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Reserva persistentReserva = em.find(Reserva.class, reserva.getId());
            Cliente idClienteOld = persistentReserva.getCliente();
            Cliente idClienteNew = reserva.getCliente();
            Habitacion idHabitacionOld = persistentReserva.getHabitacion();
            Habitacion idHabitacionNew = reserva.getHabitacion();
            if (idClienteNew != null) {
                idClienteNew = em.getReference(idClienteNew.getClass(), idClienteNew.getId());
                reserva.setCliente(idClienteNew);
            }
            if (idHabitacionNew != null) {
                idHabitacionNew = em.getReference(idHabitacionNew.getClass(), idHabitacionNew.getId());
                reserva.setHabitacion(idHabitacionNew);
            }
            reserva = em.merge(reserva);
            if (idClienteOld != null && !idClienteOld.equals(idClienteNew)) {
                idClienteOld.getReservaList().remove(reserva);
                idClienteOld = em.merge(idClienteOld);
            }
            if (idClienteNew != null && !idClienteNew.equals(idClienteOld)) {
                idClienteNew.getReservaList().add(reserva);
                idClienteNew = em.merge(idClienteNew);
            }
            if (idHabitacionOld != null && !idHabitacionOld.equals(idHabitacionNew)) {
                idHabitacionOld.getReservaList().remove(reserva);
                idHabitacionOld = em.merge(idHabitacionOld);
            }
            if (idHabitacionNew != null && !idHabitacionNew.equals(idHabitacionOld)) {
                idHabitacionNew.getReservaList().add(reserva);
                idHabitacionNew = em.merge(idHabitacionNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = reserva.getId();
                if (findReserva(id) == null) {
                    throw new NonexistentEntityException("The reserva with id " + id + " no longer exists.");
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
            Reserva reserva;
            try {
                reserva = em.getReference(Reserva.class, id);
                reserva.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reserva with id " + id + " no longer exists.", enfe);
            }
            Cliente idCliente = reserva.getCliente();
            if (idCliente != null) {
                idCliente.getReservaList().remove(reserva);
                idCliente = em.merge(idCliente);
            }
            Habitacion idHabitacion = reserva.getHabitacion();
            if (idHabitacion != null) {
                idHabitacion.getReservaList().remove(reserva);
                idHabitacion = em.merge(idHabitacion);
            }
            em.remove(reserva);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Reserva> findReservaEntities() {
        return findReservaEntities(true, -1, -1);
    }

    public List<Reserva> findReservaEntities(int maxResults, int firstResult) {
        return findReservaEntities(false, maxResults, firstResult);
    }

    private List<Reserva> findReservaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Reserva.class));
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

    public Reserva findReserva(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reserva.class, id);
        } finally {
            em.close();
        }
    }

    public int getReservaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Reserva> rt = cq.from(Reserva.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
     // Método añadido, usando una named query de la entidad reserva
    public Reserva findByIDreserva(int id){
        EntityManager em = getEntityManager();
        // Se crea la query usando el nombre de la named query
        Query q = em.createNamedQuery("Reserva.findByIDreserva");
        // Se establece el parámetro de la consulta
        q.setParameter("id", id);
        return (Reserva) q.getSingleResult();
    }
    
       // Método añadido, usando una named query de la entidad reserva
    public Reserva findByClienteEnReserva(int id){
        EntityManager em = getEntityManager();
        // Se crea la query usando el nombre de la named query
        Query q = em.createNamedQuery("Reserva.findByClienteEnReserva");
        // Se establece el parámetro de la consulta
        q.setParameter("id", id);
        return (Reserva) q.getSingleResult();
    }
    
    
}
