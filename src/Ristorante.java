import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String nome;
    private String nomeChef;
    private List<Menu> menuList;

    public Ristorante(String nome, String nomeChef){
        this.nome = nome;
        this.nomeChef = nomeChef;
        this.menuList = new ArrayList<>();
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
        System.out.println(TipoColori.RED_BOLD_BRIGHT.colorize("Benvenuti al ristorante " + this.nome) +
                "\nChef del ristorante: " + this.nomeChef + "\n");

        for(Menu menu : menuList){
            menu.stampaMenu();
        }
    }
}
