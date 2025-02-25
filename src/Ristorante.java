import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ristorante {
    private String nome;
    private String nomeChef;
    private List<Menu> menuList;
    Map<LocalDate, Integer> numeroPostiDisponibili;
    List<Prenotazione> prenotazioniList;

    public Ristorante(String nome, String nomeChef, int postiTotali){
        this.nome = nome;
        this.nomeChef = nomeChef;
        this.menuList = new ArrayList<>();
        this.numeroPostiDisponibili = new HashMap<>();
        this.numeroPostiDisponibili.put(LocalDate.now(), postiTotali);
        this.prenotazioniList = new ArrayList<>();
    }

    public void addMenu(Menu menu){
        menuList.add(menu);
    }

    public void removeMenu(Menu menu){
        menuList.remove(menu);
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
        System.out.println(TipoColori.RED.colorize("Benvenuti al ristorante " + this.nome) +
                "\nChef del ristorante: " + this.nomeChef + "\n");

        for(Menu menu : menuList){
            menu.stampaMenu(TipoColori.BLUE, TipoColori.GREEN, TipoColori.YELLOW);
        }
    }

    public void prenota(Clienti cliente, Prenotazione prenotazione){
       LocalDate data = prenotazione.getData();
       int postiRichiesti = prenotazione.getNumeroPersone();

       numeroPostiDisponibili.putIfAbsent(data, 50);

       if (numeroPostiDisponibili.get(data) < postiRichiesti){
           System.out.println("Mi dispiace, non ci sono posti per la data richiesta");
       } else {
           numeroPostiDisponibili.put(data, numeroPostiDisponibili.get(data) - postiRichiesti);
           prenotazioniList.add(prenotazione);
           System.out.println("Prenotazione effettuata per il cliente: " + prenotazione.getCliente().getNome()
                                + "\nData: " + data
                                + "\nPosti prenotati: " + postiRichiesti);
       }
    }

    public void stampaMenuTipo(TipoDieta tipo){
        for(Menu menu : menuList){
            if(menu.getTipoMenu().equals(tipo)){
                menu.stampaMenu(TipoColori.BLUE, TipoColori.GREEN, TipoColori.YELLOW);
            }
        }
    }

    public void stampaPrenotazioni(){
        System.out.println("LISTA PRENOTAZIONI");
        for (Prenotazione prenotazione : prenotazioniList){
            System.out.println("Nome cliente: " + prenotazione.getCliente().getNome()
                                + "\nData prenotazione: " + prenotazione.getData()
                                + "\nNumero persone prenotate: " + prenotazione.getNumeroPersone());
        }

    }
}
