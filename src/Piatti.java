public class Piatti {
    private String nome;
    private String descrizione;
    private Double prezzo;
    private TipoDieta tipoPiatto;

    public Piatti(String nome, String descrizione, Double prezzo, TipoDieta tipoPiatto) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.tipoPiatto = tipoPiatto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public TipoDieta getTipoPiatto() {
        return tipoPiatto;
    }

    public void setTipoPiatto(TipoDieta tipoPiatto) {
        this.tipoPiatto = tipoPiatto;
    }

    /**
    *Con la % garantiamo la corretta gestione della nuova riga su qualsiasi sistema operativo
    *%s per definire il prossimo parametro, in questo caso this.nome (s, prossimo parametro)
    *%n~ aggiungiamo questo parametro per andare a capo dopo il this.nome e dopo il this.tipoCottura
    *%-75s forziamo il print a stampare verso sinistra con un bordo di 75, (s, prossimo parametro) in questo caso this.descrizione
    *%s per definire il prossimo parametro ma con l'aggiunta dell'euro per il prezzo in questo caso this.prezzo
    *%n per andare a capo nel caso ci siano prossimi print, per non rovinare la formattazione
    **/

    public void stampaInfo(){
        System.out.printf("%s %n~ %-75s %s€ %n", this.nome + " ("+this.tipoPiatto +")", this.descrizione, this.prezzo);
    }
}
