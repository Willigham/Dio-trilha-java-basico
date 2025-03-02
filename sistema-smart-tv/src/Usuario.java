public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        
        System.out.println("Volume Atutal : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
        
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal(13);
        
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atutal : " + smartTv.volume);


    }
}
