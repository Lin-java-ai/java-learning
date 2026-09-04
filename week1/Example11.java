package week1;

public class Example11 {
    /**
     * 用while遍历1-10之间的偶数，并在遇到5时跳过（不输出），在遇到7时终止循环
     */
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            if (i == 5){
                continue;
            }
            if (i == 7){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
