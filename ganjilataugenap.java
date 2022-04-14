import java.util.Scanner;

public class ganjilataugenap {
    public static void main(String[] args) {
        ///scanner input a
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = sc.nextInt();
        
        //output hasil
        if (a % 2 == 0) {
            System.out.println("a adalah bilangan genap");
        } else {
            System.out.println("a adalah bilangan ganjil");
        }
    }
}
