package kiragaji;
import java.util.Scanner;
public class GajiKira {
       public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
         
         int bil;
         double komisyen;
         double gaji_asas = 1800.00;
         double jumlah_gaji;
         
         System.out.print("Masukkan bilangan kereta = ");
         bil = input.nextInt();
         
          if(bil > 10)
       {
         komisyen = 10000.00; 
       }
          else if(bil > 5 && bil <= 9 )
       {
         komisyen = 6000.00; 
       }
          else if(bil > 1 && bil <= 4 )
       {
         komisyen = 3000.00; 
       }
           else 
       {
         komisyen = 0.00; 
       }
          
          jumlah_gaji = komisyen + gaji_asas;
          
          
        System.out.println("Jumlah kereta yang berjaya dijual =" + bil);
        System.out.println("Jumlah komisyen yang diperoleh =" + komisyen);
        System.out.println("Jumlah gaji : RM" + jumlah_gaji);
        
}}