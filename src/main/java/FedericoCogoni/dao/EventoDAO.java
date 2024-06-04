package FedericoCogoni.dao;

import FedericoCogoni.entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save (Evento evento){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(evento);
        transaction.commit();
    }
}
