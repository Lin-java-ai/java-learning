public class Student {
    private String name;
    private  int age ;
    private  double score;

    //构造方法
    public Student(String name,int age,double score){
        this.name = name; //this.name是属性，name是餐数
        setAge(age); // 调用下面setAge方法，自带校验，不重复写逻辑
        this.score = score;
    }

    //getter方法
    public String getName() {
        return name;
    }
    public int getAge(){
        return  age;
    }
    public double getScore(){
        return score;
    }

    //setter方法

    public void setName(String name) {
        this.name =  name;
    }
    public void setScore(double score){
        this.score = score;
    }
    public void setAge(int age){
        if (this.age > 0 && this.age < 150){
            this.age = this.age;
        }else {
            System.out.println("年龄输出错误!" + this.age);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
