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

    public Evento findById(long id) {
        Evento evento = em.find(Evento.class, id);
    return evento;
    }

    public void deleteById (long id) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Evento evento = em.find(Evento.class, id);
        em.remove(evento);
        tx.commit();
    }
}
