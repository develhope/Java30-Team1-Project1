public class PrimiPiatti extends Piatti {

    private String cotturaPasta;

    public PrimiPiatti(String nome, String descrizione, Double prezzo, String cotturaPasta) {
        super(nome, descrizione, prezzo);
        this.cotturaPasta = cotturaPasta;
    }

    public String getCotturaPasta() {
        return cotturaPasta;
    }

    public void setCotturaPasta(String cotturaPasta) {
        this.cotturaPasta = cotturaPasta;
    }

    @Override
    public void stampaInfo() {
        setNome(this.getNome()+" ("+cotturaPasta+")");
        super.stampaInfo();
    }
}




