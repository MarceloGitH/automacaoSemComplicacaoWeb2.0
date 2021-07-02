package br.com.chronosacademy.media;


public class MaiorDistintos {

    /*
        Com três valores distintos.
        Exibir o maior deles.

     */

    public static void main(String[] args) {
        int valorA = 5;
        int valorB = 4;
        int valorC = 2;

        if (valorA > valorB && valorA > valorC) {
            System.out.println("O maior valor é: " + valorA);
        } else if (valorB > valorA && valorB > valorC) {
            System.out.println("O maior valor é: " + valorB);
        } else {
            System.out.println("O maior valor é: " + valorC);
        }
    }
}