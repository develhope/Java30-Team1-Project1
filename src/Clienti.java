public class Clienti {
    private String nome;
    private String cognome;
    private String citta;
    private String dataDiNascita;

    public Clienti(String nome, String cognome, String citta, String dataDiNascita, TipoDieta tipoPiatto) {
        this.nome = nome;
        this.cognome = cognome;
        this.citta = citta;
        this.dataDiNascita = dataDiNascita;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Cliente " +
                "nome :" + nome +
                ", cognome : " + cognome +
                ", citta : " + citta +
                ", data di Nascita : " + dataDiNascita;
    }
}
