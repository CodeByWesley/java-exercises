public class usuario {
    public static void main (String [] args){

        SmartTv smartTv = new SmartTv();
            System.out.println("TV Ligada ? " + smartTv.ligado);
            System.out.println("Canal Atual : " + smartTv.canal);
            System.out.println("Volume Atual : " + smartTv.volume);


        smartTv.mudarCanal(02);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.ligar ();
            System.out.println("Novo Status > TV Ligada ? " + smartTv.ligado);

        smartTv.desligar ();
            System.out.println("Novo Status > TV Ligada ? " + smartTv.ligado);
    }
}
