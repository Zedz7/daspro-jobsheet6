import java.util.Scanner;

public class Flowchart1 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner (System.in);

        int bil1, bil2, bil3, bilangan_terbesar;

        System.out.print("Masukkan  bilangan pertama: ");
        bil1 = input06.nextInt();
        System.out.print("Masukkan  bilangan kedua: ");
        bil2 = input06.nextInt();
        System.out.print("Masukkan  bilangan ketiga: ");
        bil3 = input06.nextInt();

        if (bil1 >= bil2) {
            bilangan_terbesar = bil1;
            if (bil1 >= bil3) {
                bilangan_terbesar = bil1;
            } else {
            bilangan_terbesar = bil3;
            } 
        } else {
            bilangan_terbesar = bil2;
        } 
        System.out.println("Bilangan terbesar adalah : " + bilangan_terbesar);
    }
}
