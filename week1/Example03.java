package week1;

public class Example03 {
    /**
     * if条件语句
     */
    public static void main(String[] args) {
        int score = 92;

        //使用多分支if-else语句来判断成绩等级
        if(score >= 90){
            System.out.println("A");
        }else if (score >= 80){
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        }else {
            System.out.println("不及格");
        }
    }
}
