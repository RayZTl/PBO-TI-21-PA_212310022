import javax.swing.JOptionPane;
public class Latihan03 {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		

		int i;
		
		
	
		String arr_count=jop.showInputDialog(null,"Masukkan jumlah array:");
			int count = Integer.parseInt(arr_count);
			int nilai [] = new int[count];
	
		String output = "";
		for (i = 0; i<count ; i++) {
			arr_count =	JOptionPane.showInputDialog(null,"Masukkan angka:");
			output +="x ["+i+"]="+arr_count+"\n";
			
		}
		JOptionPane.showMessageDialog(null,output);
	}
}

