package testaconversoes2;

public class TestaConversoes2 {

    public static void main(String[] args) {
        char c = 'a';
        System.out.println("c: " + c);
        int i = c;
        System.out.println("i: " + i);
        float f = c;
        System.out.println("f: " + f);
        int j = 101;
        System.out.println("j: " + j);
        char d = (char)j;
        System.out.println("d: " + d);
        boolean b = true;
        //int k = (int)b; tipos incompatíveis
    }
    
}