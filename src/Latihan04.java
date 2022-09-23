import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Latihan04 {

	public static void main(String[] args) {
		Scanner Input= new Scanner(System.in);
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateF = DateTimeFormatter.ofPattern("dd MM yyyy (HH:mm)");
		String time = date.format(dateF);
		
		double hargaroti = 6300;
		int jmlh ;
		double total;
		double diskon;
		double subtotal;
	
	
		
		System.out.println("====================================");
		System.out.println("	TOKO SERBAGUNA IBIK");
		System.out.println("====================================");
		
	
		System.out.println("Masukkan jumlah produk yang dibeli :");
		jmlh = Input.nextInt();
		total =  jmlh * hargaroti;
	
		System.out.println(time);
		System.out.println("ITEM\t\t\tQTY \t\tHARGA  \t\tTotal");
		System.out.println("=====================================================================");
		System.out.println ("ROTI Enak \t\t" + jmlh + "\t\t Rp." + hargaroti + "\tRp." + total);
		
		
		
		diskon = 0.1 * total;
		System.out.println("diskon 10%");
		subtotal = total - diskon;
		System.out.println("SubTotal :Rp. " + subtotal);
		
		
	}

}

