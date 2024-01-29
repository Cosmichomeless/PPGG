package Java.U2_Conceptos_Basicos;

import java.util.Scanner;

public class E2_14 {
	public static void main(String[] args) {
		double n;
		int redondeo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número decimal (con punto): ");
		n = sc.nextDouble();
		redondeo = (int) (n + 0.5);
		System.out.println(n + " redondeado es: " + redondeo);
		sc.close();

	}

}
