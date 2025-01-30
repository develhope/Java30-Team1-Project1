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
            System.out.println("Antipasti:\n");
            for(Piatti antipasti : menu){
                if(antipasti instanceof Antipasti) {
                    antipasti.stampaInfo();
                }
            }

            System.out.println("\nPrimi Piatti:\n");
            for(Piatti primi : menu){
                if(primi instanceof PrimiPiatti) {
                    primi.stampaInfo();
                }
            }

            System.out.println("\nSecondi Piatti:\n");
            for(Piatti secondi : menu){
                if(secondi instanceof SecondiPiatti) {
                    secondi.stampaInfo();
                }
            }
    }
}
