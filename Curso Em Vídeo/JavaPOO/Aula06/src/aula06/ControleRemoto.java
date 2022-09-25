package aula06;

public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //método construtor
    public ControleRemoto(int volume) {
        this.volume = volume;
    }
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;                
    }
    
    //métodos especiais
    private int getVolume(){
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    private boolean getTocando() {
        return tocando;
    }
    private void setTocanco(boolean tocando) {
        this.tocando = tocando;
    }
    
    //métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i < this.getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("Tocando: " + this.getTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()){
            this.setTocanco(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocanco(false);
        }
    }
    
    
}
