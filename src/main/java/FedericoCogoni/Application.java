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
            EventoDAO db = new EventoDAO(em);


        Evento prova = new Evento("prima prova", LocalDate.of(2022, 10, 11), "descrizione prova", TipoEvento.PRIVATO, 12);
        db.save(prova);
        }
    }