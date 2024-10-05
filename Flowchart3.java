import java.util.Scanner;

public class Flowchart3 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner (System.in);

        String merk;
        String kategori;
        int ukuran; 
        int harga;

        System.out.print("Masukkan merk : ");
        merk = input06.nextLine();
        System.out.print("Masukkan kategori : ");
        kategori = input06.nextLine();
        System.out.print("Masukkan ukuran : ");
        ukuran = input06.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800000;
                    System.out.println("Harga sepatu converse kategori slip on ukuran " + ukuran + " adalah Rp. " + harga);
                } else {
                    System.out.println("Ukuran tidak ditemukan");
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                    System.out.println("Harga sepatu converse kategori high top ukuran " + ukuran + " adalah Rp. " + harga);
                } else {
                    System.out.println("Ukuran tidak ditemukan");
                }
            }  else {
                System.out.println("Kategori tidak ditemukan ");
            }
        }
        else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                    System.out.println("Harga sepatu sketcher kategori woman ukuran " + ukuran + " adalah Rp. " + harga);
                } else {
                    System.out.println("Ukuran tidak ditemukan");
                }
            }  else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                    System.out.println("Harga sepatu sketcher kategori man ukuran " + ukuran + " adalah Rp. " + harga);
                } else {
                    System.out.println("Ukuran tidak ditemukan");
                }
            } else {
                System.out.println("Kategori tidak ditemukan");
            }
        }
        else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                    System.out.println("Harga sepatu nike kategori kids ukuran " + ukuran + " adalah  Rp. " + harga);
                } else {
                    System.out.println("Ukuran tidak ditemukan");
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                    System.out.println("Harga sepatu nike kategori adult ukuran " + ukuran + " adalah  Rp. " + harga);
                } else {
                    System.out.println("Ukuran tidak ditemukan");
                }
            } else {
                System.out.println("Kategori tidak ditemukan");
            }
        }
        else {
            System.out.println("Merk tidak ditemukan");
        }
    }
}