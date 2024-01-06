package ObjectClass;

public class Employee {

    String id;
    String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showInfoEmployee(){
        System.out.println(id);
        System.out.println(name);

        Company company = new Company();
        System.out.println(company.getCompanyName());
        System.out.println(company.getCompanyPhone());
        System.out.println(company.getCompanyAddress());
    }

    public static void main(String[] args) {

        Employee employee = new Employee("E001","Yến");
        employee.showInfoEmployee();

        System.out.println("===============");

        Employee employee2 = new Employee("E002","Hào");
        employee2.showInfoEmployee();

    }

}
