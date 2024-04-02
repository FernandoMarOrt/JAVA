
package application;

import entities.Factura;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//Métodos básicos del EntityManager

public class BdFacturas {
    
    // Inserta un objeto en la tabla vehiculo. 
    public static void createFactura(Factura f) {
        EntityManager em = getEntityManager();
        // En este caso es necesario iniciar una transacción en la base de datos
        // porque vamos a persistir información en la misma
        em.getTransaction().begin();
        // Se guarda el objeto en el contexto de persistencia (caché intermedia)
        em.persist(f);
        // Se vuelca la información del contexto (caché intermedia) en la base de datos
        em.getTransaction().commit();
        // Cierra el entityManager
        em.close();
    }

    // Borra un registro de la tabla, aquel que tenga la misma pk que v
    // Si no existe esa pk no hace nada
    public static void deleteFactura(Factura f) {
        EntityManager em = getEntityManager();
        Factura aux = null;
        // En este caso es necesario iniciar una transacción en la base de datos
        // porque vamos a borrar información en la misma
        em.getTransaction().begin();
        // Si v no es un objeto gestionado por el contexto de persistencia
        if (!em.contains(f)) {
            // Carga v en el contexto de persistencia y se guarda en aux
            aux = em.merge(f);
        }
        // Ahora se puede borrar usando aux, porque es una entidad gestionada por la
        // caché
        em.remove(aux);
        // Se vuelca la información del contexto (caché intermedia) en la base de datos
        em.getTransaction().commit();
        // Cierra el entityManager
        em.close();
    }

    // Modifica un registro de la tabla, en concreto aquel que tenga la misma pk que v
    // Si esa pk no existe, se inserta un nuevo registro con los valores de v
    public static void modifyFactura(Factura f) {
        EntityManager em = getEntityManager();
        // En este caso es necesario iniciar una transacción en la base de datos
        // porque vamos a persistir información en la misma
        em.getTransaction().begin();
        // merge - Si una entidad con el mismo identificador que v existe en el
        // contexto de persistencia (caché), se actualizan sus atributos y se devuelve
        // como entidad gestionada, para guardar cambios con commit
        // Si el objeto v no existe en la base de datos, entonces merge() se comporta 
        // como persist()
        em.merge(f);
        em.getTransaction().commit();
        em.close();

    }

   
    // Obtiene una entidad por clave primaria, pk. Si no existe lanza 
    // una excepción NoResultException
    public static Factura findByPK(String pk) {
        EntityManager em = getEntityManager();
        Factura aux = null;
        // Se crea el objeto Query a partir de una SQL nativa, que permite pasar
        // código SQL directamente a la base de datos
        Query q = em.createNativeQuery("Select * from factura where pk = ?", Factura.class);
        // Se establece que el parámetro a usar en la query es la pk que se pasa como parámetro
        // al método
        q.setParameter(1, pk);
        // Se ejecuta la consulta
        aux = (Factura) q.getSingleResult();
        // Cierra el entityManager
        em.close();
        return aux;

    }

    // Este método obtiene todos los registros de la tabla. Si no hay registros
    // devuelve una lista vacía
    public static List<Factura> findAll() {
        EntityManager em = getEntityManager();
        // Se crea la Query a partir del nombre de la NamedQuery de la clase Vehiculo
        Query q = em.createNamedQuery("Factura.findAll");
        // Se ejecuta la consulta y se hace un casting
        List<Factura> listaFactura = (List<Factura>) q.getResultList();
        // Cierra el entityManager
        em.close();
        return listaFactura;
    }


    // Crea un objeto EntityManager usando una unidad de persistencia
    private static EntityManager getEntityManager() {
        // EntityManager permite realizar operaciones con la BD
        // Se obtiene a través del EntityManagerFactory y este a su vez se genera
        // a partir del nombre de la unidad de persistencia (fichero persistence.xml)
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bdfactura");
        EntityManager em = entityManagerFactory.createEntityManager();
        return em;
    }

}
