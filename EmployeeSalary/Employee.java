package EmployeeSalary;

public class Employee {
    protected String name; //员工姓名

    //父类构造方法，给name赋值
    public Employee(String name){
        this.name = name;
    }

    //通用工资计算方法：父类只定义“有这个方法”具体逻辑由子类重写
    public double calculateSalary(){
        return 0;
    }

    //对外提取获取name的方法（封装）
    public String getName(){
        return name;
    }

    //1. protected 权限：比private宽松，子类可以直接访问，同包其他类也能访问；如果写成private，子类就必须通过getName()才能拿到name。
    //
    //2. 父类只有有参构造，子类构造必须手动写super(name)调用，否则编译报错。
    //
    //3. calculateSalary()在父类里是“空实现”：因为不同员工工资算法不一样，父类只规定“所有员工都能算工资”，具体算法交给子类重写。
}
