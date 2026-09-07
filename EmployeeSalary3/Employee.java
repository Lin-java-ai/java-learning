package EmployeeSalary3;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    //父类构造：两个参数，没有无参构造
    public Employee(String name,double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //抽象方法，子类必须重写
    public abstract double calculateSalary();

    public String getName(){
        return name;
    }
}
