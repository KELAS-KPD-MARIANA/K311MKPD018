package gajibonus;
import java.util.Scanner;

public class GajiBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil;
        double bonus;
        double gaji_asas = 1100.00;
        double jumlah_gaji;

        System.out.print("Masukkan jumlah bilangan pelanggan = ");
        bil = input.nextInt();

        if (bil >= 40) {
            bonus = 10000.00;
        } else if (bil >= 30 && bil <= 39) {
            bonus = 8000.00;
        } else if (bil >= 20 && bil <= 29) {
            bonus = 6000.00;
        } else if (bil >= 10 && bil <= 19) {
            bonus = 4000.00;
        } else if (bil >= 1 && bil <= 9) {
            bonus = 2000.00;
        } else {
            bonus = 0.00;
        }

        jumlah_gaji = bonus + gaji_asas;

        System.out.println("Jumlah pelanggan yang dicapai = " + bil);
        System.out.println("Jumlah bonus yang diperoleh = " + bonus);
        System.out.println("Jumlah gaji : RM " + jumlah_gaji);
    }
}
