import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String title,author;
        int price;
        Scanner sc = new Scanner(System.in);
        title = sc.nextLine();
        author = sc.nextLine();
        price = sc.nextInt();
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        sc.close();
    }
}
// public class Book {
//     private String title;
//     private String author;
//     private int price;
//     public Book(String title, String author, int price) {
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }
//     public String getTitle() {
//         return title;
//     }
//     public String getAuthor() {
//         return author;
//     }
//     public int getPrice() {
//         return price;
//     }
// }