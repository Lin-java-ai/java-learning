import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee>employees = new ArrayList<>();

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public void printAllSalary(){
        for (Employee e : employees){
            System.out.println(e.getName() + "的工资：" + e.calculateSalary());
        }
    }
}
