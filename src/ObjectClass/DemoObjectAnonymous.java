package ObjectClass;

public class DemoObjectAnonymous {

    String name;
    int age;
    String address;

    public DemoObjectAnonymous(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public DemoObjectAnonymous(String name) {
        this.name = name;
    }

    public DemoObjectAnonymous() {
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        //Cách khai báo chuẩn
        DemoObjectAnonymous objectAnonymous = new DemoObjectAnonymous("Hà", 30, "Hà Nội");
        objectAnonymous.showInfo();
        objectAnonymous.getName();

        //Khai báo kiểu ẩn danh (không có tên đối tượng)
        new DemoObjectAnonymous("Phương", 25, "Đà Nẵng").showInfo();
        System.out.println(new DemoObjectAnonymous().getName());
    }
}
