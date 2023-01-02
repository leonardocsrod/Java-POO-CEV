package aulapoo;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;

    
    //constructor
    public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
}
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public static void main(String[] args) {
        Pessoa p2 = new Pessoa("Carlos", 40);
        System.out.println("Pessoa: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
    }
    
}
