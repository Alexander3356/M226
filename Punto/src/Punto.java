public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 1.0;
        this.y = 1.0;
    }

    public double calcolaDistanza(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public String determinaQuadrante() {
        if (this.x >= 0 && this.y >= 0) {
            return "Quadrante =  1";
        }
        if (this.x < 0 && this.y >= 0) {
            return "Quadrante =  2";
        }
        if (this.x < 0 && this.y <= 0) {
            return "Quadrante =  3";
        }
        if (this.x >= 0 && this.y < 0) {
            return "Quadrante =  4";
        }
        return "";
    }

    @Override
    public String toString() {
        return "Coordinate: x = " + x + ", y = " + y
        + "\nDistanza dal centro: " + calcolaDistanza()
                + "\nQuadrante: " + determinaQuadrante() + "\n";

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
