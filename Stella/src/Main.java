//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Star s1 = new Star();
        System.out.println(s1.toString());
        Star s2 = new Star("Sun", 3.28E26, 1.9885E30, 1.41E18, 4.6E9);
        System.out.println(s2.toString());

    }
}