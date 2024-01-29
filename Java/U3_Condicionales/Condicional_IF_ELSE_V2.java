package Java.U3_Condicionales;

import java.util.Scanner;

public class Condicional_IF_ELSE_V2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int aux[] = { 12, 45, 2, 7, 11, 4, 78, 99, 0, 3 };
		System.out.println("Dime un numero para buscar si esta");

		int elemento = sc.nextInt();

		int donde = buscar(aux, elemento);
		if (donde == -1) {
			System.out.println("su numero no esta");
		} else {
			System.out.println("El numero esta en el indice " + donde);
		}
		sc.close();

	}

	public static int buscar(int[] aux, int elemento) {
		/*
		 * int indiceBusqueda = 0; while (indiceBusqueda < aux.length &&
		 * aux[indiceBusqueda] != elemento) { indiceBusqueda++; } if (indiceBusqueda <
		 * aux.length) { return indiceBusqueda; } else { return -1; }
		 */
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] == elemento)
				return i + 1;
		}
		return -1;
		
	}
}
