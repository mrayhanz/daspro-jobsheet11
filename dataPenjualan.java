import java.util.Scanner;

public class dataPenjualan {
    static String menu[];
    static int penjualan[][];
    static Scanner sc = new Scanner(System.in);

    static void inputData() {
        System.out.print("Masukkan Jumlah Menu: ");
        int input = sc.nextInt();
        System.out.print("Masukkan Jumlah Hari: ");
        int input1 = sc.nextInt();
        menu = new String[input];
        int penjualan[][] = new int[input][input1];
        for(int i = 0; i < penjualan.length; i++){
            System.out.println("Masukkan Data Penjualan " + menu[i]);
            for(int j = 0; j < penjualan[i].length; j++){
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    static void printData() {
        for(int i = 0; i < penjualan.length; i++){
            System.out.println("Data Penjualan ke-" + (i + 1) + " : " +penjualan[i]);
            for(int j = 0; j < penjualan[i].length; j++){
                System.out.print(penjualan[i][j] + "  ");
            }
            System.out.println();
        }
    }
    static int menuTertinggi(int[][] penjualan) {
        int maks = 0;
        int penjualanTertinggi = penjualan[0][0];

        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[0].length; j++) {
                if(penjualan[i][j] > penjualanTertinggi) {
                    penjualanTertinggi = penjualan[i][j];
                    maks = j;
                }
            }
        }
        return maks;
    }
    static void rataPenjualan(int[][] penjualan) {
        for(int i = 0; i < penjualan.length; i++){
            int total = 0;
            for(int j = 0; j < penjualan[i].length; j++){
                total += penjualan[i][j]; 
            }
            int rata = total / penjualan[i].length;
            System.out.println("Rata-rata penjualan untuk " + menu[i] + ": " + rata);
        }
    }
    public static void main(String[] args) {
        inputData();
        printData();
        int menuTertinggi = menuTertinggi(penjualan);
        System.out.println("Menu penjualan tertinggi adalah menu ke-" + menuTertinggi);
        rataPenjualan(penjualan);
        }
}