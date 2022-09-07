package comparastring;

public class ComparaString {

    public static void main(String[] args) {
        String nome1 = "Leonardo";
        String nome2 = "Leonardo";
        String nome3 = new String("Leonardo");
        String res = (nome1.equals(nome3)) ? "igual" : "Diferente";
        System.out.println("res: " + res);
    }
    
}
