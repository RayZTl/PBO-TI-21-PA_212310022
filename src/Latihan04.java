import javax.swing.JOptionPane;
public class Latihan04 {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
	
		int i,max_num=0,min_num=0;
		
		String arr_count=jop.showInputDialog(null,"Masukkan jumlah array:");
			int count = Integer.parseInt(arr_count);
			int []nilai = new int[count];
	
		String output = "";
		for (i = 0; i<count ; i++) {
			nilai[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan angka:"));
			output +="x ["+i+"]="+arr_count+"\n";
		
		}
			max_num =nilai[0];
			for ( i=0 ; i<count ; i++) {
			if(nilai[i]>max_num) {
				max_num = nilai[i];
		}
				
	}
			min_num =nilai[0];
			for ( i=0 ; i<count ; i++) {
			if(nilai[i]<min_num) {
				min_num = nilai[i];
		}
				
	}
		JOptionPane.showMessageDialog(null,output+"Angka terbesar adalah "+max_num+"\nAngka terkecil adalah "+min_num);
		
				
	}
}


