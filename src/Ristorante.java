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
        System.out.println(RED_BOLD_BRIGHT + "Benvenuti al ristorante " + this.nome + RESET +
                "\nChef del ristorante: " + this.nomeChef + "\n"
        );
    }

    public static final String RESET = "\033[0m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";// RED
}
