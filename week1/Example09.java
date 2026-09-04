package week1;

import java.util.Scanner;

public class Example09 {
    /**
     * 根据客户输入的月份1-12,输出对应的季节，春3-5，夏6-8，秋9-11，冬12-2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int month = sc.nextInt();

        if (month >= 3 && month <= 5 ){
            System.out.println("春季");
        } else if (month >= 6 && month <= 8) {
            System.out.println("夏季");
        } else if (month >= 9 && month <= 11) {
            System.out.println("秋季");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("冬季");
        }
        sc.close();
    }
}
