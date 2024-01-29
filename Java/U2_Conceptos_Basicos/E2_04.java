package Java.U2_Conceptos_Basicos;

import java.util.Scanner;

public class E2_04 {
	public static void main(String[] args) {
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba su edad: ");
		edad = sc.nextInt();
		edad = edad + 1;
		System.out.println("El próximo año su edad será: " + edad + " años");
		sc.close();
	}

}
