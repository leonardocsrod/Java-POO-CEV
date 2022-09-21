/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iluminacao;

/**
 *
 * @author administrador6
 */
public class Lampada1 {
    //atributos
    int tensao;
    String cor;
    boolean ligado;
    
    /*/construtor

    public Lampada1(int tensao, String cor, boolean ligado){
        this.tensao = tensao;
        this.cor = cor;
        this.ligado = ligado;
        
        
    }
    
    */
    
    //métodos
    void ligar(){
        ligado = true;
        System.out.println("A luz foi ligada!");
    }
    
    void desligar(){
        ligado = false;
        System.out.println("A luz foi desligada!");
    }
    
    void status(){
        System.out.println("Tensão: " + tensao);
        System.out.println("Cor: " + cor);
        System.out.println("Ligado/Desligado: " + ligado);
    }
    
}
