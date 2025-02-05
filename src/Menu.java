import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {
    private List<Piatti> menu;

    //TODO aggiungere nome, tipo, descrizione
    public Menu() {
        this.menu = new ArrayList<>();
    }

    public void addPiatto(Piatti piatti){
        menu.add(piatti);
    }

    public void removePiatto(Piatti piatti){
        menu.remove(piatti);
    }

    public void stampaMenu(){
            System.out.println(GREEN_BOLD + "Antipasti:\n" + RESET);
            for(Piatti antipasti : menu){
                if(antipasti instanceof Antipasti) {
                    antipasti.stampaInfo();
                }
            }

            System.out.println(YELLOW_BOLD + "\nPrimi Piatti:\n" + RESET);
            for(Piatti primi : menu){
                if(primi instanceof PrimiPiatti) {
                    primi.stampaInfo();
                }
            }

            System.out.println(PURPLE_BOLD + "\nSecondi Piatti:\n" + RESET);
            for(Piatti secondi : menu){
                if(secondi instanceof SecondiPiatti) {
                    secondi.stampaInfo();
                }
            }
    }

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String RESET = "\033[0m";
}
