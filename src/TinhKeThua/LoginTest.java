package TinhKeThua;

public class LoginTest extends BaseTest{

    public void testLoginFail(){
        createBrowser();
        System.out.println("Vào URL...");
        System.out.println("Điền email...");
    }

    public void testLoginSuccess(){
        createBrowser();
        System.out.println("Vào URL...");
        System.out.println("Điền email...");
    }

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.testLoginFail();
    }

}
