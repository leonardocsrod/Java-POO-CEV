package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        /*
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("Média: " + m);
        
        int numero = 5;
        numero++;
        System.out.println("Número: " + numero);
        
        int a = 2;
        a += 3;
        System.out.println("a: " + a);
        int b = Math.abs(-10);
        System.out.println("b: " + b);
        //double c = Math.floor(3.9);
        //System.out.println("c: " + c);
        double c = Math.ceil(3.2);
        System.out.println("c: " + c);
        double d = Math.round(3.6);
        System.out.println("d: " + d);
        */
        double e = Math.random();
        System.out.println("e: " + e);
        int n = (int) (5 + e * (10 - 5));//entre 5 e 10
        int n1 = (int) (15 + e * (50 - 15));//entre 15 e 50
        System.out.println("n: " + n);
        System.out.println("n1: " + n1);
    }
    
}
