package Java.U3_Condicionales;

import java.util.Scanner;

public class E3_10_ELSE {

	/*
	 * Hay alumnos que no están muy de acuerdo con esta clasificación de las notas,
	 * y toda calificación mayor que 3 debe ser Notable. :-)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una nota: ");
		int nota = sc.nextInt();
		if (0 <= nota && nota < 5) {
			// se podría utilizar 0<=nota && nota <=4
			System.out.println("Insuficiente");
		} else if (nota == 5) {
			System.out.println("Suficiente");
		} else if (nota == 6) {
			System.out.println("Bien");
		} else if (nota == 7 || nota == 8) { // si nota es 7 u 8
			System.out.println("Notable");
		} else if (nota == 9 || nota == 10) { // si nota es 9 o 10
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Error: nota no válida");
		}
		sc.close();

	}
}
