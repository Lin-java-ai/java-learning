package week1;

public class Test {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new SalariedEmployee("张三",8000));
        manager.addEmployee(new HourlyEmployee("李四",50,160));
        manager.addEmployee(new SalariedEmployee("王五",8000));

        manager.printAllSalary();
    }
}
