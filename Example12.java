package demo.cycle;

public class Example12 {
    /**
     * 输出1-100之间所有偶数，每行输出5个数字
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2;i <= 100;i+=2){
            System.out.print(i + " ");
            count++;
            if (count % 5 == 0){
                System.out.println();
            }else {
                System.out.print("");
            }
        }
    }
}
