public class SecondiPiatti extends Piatti{

    private String cotturaCarne;


    public SecondiPiatti(String nome, String descrizione, Double prezzo, String cotturaCarne) {
        super(nome, descrizione, prezzo);
        this.cotturaCarne = cotturaCarne;
    }

    public String getCotturaCarne() {
        return cotturaCarne;
    }

    public void setTipo(String tipo) {
        this.cotturaCarne = cotturaCarne;
    }

    @Override
    public void stampaInfo() {
        setNome(this.getNome()+" ("+cotturaCarne+")");
        super.stampaInfo();
    }
}