import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        System.out.println("Array is sorted in " + count+ " swaps.");
        System.out.println("First Element: " +arr[0]);
        System.out.println("Last Element: " + arr[n-1]);
    }
}
