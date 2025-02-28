import java.time.LocalDate;

public class Prenotazione {
    private Clienti cliente;
    private String data;
    private int numeroPersone;

    public Prenotazione(Clienti cliente, String data, int numeroPersone) {
        this.cliente = cliente;
        this.data = data;
        this.numeroPersone = numeroPersone;
    }

    public Clienti getCliente() {
        return cliente;
    }

    public String getData() {
        return data;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setCliente(Clienti cliente) {
        this.cliente = cliente;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }
}
