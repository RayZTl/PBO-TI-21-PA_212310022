package praktikum_02_selection_Repetition;
import java.util.Scanner;

public class Latihan02 {
	public static void main(String[] args) {
		Scanner input = new Scanner ( System.in);
		int NPM ;
		
		System.out.println("Masukan NPM anda : " );
		NPM = input.nextInt();
		
		if (NPM %2 == 0) {
		System.out.println("Bukan termasuk bilangan prima karna dapat dibagi dengan 2");	
			
		}else {
			System.out.println("Termasuk bilangan prima");
			
		}
	}
}
