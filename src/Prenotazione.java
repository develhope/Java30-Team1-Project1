import java.time.LocalDate;

public class Prenotazione {
    private Clienti cliente;
    private LocalDate data;
    private int numeroPersone;

    public Prenotazione(Clienti cliente, LocalDate data, int numeroPersone) {
        this.cliente = cliente;
        this.data = data;
        this.numeroPersone = numeroPersone;
    }

    public Clienti getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setCliente(Clienti cliente) {
        this.cliente = cliente;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }
}
