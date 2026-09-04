public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student("张三",20,85);
        System.out.println(s);

        s.setAge(-5);//应该报错
        s.setAge(200);//应该报错
        s.setAge(25);//正常修改
        System.out.println(s);
    }
}
