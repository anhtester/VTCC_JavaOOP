package TinhKeThua;

public class Student2 extends Person{

    public Student2(String name, int age, float height) {
        super(name, age, height);
    }

    //Hàm ở class con
    public void getInfo(){
        //super.getInfo(); //Hàm ở class Cha
        System.out.println("Đây là class con");
    }

    public static void main(String[] args) {
        Student2 student2 = new Student2("Phương", 35, 170);
        student2.getInfo();

    }
}
