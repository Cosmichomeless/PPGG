package Java.U5_Funciones;

import java.util.*;

public class Multiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el tamaño para el array");
		int dimension = sc.nextInt();
		int t[] = new int[dimension];
		System.out.println("Dime lo valores para el array");
		for (int i = 0; i < t.length; i++) {
			t[i] = sc.nextInt();
		}

		mostrar(t);
		System.out.println("Introduce un valor para multiplicar los numeros");
		int valor = sc.nextInt();
		int a[] = multiplicar(t, valor);
		mostrar(a);
		
		sc.close();
	}

	public static void mostrar(int[] t) {
		System.out.println("tus numeros introducidos son" + Arrays.toString(t));

	}

	public static int[] multiplicar(int[] t, int x) {

		int a[] = new int[t.length];
		for (int i = 0; i < t.length; i++) {
			a[i] = t[i] * x;

		}
		return a;
	}}
