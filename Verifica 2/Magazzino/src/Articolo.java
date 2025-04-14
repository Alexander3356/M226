public class Articolo {

    private String nome;
    private Produttore produttore;
    private int dataProduzione;
    private String descrizione;
    private int quantita;
    private String identificatore;

    public Articolo(String nome, Produttore produttore, int dataProduzione, String descrizione, int quantita) {
        this.nome = nome;
        this.produttore = produttore;
        this.dataProduzione = dataProduzione;
        this.descrizione = descrizione;
        this.quantita = quantita;
        setIdentificatore();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try {
            this.nome = nome;
        } catch (NullPointerException e) {
            System.out.println("nome non valido");
        }
    }

    public Produttore getProduttore() {
        return produttore;
    }

    public void setProduttore(Produttore produttore) {
        try {
            this.produttore = produttore;
        } catch (NullPointerException e) {
            System.out.println("produttore non valido");
        }
    }

    public int getDataProduzione() {
        return dataProduzione;
    }

    public void setDataProduzione(int dataProduzione) {
        this.dataProduzione = dataProduzione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public String getIdentifier() {
        return identificatore;
    }

    public void setIdentificatore() {
        this.identificatore = this.nome.charAt(0) + "" + this.produttore.getNome().charAt(0) + this.dataProduzione;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.produttore.getNome() + " - " + this.identificatore;
    }
}
