import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Nhap thong tin hinh tron 1");
        // HinhTron ht = new HinhTron();
        // ht.Nhap();
        // ht.Xuat();
        // System.out.println("Nhap thong tin hinh tron 2");
        // HinhTron ht2 = new HinhTron();
        // ht2.Nhap();
        // ht2.Xuat();
        // if (ht.tinhDienTich() > ht2.tinhDienTich()) {
        //     System.out.println("Hinh tron 1 co dien tich lon hon");
        // } else if (ht.tinhDienTich() < ht2.tinhDienTich()) {
        //     System.out.println("Hinh tron 2 co dien tich lon hon");
        // } else {
        //     System.out.println("Hinh tron 1 va 2 co dien tich bang nhau");
        // }
        // khoi tao 1 mang hinh tron
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hinh tron: ");
        n = sc.nextInt();

        HinhTron[] dsHinhTron = new HinhTron[n];
        for (int i = 0; i < dsHinhTron.length; i++) {
            dsHinhTron[i] = new HinhTron();
        System.out.println("Nhap thong tin hinh tron "+(i+1)+" : " );
            dsHinhTron[i].Nhap();
        }
        for (int i = 0; i < dsHinhTron.length; i++) {
            dsHinhTron[i].Xuat();
        }
        // tim hinh tron co dien tich lon nhat
        int max = dsHinhTron[0].tinhDienTich();
        int index = 0;
        for (int i = 1; i < dsHinhTron.length; i++) {
            if (dsHinhTron[i].tinhDienTich() > max) {
                max = dsHinhTron[i].tinhDienTich();
                index = i;
            }
        }
        System.out.println("Hinh tron thu  "+(index+1)+" co dien tich lon nhat ");
        System.out.println("Hinh tron co dien tich lon nhat la: ");
        dsHinhTron[index].Xuat();
        
    }
}
