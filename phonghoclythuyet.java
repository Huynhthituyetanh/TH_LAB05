package javaapplication123;

public class PhongHocLyThuyet extends PhongHoc{
 private Boolean coMayChieu;

 public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, Boolean coMayChieu) {
  super(maPhong, dayNha, dienTich, soBongDen);
  this.coMayChieu = coMayChieu;
 }

    PhongHocLyThuyet(String lT001, String nha_A, int i, int i0, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 public boolean isCoMayChieu() {
  return coMayChieu;
 }

 @Override
 public String toString() {
  return "PhongHocLyThuyet{" +
                "maPhong='" + getMaPhong() + '\'' +
                ", dayNha='" + getDayNha() + '\'' +
                ", dienTich=" + getDienTich() +
                ", soBongDen=" + getSoBongDen() +
                ", coMayChieu=" + coMayChieu +
                '}';
 }
 
}
