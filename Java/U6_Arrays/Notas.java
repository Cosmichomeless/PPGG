package Java.U6_Arrays;

import java.util.*;

public class Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantos alumnos tienes en clase");
		int n = sc.nextInt();
		String alumnos[] = new String[n];

		double notas[] = new double[n];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Dime el nombre del alumno " + (i + 1));

			alumnos[i] = sc.next();
			System.out.println("Dime las notas del alumno " + (i + 1));

			notas[i] = sc.nextDouble();

		}
		notaMax(alumnos, notas);

		notaMin(alumnos, notas);
		mostrar(alumnos, notas);

		sc.close();

	}

	static void notaMax(String alumnos[], double notas[]) {
		int Max = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[Max] < notas[i]) {
				Max = i;

			}
		}
		System.out.println("La nota maxima es " + notas[Max]);
		System.out.println(alumnos[Max] + " Es el alumno con la nota maxima");

	}

	static void notaMin(String alumnos[], double notas[]) {
		int Min = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[Min] > notas[i]) {
				Min = i;

			}

		}
		System.out.println("La nota minima es " + notas[Min]);
		System.out.println(alumnos[Min] + " Es el alumno con la nota minima");

	}

	static void mostrar(String alumnos[], double notas[]) {
		System.out.println(Arrays.toString(alumnos));
		System.out.println(Arrays.toString(notas));

	}

}
