package Java.U3_Condicionales;

import java.util.Scanner;

public class E3_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número:");
		int num1 = sc.nextInt();
		System.out.println("Escriba otro número:");
		int num2 = sc.nextInt();
		boolean sonDistintosOAlgunoCero = num1 != num2 || num1 == 0 || num2 == 0;
		System.out.println("Son distintos o alguno es 0: " + sonDistintosOAlgunoCero);
		sc.close();

	}

}
