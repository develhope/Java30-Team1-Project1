public class Antipasti extends Piatti{
    private String tipo;

    public Antipasti(String nome, String descrizione, Double prezzo, String tipo){
        super(nome, descrizione, prezzo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void stampaInfo() {
        setNome(this.getNome()+" ("+tipo+")");
        super.stampaInfo();
    }
}