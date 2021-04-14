package CaseStudy.Models;

public class House extends Services {

    String tieuChuanPhong;
    String moTaTienNghiKhac;
    int soTang;

    public House(String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoiMax, String kieuThue, String tieuChuanPhong, String moTaTienNghiKhac, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiMax, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    public House(String tieuChuanPhong, String moTaTienNghiKhac, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    public House() {

    }

    public House(String tieuChuanPhong, String moTaTienNghiKhac, int soTang, String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoiMax, String kieuThue) {

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

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghiKhac='" + moTaTienNghiKhac + '\'' +
                ", soTang=" + soTang +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiMax=" + soLuongNguoiMax +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public String getInfo(){
        return tieuChuanPhong+ ","+moTaTienNghiKhac+ ","+soTang+ ","+tenDichVu+ ","+dienTichSuDung+ ","+chiPhiThue+ ","+soLuongNguoiMax+ ","+kieuThue;
    }
}
