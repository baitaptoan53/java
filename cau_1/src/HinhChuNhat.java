import java.util.Scanner;

public class HinhChuNhat extends HinhKhoi {
                   private int chieuDai;
                   private int chieuRong;

                   public HinhChuNhat(int chieuDai, int chieuRong) {
                                      this.chieuDai = chieuDai;
                                      this.chieuRong = chieuRong;
                   }

                   public HinhChuNhat() {
                                      this.chieuDai = chieuDai;
                                      this.chieuRong = chieuRong;
                   }

                   @Override
                   public int tinhDienTich() {
                                      return chieuDai * chieuRong;
                   }

                   @Override
                   public int tinhChuVi() {
                                      return 2 * (chieuDai + chieuRong);
                   }

                   public int getChieuDai() {
                                      return chieuDai;
                   }

                   public void setChieuDai(int chieuDai) {
                                      this.chieuDai = chieuDai;
                   }

                   public int getChieuRong() {
                                      return chieuRong;
                   }

                   public void setChieuRong(int chieuRong) {
                                      this.chieuRong = chieuRong;
                   }

                   public void Nhap() {
                                      Scanner sc = new Scanner(System.in);
                                      System.out.println("Nhap chieu dai: ");
                                      chieuDai = sc.nextInt();
                                      System.out.println("Nhap chieu rong: ");
                                      chieuRong = sc.nextInt();
                   }

                   public void Xuat() {
                                      System.out.println("Chieu dai: " + chieuDai);
                                      System.out.println("Chieu rong: " + chieuRong);
                                      System.out.println("Dien tich: " + tinhDienTich());
                                      System.out.println(" Chu vi: " + tinhChuVi());
                   }
}
