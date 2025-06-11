import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();
    private String txtPath;

    public EmployeeManager(String txtPath) {
        this.txtPath = txtPath;
        loadEmployees();
    }

    public void loadEmployees() {
        Path sorgente = Paths.get(txtPath);
        try {
            List<String>lines = Files.readAllLines(sorgente);
            for(String line : lines){
                try{
                    String[] riga = line.split(";");
                    this.employees.add(new Employee(riga[1],Double.parseDouble(riga[0])));
                } catch (Exception e){
                    continue;
                }
            }
        } catch (IOException e) {
            System.out.println(("Il file con la lista di impiegati non è stato trovato"));
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getTxtPath() {
        return txtPath;
    }

    public void setTxtPath(String txtPath) {
        this.txtPath = txtPath;
    }

    public double getAvarageSalary() {
        double avarage = 0;
        int conta = 0;
        for(Employee employee : employees){
            avarage += employee.getSalary();
            conta++;
        }
        avarage /= conta;
        return avarage;
    }
}
