package JianZhiOffer.Q11;

public class TextUser01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student stu = new Student (2077, "xx",18);
        stu.rest();
        stu.breaking();
        System.out.println(stu);
        System.out.println(stu instanceof Person);
    }
}
class Person{
    int id;
    String name;
    public void rest() {
        System.out.println("Have a rest!");
    }
}
class Student extends Person{
    int age;
    public void breaking() {
        System.out.println("for 10 minutes");
    }
    public Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
