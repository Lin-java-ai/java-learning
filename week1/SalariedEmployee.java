package week1;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name,double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
