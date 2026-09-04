public class GraduateStudent extends Student{
    public String thesisTitle; //论文题目

    //构造方法：用super调用父类构造
    public GraduateStudent(String name,int age,double score,String thesisTitle){
        super(name,age,score);//调用父类
        this.thesisTitle = thesisTitle;
    }

    //gettet/setter for theseTitle

    //重写toSrting():输出父类信息 + 论文题目
    @Override
    public String toString(){
        return super.toString() + ",thesisTitle='" + thesisTitle + "'";
    }
}
