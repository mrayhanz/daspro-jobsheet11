import java.util.Scanner;

public class Kafe17 {

    public static void Menu(String namaPelanggan, boolean isMember , String kodePromo){
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
            if (kodePromo.equals("DISKON50")) {
                System.out.println("Anda mendapatkan diskon 50%!");
            } else if (kodePromo.equals("DISKON30")) {
                System.out.println("Anda mendapatkan diskon 30%!");
            }else{
                System.out.println("Kode diskon invalid!");
            }
            
        }
        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga17(int pilihanMenu,int banyakItem,String kodePromo,boolean isMember){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000 };
        
        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        if (isMember) {
            hargaTotal = hargaTotal - (hargaTotal * 10 / 100); 
        }
        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal / 2;
        }else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        }
        return hargaTotal;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kodePromo = "DISKON50";
        boolean isMember = false;
        Menu("Andi",isMember,kodePromo);
        boolean selesai = false;
        int totalKeseluruhan = 0;
        while (!selesai) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan (0 untuk selesai) :");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) {
                selesai = true;
            }else {
                System.out.print("Masukkan Jumlah item yang ingin di pesan: ");
                int banyakItem = sc.nextInt();
                
                int totalHarga = hitungTotalHarga17(pilihanMenu, banyakItem, kodePromo,isMember);
                totalKeseluruhan += totalHarga;
            }
        }
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalKeseluruhan);
    }
}
