package petshop;

public class Teste {

    public static void main(String[] args) {
        Endereco end1 = new Endereco("A", 500, "60834-472");
        Petshop pet1 = new Petshop("000.000.000/0001-00");
        Cao dog1 = new Cao("Lulu", "SRD", 10.5);
        Gato cat1 = new Gato("Juju", "Felinus", 5.2);
        Gato cat2 = new Gato("Fifi", "Felinus", 2.0);
        dog1.alimentar(200.0);
    }
    
}
