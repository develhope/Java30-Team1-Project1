public class Ristorante {
    private String nome;
    private String nomeChef;

    public Ristorante(String nome, String nomeChef){
        this.nome = nome;
        this.nomeChef = nomeChef;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeChef() {
        return nomeChef;
    }

    public void setNomeChef(String nomeChef) {
        this.nomeChef = nomeChef;
    }

    public void stampaRistorante(){
        System.out.println(TipoColori.RED_BOLD_BRIGHT.colorize("Benvenuti al ristorante " + this.nome) +
                "\nChef del ristorante: " + this.nomeChef + "\n"
        );
    }
}
