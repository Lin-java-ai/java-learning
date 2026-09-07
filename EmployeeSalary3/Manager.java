package EmployeeSalary3;

//继承父类 + 实现接口
public class Manager extends Employee implements CheckInable{
    private double bonus;

    //子类构造：super必须传name和baseSalary
    public Manager(String name,double baseSalary,double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }

    @Override
    public void checkIn(){
        System.out.println("经理打卡：进入行政系统");
    }
}
