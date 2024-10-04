import java.util.Scanner;

public class Pemilihan2Percobaan206 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner (System.in);

       int pilihan_menu;
       String member;
       double total_bayar;
       double harga;
       double diskon;
       String qris;
       double potongan_harga;

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
       System.out.print("Apakah punya member (y/n) ? = ");
       member = input06.nextLine();
       System.out.print("Anda ingin bayar melalui QRIS (y/n) ? = ");
       qris = input06.nextLine();
       System.out.println("-------------------------------------");

       if (member.equals("y")) { //Menggunakan eualsIgnoreCase untuk membandingkan string
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

             if (qris.equals("y")) {
                potongan_harga = 1000;
                System.out.println("Potongan harga = 1000");
                total_bayar = (harga - (harga * diskon) - potongan_harga);
                System.out.println("Total bayar setelah diskon dan potongan harga = " + total_bayar);

             } else if (qris.equals("n")) {
                total_bayar = harga - (harga * diskon);
                System.out.println("Total bayar setelah diskon  = " + total_bayar);

             } else {
                System.out.println("Masukkan inputan dengan benar");
                return;
             }
            
       }

       else if (member.equals("n")) { //Menggunakan eualsIgnoreCase untuk membandingkan string
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
            if (qris.equals("y")) {
                potongan_harga = 1000;
                System.out.println("Potongan harga = 1000");
                total_bayar = harga - potongan_harga;
                System.out.println("Total bayar setelah potongan harga  = " + total_bayar);

            } else if (qris.equals("n")) {
                System.out.println("Total bayar = " + harga);

            } else {
                System.out.println("Masukkan inputan dengan benar");
                return;
            }

       } else {
        System.out.println("Member tidak valid");
       }
       System.out.println("-------------------------------------");
    }
}
