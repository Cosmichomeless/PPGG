
package Java.U9_Herencia;

class formas {
    public static void main(String[] args) {

        Circulo c = new Circulo("Negro", 5);
        System.out.println("*******************************");
        System.out.println("Circulo");
        System.out.println("Color: " + c.getColor());
        System.out.println("Area: " + c.area());
        System.out.println("Perimetro: " + c.perimetro());
        System.out.println("*******************************");
        Cuadrado cc = new Cuadrado("Azul", 5);
        System.out.println("Cuadrado");
        System.out.println("Color: " + cc.getColor());
        System.out.println("Area: " + cc.area());
        System.out.println("Perimetro: " + cc.perimetro());
        System.out.println("*******************************");
        Rectangulo r = new Rectangulo("rojo", 3, 7);
        System.out.println("Rectangulo");
        System.out.println("Color: " + r.getColor());
        System.out.println("Area: " + r.area());
        System.out.println("Perimetro: " + r.perimetro());
        System.out.println("*******************************");
        Triangulo t1 = new Triangulo("Negro", 3, 3);
        System.out.println("Triangulo 1 (completo)");
        System.out.println("Color: " + t1.getColor());
        System.out.println("Area: " + (t1.area() == -1 ? "No se puede calcular" : String.valueOf(t1.area())));
        System.out.println(
                "Perimetro: " + (t1.perimetro() == -1 ? "No se puede calcular" : String.valueOf(t1.perimetro())));
        System.out.println("*******************************");
        Triangulo t2 = new Triangulo("Negro", 3, 0);
        System.out.println("Triangulo 2 (base,altura)");
        System.out.println("Color: " + t2.getColor());
        System.out.println("Area: " + (t2.area() == -1 ? "No se puede calcular" : String.valueOf(t2.area())));
        System.out.println(
                "Perimetro: " + (t2.perimetro() == -1 ? "No se puede calcular" : String.valueOf(t2.perimetro())));
        System.out.println("*******************************");
        Triangulo t3 = new Triangulo("Negro", 3, 3);
        System.out.println("Triangulo 3 (l1, l2, l3)");
        System.out.println("Color: " + t3.getColor());
        System.out.println("Area: " + (t3.area() == -1 ? "No se puede calcular" : String.valueOf(t3.area())));
        System.out.println(
                "Perimetro: " + (t3.perimetro() == -1 ? "No se puede scalcular" : String.valueOf(t3.perimetro())));
    }
}

abstract class Forma {

    private static String color;

    @SuppressWarnings("static-access")
    Forma(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract double area();

    abstract double perimetro();
}

class Circulo extends Forma {

    private int radio;

    public Circulo(String color, int i) {
        super(color);
        this.radio = i;
    }

    public double area() {
        double area = Math.PI * (radio * 2);
        return area;
    }

    public double perimetro() {

        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

}

class Cuadrado extends Forma {

    int lado1;

    public Cuadrado(String color, int i) {
        super(color);
        this.lado1 = i;
    }

    public double area() {
        double area = lado1 * lado1;
        return area;
    }

    public double perimetro() {
        double perimetro = lado1 * 4;
        return perimetro;

    }

}

class Rectangulo extends Cuadrado {

    private int lado2;

    public Rectangulo(String color, int i, int j) {

        super(color, i);
        this.lado1 = i;
        this.lado2 = j;

    }

    public double area() {
        double area = lado1 * lado2;
        return area;

    }

    public double perimetro() {
        double perimetro = (lado1 * 2) + (lado2 * 2);
        return perimetro;
    }

}

class Triangulo extends Forma {

    private int base, altura, lado1, lado2, lado3;

    public Triangulo(String color, int i, int j) {
        super(color);
        this.base = i;
        this.altura = j;
    }

    public Triangulo(String color, int i, int j, int k) {
        super(color); // Add this line to invoke the superclass constructor
        this.lado1 = i;
        this.lado2 = j;
        this.lado3 = k;
    }

    public Triangulo(String color, int base, int altura, int lado1, int lado2, int lado3) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double area() {
        double area = base * altura / 2;
        return area;

    }

    public double perimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;

    }

}