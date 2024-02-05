package Java.U3_Condicionales;

import java.util.Scanner;

public class Condicional_IF_V2 {
	/*
	 * Vamos a introducir por teclado un número entero. Para saber si es par * o
	 * impar comprobamos el resto de dividir por 2.
	 */
	public class Main { public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int num; //número introducido por el usuario
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		if (num % 2 == 0) { //si num es par
		System.out.println("Es par");
		}
		 if (num % 2 != 0) { // es imparr
		System.out.println("Es impar");
		}
	}
	}		

	}		

}
