package Java.U3_Condicionales;

import java.util.Scanner;/* Leemos dos números enteros, que tendremos que comparar para decidir si son * iguales o distintos */

public class Condicional_IF_Else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int n1 = sc.nextInt(); // primer número
		System.out.print("Introduzca otro número: ");
		int n2 = sc.nextInt();
		if (n1 == n2) { // si n1 es igual que n2
			System.out.println("Ambos números son iguales");
		} else {
			System.out.println("Lo números son distintos");
		}
		sc.close();

	}

}
