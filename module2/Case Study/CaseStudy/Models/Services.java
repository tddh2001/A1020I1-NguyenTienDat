package CaseStudy.Models;

public abstract class Services {
    String tenDichVu;
    int dienTichSuDung;
    int chiPhiThue;
    int soLuongNguoiMax;
    String kieuThue;

    public Services(String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoiMax, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiMax = soLuongNguoiMax;
        this.kieuThue = kieuThue;
    }
    public Services(){
    }

    public Services(String tieuChuanPhong, String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoiMax, String kieuThue) {

    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(int dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiMax() {
        return soLuongNguoiMax;
    }

    public void setSoLuongNguoiMax(int soLuongNguoiMax) {
        this.soLuongNguoiMax = soLuongNguoiMax;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

}
