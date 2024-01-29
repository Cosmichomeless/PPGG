package Java.U5_Funciones;

import java.util.*;

public class Recursividad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.print("Introduzca base (real): ");
		double base = sc.nextDouble();
		System.out.print("Introduzca el exponente: ");
		int exp = sc.nextInt();
		sc.close();
		System.out.println("El resultado es: " + aElevadoN(base, exp));
	}

	static double aElevadoN(double a, int n) {
		double res;
		if (n == 0) {
			res = 1;
		} else {
			res = a * aElevadoN(a, n - 1);
		}
		return res;

	}
}
