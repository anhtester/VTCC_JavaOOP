package TinhDaHinh;

public class LoginTest {

    public void testLoginWithEmailInvalid(){
        NapChong napChong = new NapChong();
        napChong.createBrowser(2);

        System.out.println("Open URL");
        System.out.println("Set email");
        System.out.println("Set password");
        System.out.println("Click login");
    }

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.testLoginWithEmailInvalid();
    }
}
