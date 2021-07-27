package br.com.chronosacademy.media;

/*

Crie um método que receba um array de dez valores inteiros.
Esse método terá que exibir:

A) O maior valor;
B) A soma dos valores;
C) A média aritmética dos valores;

O método deverá ser executado através de uma aplicação.


 */

public class Vetor {

    public static void main(String[] args) {
        int[] vetor = {2, 57, 7, 12, 5, 6, 9, 7, 1, 10, 3, 53};
        exibeResultados(vetor);
    }
    public static void exibeResultados(int[] vetor){
        int maior = 0;
        int soma = 0;
        float media = 0f;

        for (int valor: vetor) {
            if (valor > maior){
                maior = valor;
            }

            soma += valor;

        }
        media = soma / (float)vetor.length;

        System.out.println("O maior valor é: "+maior);
        System.out.println("Soma dos valores é: "+soma);
        System.out.println("A media é: "+media);

    }
}
