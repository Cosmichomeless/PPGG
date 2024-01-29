
package Java.U2_Conceptos_Basicos;

import java.util.Scanner;

public class E2_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número (positivo o negativo): ");
		int n = sc.nextInt();
		int valorAbsoluto = Math.abs(n);
		System.out.println("El valor absoluto de " + n + " es " +
				valorAbsoluto);
		sc.close();

	}

}
