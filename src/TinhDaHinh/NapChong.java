package TinhDaHinh;

public class NapChong {

    private String browser = "Edge";

    public void createBrowser() {
        System.out.println("Chạy với " + browser + " mặc định");
    }

    public void createBrowser(String browserName) {
        System.out.println("Chạy với trình duyệt: " + browserName);
    }

    public void createBrowser(int browserIndex) {
        if (browserIndex == 1) {
            System.out.println("Chạy với trình duyệt CHROME");
        } else if (browserIndex == 2) {
            System.out.println("Chạy với trình duyệt EDGE");
        } else {
            System.out.println("Chạy với trình duyệt FIREFOX");
        }

    }

}
