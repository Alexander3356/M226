/**
 * Applicazione per calcolare area, perimetro e diagonale di un rettangolo
 *
 * @author Alexander Mascaro
 * @version Marzo 2025
 */


public class Rettangolo {

    private int minore;
    private int maggiore;

    public Rettangolo(int minore, int maggiore) {
        this.minore = minore;
        this.maggiore = maggiore;
    }

    public Rettangolo() {
        this.minore = 5;
        this.maggiore = 7;
    }

    /**
     * Calcola l'area del rettangolo
     *
     * @return risultato moltiplicazione di lato minore e maggiore
     */
    public int getArea() {
        return minore * maggiore;
    }

    /**
     * Calcola il perimetro del rettangolo
     *
     * @return risultato della somma di lato minore x2 e lato maggiore x2
     */
    public int getPerimetro() {
        return (minore * 2 + maggiore * 2);
    }

    /**
     * Calcola la diagonale del rettangolo
     *
     * @return risultato della radice di lato minore alla seconda + lato maggiore alla seconda
     */
    public int getDiagonale() {
        return  (int)Math.sqrt(Math.pow(minore, 2) + Math.pow(maggiore, 2));
    }

    /**
     * Scrive i dati del rettangolo
     *
     * @return i dati
     */
    @Override
    public String toString() {
        if (minore < maggiore) {
            return  "\nDimensioni: " + maggiore + "x" + minore
                    + "\nArea = " + getArea()
                    + "\nPerimetro = " + getPerimetro()
                    + "\nDiagonale = " + getDiagonale();
        } else {
            return "\nIl lato maggiore deve essere più grande di quello minore";
        }
    }

    public int getMinore() {
        return minore;
    }

    public void setMinore(int minore) {
        this.minore = minore;
    }

    public int getMaggiore() {
        return maggiore;
    }

    public void setMaggiore(int maggiore) {
        this.maggiore = maggiore;
    }
}
