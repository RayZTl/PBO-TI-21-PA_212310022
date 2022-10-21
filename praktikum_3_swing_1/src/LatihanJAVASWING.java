import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class LatihanJAVASWING {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		/*jop.showMessageDialog(null, "ini java swing", "swing",jop.INFORMATION_MESSAGE);
		jop.showMessageDialog(null, "ini java swing", "swing",jop.WARNING_MESSAGE);
		jop.showMessageDialog(null, "ini java swing", "swing",jop.ERROR_MESSAGE);
		jop.showMessageDialog(null, "ini java swing", "swing",jop.PLAIN_MESSAGE);*/

		ImageIcon icon = new ImageIcon("C:/Users/ASUS/Downloads/coffee-icon.png");
		ImageIcon Icons = new ImageIcon("C:/Users/ASUS/Downloads/angry-icon.png");
		ImageIcon Icon = new ImageIcon("C:/Users/ASUS/Downloads/10082-smiling-face-with-halo-icon.png");
		ImageIcon con = new ImageIcon("C:/Users/ASUS/Downloads/confuse-icon.png");
		
		
		jop.showMessageDialog (null, "silahkan masuk", "Selamat Datang",jop.WARNING_MESSAGE,icon);
		
		//jop.showMessageDialog(null, nama);s
		//String nama = jop.showInputDialog(null, "Masukan nama: ");
		
	   int konfirmasi =jop.showConfirmDialog(null,"Apakah kamu ray?","Confirm",jop.YES_NO_OPTION);
		//jop.showMessageDialog(null,"are u human");
	   if(konfirmasi == 0) {
			jop.showMessageDialog(null,"Selamat datang Ray",null, jop.INFORMATION_MESSAGE,Icon);
	   }else if(konfirmasi == 1){
			jop.showMessageDialog(null,"Silahkan pergi",null, jop.INFORMATION_MESSAGE,Icons);
	//	jop.showMessageDialog(null, jop.YES_NO_CANCEL_OPTION);
	}
}
}
