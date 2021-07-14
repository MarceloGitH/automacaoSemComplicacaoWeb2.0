package br.com.chronosacademy.media;

/*

Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...

 */

public class Fibonnaci {
    public static void main(String[] args) {
        int fibonnaci = 0;
        int anterior = 1;

        for (int i = 1; i < 31; i++) {
            fibonnaci = fibonnaci + anterior;
            anterior = fibonnaci - anterior;

            System.out.println("Valor Fibonnaci: "+fibonnaci);

        }
    }
}
