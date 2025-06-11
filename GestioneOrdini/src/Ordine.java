import java.util.Objects;

public class Ordine {

    private Cliente cliente;
    private Prodotto prodotto;
    private int quantita;
    private String stato;
    private double prezzoTotale;
    private String dataSpedizione;


    public Ordine(Cliente cliente, Prodotto prodotto, int quantita, String stato, String dataSpedizione) {
        this.cliente = cliente;
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.stato = stato;
        this.prezzoTotale = prodotto.getPrezzo() * quantita;
        this.dataSpedizione = dataSpedizione;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public double getPrezzoTotale() {
        return prezzoTotale;
    }

    public void setPrezzoTotale(double prezzoTotale) {
        this.prezzoTotale = prezzoTotale;
    }

    public String getDataSpedizione() {
        return dataSpedizione;
    }

    public void setDataSpedizione(String dataSpedizione) {
        this.dataSpedizione = dataSpedizione;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordine ordine = (Ordine) o;
        return quantita == ordine.quantita && Double.compare(prezzoTotale, ordine.prezzoTotale) == 0 && Objects.equals(cliente, ordine.cliente) && Objects.equals(prodotto, ordine.prodotto) && Objects.equals(stato, ordine.stato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, prodotto, quantita, stato, prezzoTotale);
    }

    @Override
    public String toString() {
        if (dataSpedizione != "") {
            return "cliente: " + cliente.getId() + " " + cliente.getNome() + " " + cliente.getCognome() +
                    ", prodotto: " + prodotto.getNome() +
                    ", quantita: " + quantita +
                    ", stato: " + stato +
                    ", prezzo totale: " + prezzoTotale +
                    ", data spedizione: " + dataSpedizione;
        } else {
            return "cliente: " + cliente.getId() + " " + cliente.getNome() + " " + cliente.getCognome() +
                    ", prodotto: " + prodotto.getNome() +
                    ", quantita: " + quantita +
                    ", stato: " + stato +
                    ", prezzo totale: " + prezzoTotale;
        }
    }
}
