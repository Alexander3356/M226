
public class Main {
    public static void main(String[] args) {

        Planet terra = new Planet("Terra", 5.972E24, 1.0832E21, 5514, 6371000, true, 8.0E9, false, 30);
        System.out.println(terra.toString());
        Planet marte = new Planet("Marte", 6.4171E23, 1.6318E20, 3933, 3389500, false, 0, false, 15);
        System.out.println(marte.toString());
        Planet saturno = new Planet("Saturno", 5.6834E26, 8.2713E23, 687, 58232000, false, 0, true, 47);
        System.out.println(saturno.toString());
    }
}