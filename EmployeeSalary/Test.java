package EmployeeSalary;

public class Test {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        //添加不同类型的员工，大神子类对象，自动向上转型
        manager.addEmployee(new SalariedEmployee("张三",8000));
        manager.addEmployee(new HourlyEmployee("李四",50,160));
        manager.addEmployee(new SalariedEmployee("王五",8000));

        manager.printAllSalary();
    }
}

//        1. 继承：子类拥有父类非私有成员，extends关键字。
//
//        2. super：调用父类构造必须在第一行；父类无无参构造时，子类必须手动传参调用。
//
//        3. 方法重写：方法名、参数列表、返回值必须和父类一致；访问权限不能比父类更严格。
//
//        4. 向上转型：子类对象 → 父类引用，自动完成；缺点是不能直接调用子类特有的方法。
//
//        5. 多态：同一个方法调用，不同对象表现出不同行为；前提是：继承 + 方法重写 + 父类引用指向子类对象。
//
//        6. protected：子类、同包可访问，区别于private（仅本类）和public（全公开）。