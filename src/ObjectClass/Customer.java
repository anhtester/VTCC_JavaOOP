package ObjectClass;

public class Customer {
    String id;
    String name;
    int age;
    String phone;

    private String companyName = "Viettel VTCC";

    //Hàm xây dựng
    //Chạy trước những hàm khác khi khởi tạo Class
    //Dùng để khởi tạo giá trị cho các biến lưu trữ
    public Customer(String id, String name, int age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    //Hàm xây dựng khác nhau số lượng tham số
    public Customer(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = "123456";
    }

    public Customer() {
    }

    //Hàm xây dựng khác nhau kiểu dữ liệu của tham số
    public Customer(String param1, String param2, String param3) {

    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("COmpany: " + companyName);
    }

    public static void main(String[] args) {

        //Tạo đối tượng class
        Customer customer1 = new Customer("001", "Lan", 30, "123456");
        Customer customer2 = new Customer("002", "Huệ", 20, "45678");
        Customer customer3 = new Customer("003", "Đức", 40, "56789");

        customer1.showInfo();
        System.out.println("================");
        customer2.showInfo();
        System.out.println("================");
        customer3.showInfo();

        System.out.println("================");
        Customer customer4 = new Customer("003", "Đức", 40);
        customer4.showInfo();

        System.out.println("================");
        Customer customer5 = new Customer();
        customer5.showInfo();
    }

}
