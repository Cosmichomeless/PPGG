package Java.U6_Arrays;

import java.util.Arrays;

public class Orden_array {
	static int maximo(int t[]) {
		int max = t[0];
		for (int e : t) {
			if (e > max) {
				max = e;
			}
		}
		return (max);
	}

	public static void main(String[] args) {
		int numeros[] = { 4, -6, 8, 9, 0, 3 };
		System.out.println("\nEl número mayor es: " + maximo(numeros));
		System.out.println("El array ordenado es:");
		Arrays.sort(numeros);
		for (int num : numeros) {
			System.out.print(num + " ");
		}

	}
}
