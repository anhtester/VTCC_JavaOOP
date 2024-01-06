package PhamViTruyCap.Common;

import PhamViTruyCap.AccessDefault.Company;
import PhamViTruyCap.AccessProtected.Student;
import PhamViTruyCap.AccessPublic.Hyundai;

public class ThongTinChung extends Student{

    public void getInfo(){
        showInfo();
        System.out.println(name);
    }

    public static void main(String[] args) {

        Company company = new Company();
        company.displayInfo();

        //Student student = new Student();
        //student.showInfo();

        Hyundai hyundai = new Hyundai();
        hyundai.showInfo();

    }

}
