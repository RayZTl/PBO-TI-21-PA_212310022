import java.util.Scanner;
public class Latihan06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		   System.out.println("Nama Depan : ");
		   String namadepan = input.nextLine();
		   System.out.println("Nama Belakang : ");
		   String namabelakang = input.nextLine();
		   System.out.println("NPM : ");
		   String npm = input.nextLine();
		   System.out.println("Umur : ");
		   String umur = input.nextLine();
		   
	       String output = umur.concat(namadepan).concat(namabelakang).concat(npm);
	       System.out.println("output = " + output);

	}

}
