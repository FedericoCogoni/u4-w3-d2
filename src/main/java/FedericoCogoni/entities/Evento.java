package FedericoCogoni.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "data_evento")
    private LocalDate data_evento;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "evento")
    @Enumerated(EnumType.STRING)
    private TipoEvento evento;

    @Column(name = "numero_massimo_partecipanti")
    private int numero_massimo_partecipanti;




    public Evento(){}

    public Evento(String titolo, LocalDate data_evento, String descrizione, TipoEvento evento, int numero_massimo_partecipanti) {
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.evento = evento;
        this.numero_massimo_partecipanti = numero_massimo_partecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getEvento() {
        return evento;
    }

    public void setEvento(TipoEvento evento) {
        this.evento = evento;
    }

    public int getNumero_massimo_partecipanti() {
        return numero_massimo_partecipanti;
    }

    public void setNumero_massimo_partecipanti(int numero_massimo_partecipanti) {
        this.numero_massimo_partecipanti = numero_massimo_partecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", evento=" + evento +
                ", numero_massimo_partecipanti=" + numero_massimo_partecipanti +
                '}';
    }
}
