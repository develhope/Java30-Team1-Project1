import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {
    private List<Piatti> menu;

    public Menu() {
        this.menu = new ArrayList<>();
    }

    public void addPiatto(Piatti piatti){
        menu.add(piatti);
    }

    public void removePiatto(String name){
        Iterator<Piatti> iterator = menu.iterator();

        while(iterator.hasNext()){
            Piatti piatti = iterator.next();
            if(name.equals(piatti.getNome())){
                iterator.remove();
            }
        }
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

    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
    public static final String RESET = "\033[0m";
}
