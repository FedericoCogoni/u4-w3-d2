package FedericoCogoni;

import FedericoCogoni.dao.EventoDAO;
import FedericoCogoni.entities.TipoEvento;
import FedericoCogoni.entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4-w3-d2");

    public static void main(String[] args) {
            System.out.println("Hello World!");
            EntityManager em = emf.createEntityManager();
            EventoDAO sd = new EventoDAO(em);


       /* Evento prova4= new Evento("prova4", LocalDate.of(2022, 10, 11), "descrizione prova", TipoEvento.PRIVATO, 12);
        Evento prova1 = new Evento("prova1", LocalDate.of(2022, 10, 11), "descrizione prova", TipoEvento.PRIVATO, 12);
        Evento prova2 = new Evento("prova2", LocalDate.of(2022, 10, 11), "descrizione prova", TipoEvento.PRIVATO, 12);
        Evento prova3 = new Evento("prova3", LocalDate.of(2022, 10, 11), "descrizione prova", TipoEvento.PRIVATO, 12);
        sd.save(prova1);
        sd.save(prova2);
        sd.save(prova3);
        sd.save(prova4);
        System.out.println("evento " + prova1.getTitolo() + " creato");
        System.out.println("evento " + prova2.getTitolo() + " creato");
        System.out.println("evento " + prova3.getTitolo() + " creato");
        System.out.println("evento " + prova4.getTitolo() + " creato");*/

        Evento prova1FromDB = sd.findById(1502);
        System.out.println(prova1FromDB.getTitolo() + " " + prova1FromDB.getData_evento());

        sd.deleteById(1502);
        System.out.println("evento" + prova1FromDB + "eliminato");
        
        em.close();
        emf.close();

    }
    }