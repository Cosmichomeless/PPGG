package Java.U3_Condicionales;

import java.util.*;

public class Condicional_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba un mes (1 al 12):");
		int mes = sc.nextInt();
		int dias = switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				yield 31;
			} // estos meses tienen 31 días
			case 2 -> {
				yield 28;
			} // febrero tiene 28 días
			case 4, 6, 9, 11 -> {
				yield 30;
			} // el resto de meses tiene 30 días
			default -> {
				System.out.println("Error: el mes es incorrecto");
				yield -1;
				// con -1 indicamos que hay un error
			}
		};
		System.out.println("Días: " + dias);
		sc.close();
	}
}