package br.com.chronosacademy.media;

public class MilhasMaritimas {

    public static void main(String[] args) {

     /*  Sabendo que uma milha marítima equivale a um mil, oitocentos e cinqüenta e
        dois metros e que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.

        Dica: 1milha = 1852m
        1milha = 1.852km
     */

       int qtdMilhas = 4;
       float milha = 1825/ 1000f;

       float km = qtdMilhas * milha;

        System.out.println("Milhas convertidas: " +milha);
        System.out.println("Milhas convertidas em Km: " +km);
    }
}
