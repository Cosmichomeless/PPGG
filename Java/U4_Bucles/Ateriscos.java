package Java.U4_Bucles;

import java.util.Scanner;

public class Ateriscos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba n: ");
		int n = sc.nextInt();
		for (int fila = 1; fila <= n; fila++) {
			for (int col = fila; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
