import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }
}
// Trong đoạn code trên, chúng ta sử dụng một mảng 2 chiều arr để lưu trữ dữ liệu đầu vào và duyệt qua
//  từng hình chữ nhật có kích thước 3x3 trong mảng để tính tổng các phần tử của hình chữ nhật đó. 
//  Sau đó, tìm giá trị lớn nhất của tổng này trong các hình chữ nhật đó và in ra giá trị đó.

// Lưu ý rằng chúng ta chỉ duyệt qua các hình chữ nhật có tọa độ (i, j) thuộc
//  [0, 3]x[0, 3], vì nếu duyệt qua các hình chữ nhật khác thì sẽ có những phần 
//  tử bị thiếu, không thể tính được tổng của hình chữ nhật đó.