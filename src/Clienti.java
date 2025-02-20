import java.time.LocalDate;

public class Clienti {
    private String nome;
    private String cognome;
    private String citta;
    private LocalDate dataDiNascita;

    public Clienti(String nome, String cognome, String citta, LocalDate dataDiNascita, TipoDieta ) {
        this.nome = nome;
        this.cognome = cognome;
        this.citta = citta;
        this.dataDiNascita = dataDiNascita;
    }
}
