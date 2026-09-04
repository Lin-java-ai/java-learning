package demo.cycle;

public class Example02 {
    /**
     * 变量的访问
     */
    //成员变量
    static String memberUseName = "admin";
    static  boolean memberIsStudent = true;

    public static void main(String[] args) {
        //局部变量
        String localUsername = "localUser";
        boolean localIsStudent = false;

        //访问和修改成员变量
        System.out.println("Member Username:" + memberUseName);
        memberIsStudent = false;//修改成员变量的值
        System.out.println("Member Is Student:" + memberIsStudent);

        //访问和修改局部变量
        System.out.println("Local Username:" + localUsername);
        localIsStudent = true;//修改局部变量的值
        System.out.println("Local Is Student ;" + localIsStudent);
    }
}
