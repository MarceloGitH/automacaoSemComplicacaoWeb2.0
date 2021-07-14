package br.com.chronosacademy.media;

/*
Exibir a tabuada do número 4 no intervalo de dez a um.
 */

public class TabuadaQuatro {
    public static void main(String[] args) {
        int valor =4;
/*
        int tabuada =4;
        for(int i = 10; i > 0; i--){
            System.out.println(tabuada+ " X "+i+" = "+tabuada * i);
        }
*/
        tabuada(valor);
    }

    public static void tabuada (int valor) {
        for(int i = 10; i > 0; i--){
            System.out.println(valor+ " X "+i+" = "+valor * i);
        }
    }
}
