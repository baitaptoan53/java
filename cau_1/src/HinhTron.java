import java.util.Scanner;

public class HinhTron extends HinhKhoi {
               private int banKinh;

               public HinhTron(int banKinh) {
                              this.banKinh = banKinh;
               }

               public HinhTron() {
                              this.banKinh = banKinh;
               }

               @Override
               public int tinhDienTich() {
                              return (int) (Math.PI * banKinh * banKinh);
               }

               @Override
               public int tinhChuVi() {
                              return (int) (2*Math.PI *  banKinh );
               }

               public int getBanKinh() {
                              return banKinh;
               }

               public void setBanKinh(int banKinh) {
                              this.banKinh = banKinh;
               }

               public void Nhap() {
                              Scanner sc = new Scanner(System.in);
                              System.out.print("Nhap ban kinh: ");
                              banKinh = sc.nextInt();
               }

               public void Xuat() {
                              System.out.println("Ban kinh: " + banKinh);
                              System.out.println("Dien tich: " + tinhDienTich());
                              System.out.println("Chu vi: " + tinhChuVi());
               }
}