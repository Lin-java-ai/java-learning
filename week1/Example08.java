package week1;

import java.util.Scanner;

public class Example08 {
    /**
     * 输入两个整数，判断大小
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int a = sc.nextInt();

        System.out.println("请输入第二个数：");
        int b = sc.nextInt();

        if (a > b){
            System.out.println("这个大");
        }else {
            System.out.println("这个大");
        }
        sc.close();
    }
}
