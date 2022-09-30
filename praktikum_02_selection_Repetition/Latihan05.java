package praktikum_02_selection_Repetition;
import java.util.Scanner;
public class Latihan05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Masukan Input: ");
	        int tinggi = input.nextInt(); //Mendapatkan Input Dari User
	        
	        for(int i=1; i<=tinggi; i++) {
	            for(int j=tinggi; j>=i; j--) {
	                System.out.print("*");
	              }
	              System.out.println();
	            }
	        
	        for(int i=1; i<=tinggi; i++) {
	        	  for(int s=3; s>=tinggi; s--){
		                System.out.print(" ");
		            }
		            
	            for(int j=tinggi; j>=i; j--) {
	                System.out.print("*");
	              }
	              System.out.println();
	            }
	        
	        for(int i=1; i<=tinggi; i++){
	            //Menghitung Jumlah Tinggi Piramida
	            
	            for(int s=i; s<=tinggi; s++){
	                //Menghitung Jumlah Spasi per Baris
	                System.out.print(" ");
	            }
	            
	            for(int j=1; j<=i; j++){
	                //Menghitung Jumlah Bintang per Baris
	                System.out.print("*");
	            }
	          
	            System.out.println(""); //Membuat Baris Baru
	        }
	        
	        
	        for(int i=1; i<=tinggi; i++) {
	            for(int j=1; j<=i; j++) {
	                System.out.print("*");
	              }
	              System.out.println();
	            }

	}

}
