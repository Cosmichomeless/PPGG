package Java.U10_Interfaces;

public class anonim {
    public static void main(String[] args) {

        Sonido sss = new Sonido() {
            public void voz() {
                System.out.println("Guauuuu");
            }
        };
        sss.voz();

    }

}
