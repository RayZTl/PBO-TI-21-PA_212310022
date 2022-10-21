package praktikum_3_swing_1;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Latihan03 {
	public static void main(String[] args) {
		String Fullname,Alamat,Usia ;
	
		
		JOptionPane jop = new JOptionPane();
		Fullname =jop.showInputDialog(null,"Masukan Nama lengkap anda","Input nama",jop.QUESTION_MESSAGE);
		Alamat = jop.showInputDialog(null,"Masukan Alamat anda","Input Alamat",jop.QUESTION_MESSAGE);
		Usia = jop.showInputDialog(null,"Masukan Usia anda","Input Usia",jop.QUESTION_MESSAGE);
	
		if (Fullname.isEmpty()&&Alamat.isEmpty()&&Usia.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Field Fullname/Alamat/Usia tidak boleh kosong","Error Message", jop.QUESTION_MESSAGE);
			}else if(!Pattern.matches("^[0-9]+$",Usia)) {
				JOptionPane.showMessageDialog(null,"Field harus diisi Angka","Error Message",jop.ERROR_MESSAGE);
			}else if(Alamat.length()<10) {
				jop.showMessageDialog(null,"Masukan Alamat minimal 10 karakter","Error Message",jop.ERROR_MESSAGE);
			}else {
				jop.showMessageDialog(null,"Seluruh informasi telah dimasukkan","Output Message",jop.INFORMATION_MESSAGE);
			}
		}
	
	}
		
  


