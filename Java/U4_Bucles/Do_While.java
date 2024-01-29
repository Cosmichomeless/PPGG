package Java.U4_Bucles;
import java.util.Scanner;
 class Do_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado, operando1, operando2;
		int numOperaciones = 0;
		do {
			operando1 = (int) (Math.random() * 100 + 1);
			operando2 = (int) (Math.random() * 100 + 1);
			System.out.print(operando1 + " + " + operando2 + " = ");
			resultado = sc.nextInt();
			numOperaciones++;
		} while (resultado == operando1 + operando2);
		System.out.println("A conseguido realizar: " + (numOperaciones - 1) + " sumas consecutivas");
		sc.close();
	}

}
