import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Piatti> menu;
    private TipoEnum tipoMenu;
    private String nome;
    private String descrizione;

    public Menu(TipoEnum tipoMenu, String nome, String descrizione) {
        this.menu = new ArrayList<>();
        this.tipoMenu = tipoMenu;
        this.nome = nome;
        this.descrizione = descrizione;

    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void addPiatto(Piatti piatti){
        menu.add(piatti);
    }

    public void removePiatto(Piatti piatti){
        menu.remove(piatti);
    }

    public void stampaMenu(){
        System.out.println("Nome menu: " + this.nome +
                "\nDescrizione menu: " + this.descrizione +
                "\nTipo menu: " + this.tipoMenu + "\n"
        );

            System.out.println(TipoColori.GREEN_BOLD.colorize("Antipasti:\n"));
            for(Piatti antipasti : menu){
                if(antipasti instanceof Antipasti) {
                    antipasti.stampaInfo();
                }
            }

            System.out.println(TipoColori.YELLOW_BOLD.colorize("\nPrimi Piatti:\n"));
            for(Piatti primi : menu){
                if(primi instanceof PrimiPiatti) {
                    primi.stampaInfo();
                }
            }

            System.out.println(TipoColori.PURPLE_BOLD.colorize("\nSecondi Piatti:\n") );
            for(Piatti secondi : menu){
                if(secondi instanceof SecondiPiatti) {
                    secondi.stampaInfo();
                }
            }
    }
}
