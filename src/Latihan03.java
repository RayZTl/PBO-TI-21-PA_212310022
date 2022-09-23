
public class Latihan03 {

	public static void main (String[] args) {
		int a,b,c,t,d1,d2,la;
		a = 3;
		b = 4;
		c = 2;
		d1 = 5;
		d2 = 6;
		t  = 6;
		la = 5;
				
		
		double luas = (0.5*d1*d2);
		int keliling = 2*(a+b);
		
		System.out.println("MENGHITUNG LAYANG - LAYANG");
		System.out.println("Luas layang - layang adalah " +luas);
		System.out.println("Keliling layang layang adalah "+ keliling);
		
		int luasprs = t*(a*b*c)+2*la;
		double volumeprs = (0.5*a*t)*t;
		
		System.out.println("MENGHITUNG PRISMA SEGITIGA");
		System.out.println("luas prisma segitiga adalah = "+luasprs);
		System.out.println("Volume prisma segitiga adalah = "+volumeprs);
		
		

		
	}
}