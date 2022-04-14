import java.util.Scanner;

public class Berapakahjumlahnya {
    public static void main(String[] args) {
         //scanner input
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah N: ");
        int N = sc.nextInt();

        //array
        int[] arrayy = new int[N];

        //input array
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai array [" + i + "]: ");
            arrayy[i] = sc.nextInt();
        }

        //output penjumlahan +1 array
        for (int i = 0; i < N; i++) {
            System.out.print("[" + i + "] + 1 = " + (arrayy[i] + 1) + " , ");
        }

        //output total penjumlahan array
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += arrayy[i];
        }
        System.out.println("\nTotal = " + total);

    }
}
