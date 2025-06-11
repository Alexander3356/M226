import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager("ListaImpiegati.txt");
        boolean contiuna = true;
        while (contiuna) {
            Scanner sc = new Scanner(System.in);
            System.out.println("(1) Visualizza percorso txt");
            System.out.println("(2) Visualizza lista degli impiegati");
            System.out.println("(3) Visualizza stipendio medio");
            System.out.println("(4) Esci");
            System.out.println("Inserisci opzione:");
            String input = sc.next();
            if (input.equals("1")) {
                System.out.println(manager.getTxtPath());
            } else if (input.equals("2")) {
                List<Employee> employees = manager.getEmployees();
                for (Employee employee : employees) {
                    System.out.print(employee);
                }
            } else if (input.equals("3")) {
                System.out.println("Stipendio medio: " + manager.getAvarageSalary() + " FR");
            } else if (input.equals("4")) {
                contiuna = false;
            } else {
                System.out.println("input non valido");
            }
        }

    }
}