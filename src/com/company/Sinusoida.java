package com.company;


public class Sinusoida {

    public static void Test() throws InterruptedException {

        double k = 0; double Predkosc = 0.01;
        double Cykl = 2*Math.PI;
        boolean kierunek = true;
        double sinusoida;


        while(true){

        if(k<=0) kierunek = true;
        else if(k >= Cykl) kierunek = false;

        if(kierunek) k+=Predkosc;
        if(!kierunek) k-=Predkosc;

        sinusoida = Math.sin(k);


        System.out.println(sinusoida+1 + " ");
            Thread.sleep(10);
        }


    }
}
