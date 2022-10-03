
public class UD04Ejer5 {
	public static void main(String[] args) {
		
		int A=2, B=5, C=7, D=4;
		
		System.out.println("Valores asignados:");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);
		System.out.println("D = "+D);
		
		System.out.println("B toma el valor de C.  B = "+ (B=C));
		System.out.println("C toma el valor de A.  C = "+ (C=A));
		System.out.println("A toma el valor de D.  A = "+ (A=D));
		System.out.println("D toma el valor de B.  D = "+ (D=B-2));
	}

}
