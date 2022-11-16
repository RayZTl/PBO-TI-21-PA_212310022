import javax.swing.JOptionPane;
public class Latihan06 {

	public static void main(String[] args) {
	JOptionPane jop = new JOptionPane();
	
	int matriksA[][]= new int [2][2];
	int matriksB[][]= new int [2][2];

	JOptionPane.showMessageDialog(null, "Matriks A");
	String outputA="Matriks A: \n";
	for(int i = 0; i<matriksA.length;i++) {
		for (int j = 0; j<matriksA.length; j++) {
			matriksA[i][j] = Integer.parseInt(jop.showInputDialog(null,"masukan angka: ","matriks A {"+i+"]"+j+"]",jop.QUESTION_MESSAGE));
			outputA += matriksA[i][j] + " ";
		}
	}
	JOptionPane.showMessageDialog(null, "==== Matriks B ====");
	for(int i =0; i<matriksB.length; i++) {
	for(int j=0; j<matriksB.length; j++) { matriksB[i][j] =
	Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan angka: ", "Matriks B ke-["+i+"]"+"["+j+"]", JOptionPane.QUESTION_MESSAGE));
	}
	}

	//OUTPUT
	String outputA1="Matriks A: \n";
	for(int i=0; i<matriksA.length;i++) {
	for(int j=0;j<matriksA.length; j++) { outputA1 += matriksA[i][j] + " ";
	}
	outputA1 += "\n";
	}

	String outputB="Matriks B: \n";
	for(int i=0; i<matriksB.length;i++) {
	for(int j=0;j<matriksB.length; j++) { outputB += matriksB[i][j] + " ";
	}
	outputB += "\n";
	}
	JOptionPane.showMessageDialog(null, outputA1+outputB);

	
	}

}
