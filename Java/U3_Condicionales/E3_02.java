package Java.U3_Condicionales;

import java.util.Scanner;

public class E3_02 {
	public static void main(String[] args) {
		System.out.println("Escriba un número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		boolean esPositivo = numero > 0;
		System.out.println("Es " + numero + " positivo? " + esPositivo);
		sc.close();

	}

}
