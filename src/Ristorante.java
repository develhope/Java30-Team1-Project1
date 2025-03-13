import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ristorante {
    private String nome;
    private String nomeChef;
    private List<Menu> menuList;
    private List<Prenotazione> prenotazioniList;
    private Integer capienzaMassima;

    public Ristorante(String nome, String nomeChef, Integer capienzaMassima) {
        this.nome = nome;
        this.nomeChef = nomeChef;
        this.menuList = new ArrayList<>();
        this.prenotazioniList = new ArrayList<>();
        this.capienzaMassima = capienzaMassima;
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public void removeMenu(Menu menu) {
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

    public Integer getCapienzaMassima() {
        return capienzaMassima;
    }

    public void setCapienzaMassima(Integer capienzaMassima) {
        this.capienzaMassima = capienzaMassima;
    }

    public void stampaRistorante() {
        System.out.println(TipoColori.RED.colorize("Benvenuti al ristorante " + this.nome) +
                "\nChef del ristorante: " + this.nomeChef + "\n");

        for (Menu menu : menuList) {
            menu.stampaMenu(TipoColori.BLUE, TipoColori.GREEN, TipoColori.YELLOW);
        }
    }

    // TODO diversificare i colori per le due Liste.
    public void prenota(Clienti cliente, Prenotazione prenotazione) {
        //1- schiaccio il punsante prenota mi arrivano due oggetti : GinoCliente, PrenotazioneGino
        //2- la lista delle prenotazioni deve aggiungere la prenotazione se c'è ancora posto
        if (prenotazione.getNumeroPersone() >= capienzaMassima) {
            System.out.println(TipoColori.RED.colorize("PRENOTAZIONI NON ACCETTATE"
                    + "\nNome cliente: " + prenotazione.getCliente().getNome()
                    + "\nData prenotazione: " + prenotazione.getData()
                    + "\nNumero persone prenotate: " + prenotazione.getNumeroPersone()
                    + "\nNon ci sono Posti Disponibili, Mi dispiace!"));
        } else {
            //qui modelliamo lo stato in base alla business logic
            this.prenotazioniList.add(prenotazione);
            this.capienzaMassima -= prenotazione.getNumeroPersone();
        }

    }

    public void stampaMenuTipo(TipoDieta tipo) {
        for (Menu menu : menuList) {
            if (menu.getTipoMenu().equals(tipo)) {
                menu.stampaMenu(TipoColori.BLUE, TipoColori.GREEN, TipoColori.YELLOW);
            }
        }
    }

    public void stampaPrenotazioni() {
        System.out.println(TipoColori.CYAN.colorize("LISTA PRENOTAZIONI"));
        for (Prenotazione prenotazione : prenotazioniList) {
            System.out.println(TipoColori.CYAN.colorize("Nome cliente: " + prenotazione.getCliente().getNome()
                    + "\nData prenotazione: " + prenotazione.getData()
                    + "\nNumero persone prenotate: " + prenotazione.getNumeroPersone()));
        }

    }
}
