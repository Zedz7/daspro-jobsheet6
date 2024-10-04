import java.util.Scanner;

public class Pemilihan2Percobaan206 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner (System.in);

       int pilihan_menu;
       String member;
       double total_bayar;
       double harga;
       double diskon;

       System.out.println("-------------------------");
       System.out.println("===== MENU KAFE JTI =====");
       System.out.println("-------------------------");
       System.out.println("1. Ricebowl");
       System.out.println("2. Ice Tea");
       System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
       System.out.println("-------------------------------------");
       System.out.print("Masukkan angka dari menu yang dipilih= ");
       pilihan_menu = input06.nextInt();
       input06.nextLine();
       System.out.print("Apkah punya member (y/n) ? = ");
       member = input06.nextLine();
       System.out.println("-------------------------------------");

       if (member.equalsIgnoreCase("y")) { //Menggunakan eualsIgnoreCase untuk membandingkan string
           diskon = 0.10;
           System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bunding = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah 
            }
            
            //Menghitung total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
       }

       else if (member.equalsIgnoreCase("n")) { //Menggunakan eualsIgnoreCase untuk membandingkan string
           if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);

           } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

           } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bunding = " + harga);

           } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah 
           }
           //Menghitung total bayar 
           System.out.println("Total bayar = " + harga);

       } else {
        System.out.println("Member tidak valid");
       }
       System.out.println("-------------------------------------");
    }
}
