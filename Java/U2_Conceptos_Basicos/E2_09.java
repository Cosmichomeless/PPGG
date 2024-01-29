package Java.U2_Conceptos_Basicos;

import java.util.Scanner;

public class E2_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.print("Escriba un número: ");
		numero = sc.nextInt();
		boolean esPar = (numero % 2) == 0;
		System.out.println("Es par: " + esPar);
		sc.close();
	}

}
