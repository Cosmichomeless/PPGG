package Java.EV3;

import java.util.Scanner;

public class Barquitos {

    /*
     * El programa creará un tablero de juego de 10x10 posiciones y colocará 10
     * barcos de un
     * tamaño de 1 sola posición. Los barcos no pueden estar pegados, es decir,
     * tiene que haber un
     * espacio, al menos, entre un barco y el siguiente.
     * Se le pide al usuario las coordenadas de disparo de manera Fila: A Columna:4.
     * Se debe validar que la fila sea de A hasta K y la columna del 1 al 10
     * A continuación, debe decir si ha sido TOCADO o AGUA y mostrar el tablero con
     * los disparos
     * hechos, y los aciertos.
     * Si en la COLUMNA el usuario introduce un 99, se mostrará el tablero con los
     * barcos que el
     * programa ha colocado junto con los disparos que ha realizado el usuario.
     * La visualización del tablero después de cada tirada será de la siguiente
     * manera
     * La O significa que ha sido agua, y el * significa que has hundido un barco
     * Como se ha dicho antes, si el usuario pone la columna 99, se verán todos los
     * barcos colocados
     * con una X
     */
    public static void main(String[] args) {
        char[][] tablero = inicio();
        colocabarcos(tablero);
        visualiza(tablero, false);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese coordenadas de disparo - Fila (A-K): ");
            char fila = scanner.next().toUpperCase().charAt(0);

            System.out.print("Ingrese coordenadas de disparo - Columna (1-10): ");
            int columna = scanner.nextInt();
            if (columna == 99) {
                visualiza(tablero, true);
                break;
            }

            if (validarCoordenadas(fila, columna)) {
                boolean acierto = disparar(tablero, fila, columna);
                visualiza(tablero, false);

                if (acierto) {
                    System.out.println("¡Tocado!");
                } else {
                    System.out.println("Agua");
                }
            } else {
                System.out.println("Coordenadas inválidas. Inténtelo de nuevo.");
            }
        }

        scanner.close();
    }

    private static char[][] inicio() {
        return new char[10][10];
    }

    private static void colocabarcos(char[][] tablero) {
        for (int i = 0; i < 10; i++) {
            int fila, columna;
            do {
                fila = (int) (Math.random() * 10);
                columna = (int) (Math.random() * 10);
            } while (tablero[fila][columna] != '\0');

            tablero[fila][columna] = 'B';
        }
    }

    private static void visualiza(char[][] tablero, boolean mostrarBarcos) {
        System.out.println("   1 2 3 4 5 6 7 8 9 10");
        System.out.println("  ---------------------");

        for (int i = 0; i < 10; i++) {
            System.out.print((char) ('A' + i) + "| ");
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j] == 'B' && !mostrarBarcos) {
                    System.out.print(" ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static boolean validarCoordenadas(char fila, int columna) {
        return (fila >= 'A' && fila <= 'J') && (columna >= 1 && columna <= 10);
    }

    private static boolean disparar(char[][] tablero, char fila, int columna) {
        int filaI = fila - 'A';
        int colI = columna - 1;

        if (tablero[filaI][colI] == 'B') {
            tablero[filaI][colI] = '*';
            return true;
        } else {
            tablero[filaI][colI] = 'O';
            return false;
        }
    }
}
