package demo.cycle;

public class Example04 {
    /**
     * switch语句
     */
    public static void main(String[] args) {
        //假设今天为周三
        int dayOfWeek = 3;

        switch (dayOfWeek){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("无效日期");
                break;

        }
    }
}
