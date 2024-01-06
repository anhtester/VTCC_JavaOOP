package TinhKeThua;

//Class Con
public class Student extends Person{
    public Student(int age, float height, String name) {
        //super(name);
        super(name, age, height); //Quan tâm chổ này thôi, phải đúng cấu trúc
    }

    public void cloneInfoFromParent(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        getInfo();
    }

    public static void main(String[] args) {
        Student student = new Student(30, 165, "Linh");
        student.cloneInfoFromParent();

    }
}
