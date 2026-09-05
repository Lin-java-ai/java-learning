package EmployeeSalary;

public class HourlyEmployee extends Employee{
    private double hourlyRate; //时薪
    private int hoursWorked; //工作时长

    public HourlyEmployee(String name, double hourlyRate, int hoursWorked){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }


       // 和月薪员工结构完全一致，只是重写后的计算逻辑不同——这就是多态的基础：同一个方法名，不同子类有不同实现。
}
