public class Antipasti {
    private String nome;
    private Double prezzo;

    //TODO creare il costruttore, fare getter e setter ed un metodo per stampare le informazioni (nome e prezzo)
    public Antipasti(String nome, Double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public void stampaInfo(){
        System.out.println("Piatto:"+nome+ " / "+ "Prezzo:"+prezzo+"€");
    }
}