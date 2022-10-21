package praktikum_3_swing_1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Latihan02 {
	public static void main(String[] args) {
		Biodata myBio = new Biodata();
	
		myBio.setFullname(JOptionPane.showInputDialog(
				null, 
				"Input your Fullname:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		));
		
		myBio.setUmur(Integer.parseInt(JOptionPane.showInputDialog(
				null, 
				"Input your age:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		)));
		
		myBio.setAlamat(JOptionPane.showInputDialog(
				null, 
				"Input your address:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		));

		JOptionPane.showMessageDialog(
				null, 
				"Your Fullname is " + myBio.getFullname() 
				+ "\nYour Umur is " + myBio.getUmur() + " year " 
				+ "\nYour Alamat is " + myBio.getAlamat());
	}

}
