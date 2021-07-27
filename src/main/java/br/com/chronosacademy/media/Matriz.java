package br.com.chronosacademy.media;

/*
Criar um programa, que tenha três nomes e três sexo correspondente.
Exibir o nome e sexo de cada item da matriz.
 */

public class Matriz {
    public static void main(String[] args) {

        String[][] matriz = {
                {"João", "José", "Arya"},
                {"Masculino", "Feminino", "Binário"}};

        for (int i = 0; i < matriz[0].length; i++) {
            System.out.println("Nome: "+matriz[0][i]+","+" Sexo: "+matriz[1][i]);

        }
    }


}
