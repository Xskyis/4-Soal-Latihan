import java.util.Scanner;

public class ganjilataugenapchap2 {
    public static void main(String[] args) {
        //scanner input N
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah N: ");
        int N = sc.nextInt();

        //dek array
        int[] arr = new int[N];

        //input array
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai arrray [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        //output penentuan ganjil atau genap
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print("[" + i + "] genap , ");
            } else {
                System.out.print("[" + i + "] ganjil , ");
            }

            
        }
    }
}