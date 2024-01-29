package Java.U4_Bucles;

import java.util.Scanner;

public class For3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aprobados = 0, suspensos = 0;
		for (int i = 1; i <= 6; i++) {
		System.out.println("Nota del alumno número " + i + ": ");
		int nota = sc.nextInt();
		if (nota == 4) {
		} else if (nota >= 5) {
		aprobados++;
		} else if (nota < 4) {
		suspensos++;
		}
		}
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Suspensos: " + suspensos);
		sc.close();

		
}}
