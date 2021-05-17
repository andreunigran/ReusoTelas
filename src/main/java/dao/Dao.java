
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app_ProjetoAgendaJPA_jar_1.0-SNAPSHOTPU");
    private static EntityManager em = emf.createEntityManager();
    private static EntityTransaction etx= em.getTransaction();
    
    public static Object salvar(Object o){
           
           etx.begin();
           em.merge(o);
           etx.commit();
           return o;
    }
    public void salvarP(Object o){
           
           etx.begin();
           em.persist(o);
           etx.commit();
           
    }
    public static void remover(Object o){
           etx.begin();
           em.remove(o);
           etx.commit();
    }
    
    public static Object findPorID(Class c,int id){
        return em.find(c, id);
    }

    public static List listar(Class c){
        //em.createNativeQuery("select * from Contato", Contato.class).getResultList();
        return em.createQuery("select o from "+c.getSimpleName()+" o ").getResultList();
        
    }
}
