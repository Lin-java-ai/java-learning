package EmployeeSalary;

import java.util.ArrayList;

public class EmployeeManager {
    //集合的类型是父类Employee，可以存放所有子类对象
    private ArrayList<Employee> employees = new ArrayList<>();

    //添加员工：形参是父类Employee，传子类对象会自动向上转型
    public void addEmployee(Employee e){
        employees.add(e);
    }

    //打印所有员工工资
    public void printAllSalary(){
        for (Employee e : employees){
            //重点：e是父类引用，但调用的是实际对象的重写方法
            System.out.println(e.getName() + "的工资：" + e.calculateSalary());
        }
    }
}

//
//1. 向上转型
//ArrayList<Employee> 里可以装SalariedEmployee、HourlyEmployee对象，因为子类对象可以自动赋值给父类引用。
//简单理解：“月薪员工是员工”“时薪员工也是员工”，所以都能放进员工集合里。
//
//2. 动态绑定（多态核心）循环里 e.calculateSalary() 遵循规则：编译看左边，运行看右边
//◦ 编译时：编译器只看e是Employee类型，只要Employee里有calculateSalary()就不报错
//◦ 运行时：看e实际指向的对象是哪个子类，就执行哪个子类的重写方法
//◦ 指向SalariedEmployee → 返回月薪
//◦ 指向HourlyEmployee → 返回时薪×工时
//
//3. 好处：新增一类员工（比如销售员工），只需要写新的子类继承Employee并重写方法，不需要修改EmployeeManager的代码——开闭原则。