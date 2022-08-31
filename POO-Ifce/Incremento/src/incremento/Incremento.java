package incremento;

public class Incremento {

    public static void main(String[] args) {
        int x, y, z;
        x = 42;
        System.out.println("x: " + x);
        System.out.println("");
        y = x++;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("");
        z = ++x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("");
        x = ++z + z;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
    
}
