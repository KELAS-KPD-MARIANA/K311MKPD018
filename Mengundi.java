package mengundi;
import java.util.Scanner;

public class Mengundi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();
        
        System.out.print("Apakah anda sudah Mendaftar? (Ya/Tidak): ");
        String status = input.next();
        
        String jawapan = "";
        
        if (umur < 18) {
            jawapan = "Anda terlalu muda dan tidak layak mengundi";
        } else if (status.equalsIgnoreCase("Ya")) {
            jawapan = "Anda layak mengundi";
        } else {
            jawapan = "Anda perlu mendaftar dahulu sebelum mengundi";
        }
         
        
        System.out.println(jawapan);
    }
}
