public class Square {

    private int lato;

    public Square(int lato) {
        this.lato = lato;
    }
    public Square() {
        this.lato = 5;
    }

    public int getArea() {
        return lato * lato;
    }

    public int getPerimeter() {
        return lato * 4;
    }

    public void draw() {
        for (int i = 1; i <= lato; i++){ //ciclo per le righe

            if (i == 1 || lato == i){
                for (int j = 1; j <= lato; j++){ // ciclo per le colonne per prima e ultima riga
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= lato; j++){ // ciclo per le colonne per le righe in mezzo
                    if (j == 1 || lato == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); // per andare a capo
        }
    }

    public String getDimension() {
        return "Quadrato " + lato + " x " + lato;
    }

    @Override
    public String toString() {
        return "Area = " + getArea()
                + "\nPerimetro = " + getPerimeter()
                + "\n" + getDimension();
    }

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }
}
