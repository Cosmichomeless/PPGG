package Java.U5_Funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Maximos_minimos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime de cuanto quieres el array");

		int valor = sc.nextInt();
		int t[] = new int[valor];
		System.out.println("Dime lo valores para el array");
		for (int i = 0; i < t.length; i++) {
			t[i] = sc.nextInt();
		}

		mostrar(t);

		maximo(t,valor);
		minimo(t,valor);
		int a[] = media(t);

		sc.close();
	}

	public static void mostrar(int[] t) {
		System.out.println("tus numeros introducidos son" + Arrays.toString(t));
	}

	static void maximo(int t[],int valor) {
		Arrays.sort(t);
		System.out.print("el valor maximo introducido es ");
		System.out.println(t[valor-1]);
	}

	static void minimo(int t[], int valor) {
		Arrays.sort(t);
		System.out.print("el valor minimo introducido es ");

		System.out.print(t[0]);
	}

	public static int[] media(int[] t) {

		int a[] = new int[t.length];
		for (int i = 0; i < t.length; i++) {
			a[i] = t[i] / 5;

		}
		return a;
}
}