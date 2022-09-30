package praktikum_02_selection_Repetition;
import java.util.Scanner;
public class Latihan06 {

public static void main(String[] args) {
Scanner input = new Scanner ( System.in);
	boolean pilihan = true;
	String lanjutpilih;
	int pilih;

		
		System.out.println("1.Nasi Goreng dengan harga Rp22.000"); 
		System.out.println("2.Bubur Ayam dengan harga Rp15.000"); 
		System.out.println("3.Soto Ayam dengan harga Rp25.000"); 

		System.out.println("Masukan nomor pesanan :");
		int nomor= input.nextInt();
	
		switch (nomor) {
		case 1 : 
			System.out.println("1.Anda memesan Nasi Goreng dengan harga Rp22.000");
			break;
		
		case 2 :
			System.out.println("2. Anda memesan Bubur Ayam dengan harga Rp15.000");
			break;
			
		case 3 :
			System.out.println("3. Anda memesan Soto Ayam dengan harga Rp25.000");
			break;
		default:
			System.out.println("Maaf menu yang anda masukan salah.");
		}
		while(pilihan) {
			System.out.print("\nApakah Anda ingin memesan lagi? [Y/N] : ");
			lanjutpilih = input.next();
			
			if(lanjutpilih.equalsIgnoreCase("Y")) {
				continue;
			} else if(lanjutpilih.equalsIgnoreCase("N")) {
				System.out.println("Terima kasih telah memesan");
				break;
			} else {
				System.out.println("Pilihan yang Anda masukkan salah!");
			}
		}
		input.close();
	}
}

		

