import java.util.Scanner;

public class Flowchart2 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner (System.in);
        
        String jenisBuku;
        int jumlahBuku;
        int diskon;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input06.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = input06.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
                System.out.println("Anda mendapatkan diskon sebesar : " +  diskon + "%");
            } else {
                System.out.println("Anda mendapatkan diskon sebesar : " + diskon + "%");
            } 
        }   
        else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
                System.out.println("Anda mendapatkan diskon sebesar : " + diskon + "%");
            } else {
                diskon += 1;
                System.out.println("Anda mendapatkan diskon sebesar : " + diskon + "%");
            }
        }
        else if (!jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equalsIgnoreCase("novel")) {
            if(jumlahBuku > 3) {
                diskon = 5;
                System.out.println("Anda mendapatkan diskon sebesar : " + diskon + "%");
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
            }
        }
    }
}    