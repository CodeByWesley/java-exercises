public class SmartTv {
    boolean ligado = false;
    int volume = 25;
    int canal = 1;


    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentaCanal(){
        canal++;
    }
    public void diminiuirCanal(){
        canal--;
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para : " + volume);
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumetando o volume o volume para : " + volume);
    }
    public void ligar() {
        ligado = true;
    }
    public void desligar(){
        ligado=false;
        }
    }
