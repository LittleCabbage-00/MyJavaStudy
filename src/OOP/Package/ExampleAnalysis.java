package OOP.Package;

//实例分析
class Student{                          //定义学生类
    private String stuwhat;
    private String name;
    private float math;
    private float english;
    private float computer;
    public Student(String stuwhat, String name, float math, float english, float computer){
        this.setStuwhat(stuwhat);
        this.setName(name);
        this.setMath(math);
        this.setEnglish(english);
        this.setComputer(computer);
    }
    public void setStuwhat(String s){
        stuwhat=s;
    }
    public void setName(String n){
        name=n;
    }
    public void setMath(float m){
        math=m;
    }
    public void setEnglish(float e){
        english=e;
    }
    public void setComputer(float c){
        computer=c;
    }
    public String getStuwhat(){
        return  stuwhat;
    }
    public String getName(){
        return name;
    }
    public float getMath(){
        return math;
    }
    public float getEnglish(){
        return english;
    }
    public float getComputer(){
        return computer;
    }
    public float sum(){
        return math+english+computer;
    }
    public float avg(){
        return this.sum()/3;
    }
    public float max(){
        float max=math;
        max= Math.max(max, computer);
        max= Math.max(max,english);
        return max;
    }
    public float min(){
        float min=math;
        min=Math.min(min,computer);
        min=Math.min(min,english);
        return min;
    }
}
public class ExampleAnalysis {
    public static void main(String[] args){
        Student stu=new Student("WBZD-001","Tom",60.0f,59.0f,61.0f);
        //实例化Student对象并构造方法赋值
        System.out.println("Number: "+stu.getStuwhat());
        System.out.println("Name: "+stu.getName());
        System.out.println("Math score: "+stu.getMath());
        System.out.println("English score: "+stu.getEnglish());
        System.out.println("Computer score: "+stu.getComputer());
        System.out.println("All score: "+stu.sum());
        System.out.println("Average: "+stu.avg());
        System.out.println("Max is: "+stu.max());
        System.out.println("Min is: "+stu.min());

    }
}
