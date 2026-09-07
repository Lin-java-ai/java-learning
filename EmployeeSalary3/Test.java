package EmployeeSalary3;

public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager("张三",4000,750);
        m1.checkIn();
        System.out.println(m1.getName() + "工资：" + m1.calculateSalary());

        Manager m2 = new Manager("李四",5000,1200);
        m2.checkIn();
        System.out.println(m2.getName() + "工资：" + m2.calculateSalary());
    }
}
