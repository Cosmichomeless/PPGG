package Java.U5_Funciones;

import java.util.Scanner;

public class E5_03 {
	public class AR504 {
		static int maximo(int a, int b) {
		 int max;
		 if (a > b) {
		 max = a;
		 } else {
		 max = b;
		 }
		 return (max);
		 }
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Introduzca un número: ");
		 int a = sc.nextInt();
		 System.out.print("Introduzca otro número: ");
		 int b = sc.nextInt();
		 sc.close();
		 System.out.println("El número mayor es: " + maximo(a, b));
		 }

}}
