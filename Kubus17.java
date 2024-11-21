import java.util.Scanner;

public class Kubus17 {

    static int hitungVolume(int s){
        int volume = s * s * s ;
        return volume;
    }
    static int luarPermukaan(int s){
        int luarPermukaan = 6 * (s * s);
        return luarPermukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vol,s,luarPermukaan;
        System.out.println("Masukkan sisi kubus");
        s = sc.nextInt();

        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol);
        luarPermukaan = luarPermukaan(s);
        System.out.println("Luar Permukaan Kubus adalah " + luarPermukaan);
    }
}