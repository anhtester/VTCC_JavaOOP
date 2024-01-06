package TinhDongGoi;

public class Customer {
    public static void main(String[] args) {

        VietinBank vietinBank = new VietinBank("Vietinbank", "Hà Nội", 5.5, 1980);

        vietinBank.setCompanyName("Vietin Bank 2023");
        System.out.println(vietinBank.getCompanyName());

    }
}
