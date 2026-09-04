package demo.cycle;

public class Example10 {
    /**
     * 用for循环计算并输出1-10的偶数的和
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("1-10偶数和为：" + sum);
    }
}
