package ternarioencadeadoidade;

public class TernarioEncadeadoIdade {

    public static void main(String[] args) {
        int idade = 17;
        String s = idade < 18 ? "Menor" : idade >= 18 && idade < 60 ? "Maior" : "Idoso";
        System.out.println("Situação: " + s);
    }
    
}
