package EmployeeSalary;

public class SalariedEmployee extends Employee{
    private double monthSalary; //月薪-子类特有属性

    //子类构造
    public SalariedEmployee(String name, double monthSalary){
        super(name); //第一行调用父类有参构造，给name赋值
        this.monthSalary = monthSalary; //给子类自己的属性赋值
    }

    //重写父类的工资计算方式
    @Override
    public double calculateSalary(){
        return monthSalary; //月薪员工：直接返回月薪
    }


//        1. extends Employee：继承父类，子类自动拥有父类的name、getName()、calculateSalary()。
//        2. super(name)： 必须写在子类构造方法第一行◦ 作用：把name参数传给父类构造，完成父类部分的初始化
//        3. @Override：注解，标记这个方法是重写父类的方法；写错方法名/参数时编译器会报错提醒。
}
