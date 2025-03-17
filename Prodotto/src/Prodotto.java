public class Prodotto {
    private String nome;
    private int codice ;
    private int quantita;
    private double prezzo;

    public Prodotto(String nome, int codice, int quantita, double prezzo) {
        this.nome = nome;
        this.codice = codice;
        this.quantita = quantita;
        this.prezzo = prezzo;
    }


    public String aggiornaQuantita(int qt) {
        if ((quantita + qt) < 0) {
            return "Impossibile aggiornare quantità, risultato minore di 0";
        } else {
            quantita += qt;
            return "Quantita aggiornata: " + quantita;
        }

    }

    public Double calcolaValoreTotale() {
        return quantita * prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Nome= " + nome + "\n" +
                "codice= " + codice + "\n" +
                "quantita= " + quantita + "\n" +
                "prezzo= " + prezzo + "\n" +
                "Valore Totale= " + (Math.floor(calcolaValoreTotale() * 100) / 100) + "\n";
    }
}
