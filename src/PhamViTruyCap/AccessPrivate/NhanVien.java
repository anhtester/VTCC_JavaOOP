package PhamViTruyCap.AccessPrivate;

public class NhanVien {

    public String name = "Đạt";
    private String birthday = "12/12/2023";

    public String getName(){
        return name;
    }

    private String getBirthday(){
        return birthday;
    }

    public void showInfo(){
        getName();
        getBirthday();
        System.out.println(name);
        System.out.println(birthday);
    }
}
