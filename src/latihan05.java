import javax.swing.JOptionPane;
public final class latihan05 {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String field [] ={"Nama lengkap","Alamat","No Telp"};
		String nama =jop.showInputDialog(null,field[0]);
		String alamat =jop.showInputDialog(null,field[1]);
		String telp =jop.showInputDialog(null,field[2]);
		
		String output ="";
		output +="Nama lengkap :"+nama+"\nAlamat :"+alamat+"\nNo telp :"+telp;
		JOptionPane.showMessageDialog(null,output);
	}

}
