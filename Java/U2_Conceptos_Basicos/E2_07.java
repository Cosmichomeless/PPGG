package Java.U2_Conceptos_Basicos;
import java.util.Scanner;

public class E2_07 {
	public static void main(String[] args) {
		double radio;
		double area, longitud;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba el radio: ");
		radio = sc.nextDouble();
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El área del círculo es: " + area);
		sc.close();

		}

}
