package constantes;

public class Constantes {
    public static final double G = 9.81; //declara constante
    public static void main(String[] args) {
        final double CM_POR_POLEGADA = 2.54;//declara constante
        double larguraPapel = 8.5;
        double alturaPapel = 11;
        System.out.println("Gravidade: " + G + "metros por segundo ao quadrado");
        System.out.println("Tamanho em CM: " + (larguraPapel * CM_POR_POLEGADA) + "CM por " + (alturaPapel * CM_POR_POLEGADA) + "CM");
    }
    
}
