package br.com.chronosacademy.media;

public class LeiOhm {
    public static void main(String[] args) {
       /*

                Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica.
                Dica: Fórmula de Ohm

                R = U / I
                R * I = U
                U = R * I

       */

      int r = 100;
      int i = 2;
      int u = r * i;

        System.out.println("Resultado: "+u+"v");


    }

}
