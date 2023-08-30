package edu.alexandre.metodos;

public class Usuario{
    public static void main(String [] args) throws Exception{
        //Criando uma classe
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada?: " + smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("\nNovo Status: " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status: " + smartTv.ligada);

        smartTv.diminuirVolume(); 
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("\nO volume está: " + smartTv.volume);


        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(13);
        System.out.println("O canal atual é o: "+ smartTv.canal);
        smartTv.aumentarCanal();


    }
}