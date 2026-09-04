package week1;

public class Example05 {
    /**
     * while循环 1-100累加和
     */
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100){
            sum += i;
            i++;
        }
        System.out.println("1-100累加和：" + sum);
    }

}
