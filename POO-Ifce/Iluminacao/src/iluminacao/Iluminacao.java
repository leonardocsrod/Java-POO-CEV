package iluminacao;

public class Iluminacao {

    public static void main(String[] args) {
        // TODO code application logic here
        Lampada1 c1 = new Lampada1();
        c1.ligar();
        c1.desligar();
        c1.cor = "amarela";
        c1.tensao = 20;
        c1.status();
        
        System.out.println("");
        Lampada1 c2 = new Lampada1();
        c2.ligar();
        c2.cor = "verde";
        c2.tensao = 30;        
        c2.status();
    }
    
}
