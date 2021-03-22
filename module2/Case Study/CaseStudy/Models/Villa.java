package CaseStudy.Models;

public class Villa extends Services {

    String tieuChuanPhong;
    String moTaTienNghiKhac;
    int dienTichHoBoi;
    int soTang;

    public Villa(String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoiMax, String kieuThue, String tieuChuanPhong, String moTaTienNghiKhac, int dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tieuChuanPhong, String moTaTienNghiKhac, int dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa() {

    }

    public Villa(String tieuChuanPhong, String moTaTienNghiKhac, int dienTichHoBoi, int soTang, String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoiMax, String kieuThue) {

    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public int getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(int dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghiKhac='" + moTaTienNghiKhac + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiMax=" + soLuongNguoiMax +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public String getInfo(){
        return tieuChuanPhong+ ","+moTaTienNghiKhac+ ","+dienTichHoBoi+ ","+soTang+ ","+tenDichVu+ ","+dienTichSuDung+ ","+chiPhiThue+ ","+soLuongNguoiMax+ ","+kieuThue;
    }
}
