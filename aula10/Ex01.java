package aula10;

import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto = "sabura";
        //System.out.println(texto.length());
       // char letra = ler.next().charAt(0);
        //System.out.println("letra: "+letra);

        int pos = texto.indexOf('b');
        System.out.println("posicao da letra: "+pos);

    }
}