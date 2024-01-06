package TinhDongGoi;

public class VietinBank {

    private String companyName;
    private String address;
    private double laiSuat;
    private int namThanhLap;

    public VietinBank() {
    }

    public VietinBank(String companyName, String address, double laiSuat, int namThanhLap) {
        this.companyName = companyName;
        this.address = address;
        this.laiSuat = laiSuat;
        this.namThanhLap = namThanhLap;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

//    public void setLaiSuat(double laiSuat) {
//        this.laiSuat = laiSuat;
//    }

    public int getNamThanhLap() {
        return namThanhLap;
    }

//    public void setNamThanhLap(int namThanhLap) {
//        this.namThanhLap = namThanhLap;
//    }
}
