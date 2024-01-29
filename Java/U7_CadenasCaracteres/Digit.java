package Java.U7_CadenasCaracteres;

public class Digit {
    public static void main(String[] args) {

        char c1 = '8';
        char c2 = 'A';
        char c3 = '?';
        char c4;
        char c5 = 'a';
        char c6;
        boolean b;

        b = Character.isLowerCase(c1);
        System.out.println("Es minuscula " + b);
        b = Character.isSpaceChar(c2);
        System.out.println("Es un espacio en blanco " + b);
        b = Character.isDigit(c3);
        System.out.println("Es un digito " + b);

        c4 = Character.toLowerCase(c2);
        System.out.println("Minuscula de c1 es: " + c4);
        c6 = Character.toUpperCase(c5);
        System.out.println("Mayuscula de c5 es: " + c6);

        String a;

        a = "My favorite book is \"Twilight\" by Stephanie Meyer";
        System.out.println(a);

        String cad1 = "Hola";
        String cad2 = "hOLA";

        int AC = 234;

        System.out.println(AC + AC);

        String cad = String.valueOf(AC);
        System.out.println(AC);
        System.out.println(cad);

        if (cad1.equalsIgnoreCase(cad2)) {
            System.out.println("son iguales");

        } else {
            System.out.println("Son diferentes");
        }
        if (cad1.equals(cad2)) {
            System.out.println("son iguales");

        } else {
            System.out.println("Son diferentes");
        }

        int pos = cad1.compareTo(cad2);
        System.out.println(pos);

        int pos2 = cad1.compareToIgnoreCase(cad2);
        System.out.println(pos2);

        String res = cad1 + true;

        res += cad2;
        System.out.println(res);

        System.out.println(cad1.charAt(0));

        for (int i = 0; i < cad1.length(); i++) {
            System.out.println(cad1.charAt(i));

        }

        String cad4 = "En un lugar de cuyo nombre no quiero acordarmme";
        String cad3 = cad4.substring(6, 11);
        System.out.println(cad3);

        cad2=cad4.strip();
        System.out.println(cad2);

        String frase, palabra;
        ;
    }
}