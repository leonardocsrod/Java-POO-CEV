package aula02;

public class Aula02 {

    public static void main(String[] args) {
        //instanciar
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        
        c1.status();
        
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.tampada = true;
        
        c2.status();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
    }
    
}