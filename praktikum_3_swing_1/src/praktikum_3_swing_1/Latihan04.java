package praktikum_3_swing_1;
import javax.swing.JOptionPane;

public class Latihan04 {

	public static void main(String[] args) {
	
		JOptionPane jop = new JOptionPane();
		jop.showMessageDialog(null,"Selamat Datang!");
		final String WARN = "PERINGATAN!";
		boolean Lanjut =true;
		
		while(Lanjut) {
			String nama = jop.showInputDialog(null,"Masukkan nama lengkap anda","Form Nama",jop.QUESTION_MESSAGE);
			
			if(nama.isEmpty()) {
				jop.showMessageDialog(null,"Field Form nama tidak boleh kosong!",WARN,jop.WARNING_MESSAGE);
				System.exit(0);
			}
			String Usia = jop.showInputDialog(null,"Masukkan Usia Anda","Form Usia",jop.QUESTION_MESSAGE);
			final String REG_NUMERIK="[0-9]+";
			if(Usia.isEmpty()) {
				jop.showMessageDialog(null,"Field Form usia tidak boleh kosong!",WARN,jop.WARNING_MESSAGE);
			}else if(!Usia.matches(REG_NUMERIK)) {
				jop.showMessageDialog(null,"Isian Form Usia harus numerik!",WARN,jop.WARNING_MESSAGE);
				System.exit(0);
			}
			String Alamat = jop.showInputDialog(null,"Masukkan Alamat anda","Form Alamat",jop.QUESTION_MESSAGE);
			if(Alamat.isEmpty()) {
				jop.showMessageDialog(null, "Field Form Alamat tidak boleh kosong!",WARN,jop.WARNING_MESSAGE);
			}else if(Alamat.length()<10) {
				jop.showMessageDialog(null,"Masukkan Alamat minimal 10 karakter",WARN,jop.WARNING_MESSAGE);
			}
		;
			
			int keluar = jop.showConfirmDialog(null,"Apakah anda ingin keluar?","Keluar",jop.YES_NO_OPTION);
			if(keluar ==jop.YES_NO_OPTION) {
				Lanjut = false;
			}else {
				Lanjut = true;
			}
		}
		
		jop.showMessageDialog(null,"Terima Kasih");

	}

}
