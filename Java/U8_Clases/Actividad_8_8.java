/*
 * package Java.U8_Clases;
 * 
 * import java.util.Scanner;
 * 
 * Definir una clase que permita controlar un sintonizador digital de emisoras
 * FM; concretamente, se desea dotar al controlador de una interfaz que permita
 * subir (up) o bajar (down) la frecuencia (en saltos de 0,5 MHz) y mostrar la
 * frecuencia sintonizada en un momento dado (display). Supondremos que el
 * rango de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz y
 * que, al inicio, el controlador sintonice la frecuencia indicada en el
 * constructor o
 * 80 MHz por defecto. Si durante una operación de subida o bajada se sobrepasa
 * uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del
 * extremo contrario. Escribir un pequeño programa principal para probar su
 * funcionamiento.
 * public class Main {
 * public static void main(String[] args) {
 * SintonizadorFM a, b;
 * a = new SintonizadorFM(107);
 * a.up(); a.up(); a.up(); a.up();
 * a.display();
 * b = new SintonizadorFM(80.5);
 * b.down(); b.down(); b.down();
 * b.display();
 * a = new SintonizadorFM(200);
 * a.display();
 * }
 * }
 * 
 * 
 * public class Actividad_8_8 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Ingrese la frecuencia de inicio en MHz: ");
 * 
 * sc.close();
 * }
 * 
 * }
 * 
 * class sintonizador {
 * 
 * private int frecuencia;
 * 
 * }
 */