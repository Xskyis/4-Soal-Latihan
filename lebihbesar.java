import java.util.Scanner;

public class lebihbesar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //input a dan b
        System.out.print("Masukkan nilai a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = sc.nextInt();
        //output hasil
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("a sama dengan b");
        }
    }    
}
