package aula15;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Texto: ");
        String texto = ler.nextLine().toLowerCase();
        char[] vogais = { 'a','e', 'i', 'o', 'u' };
        //posicao          0   1    2    3    4
        int[] qtdVogais= { 0,  0,   0,   0,   0 };

        //percorer cada letra do texto
        for (int l = 0; l < texto.length(); l++) {
            char letra = texto.charAt(l);  // pegar a letra do texto
            for (int i = 0; i < vogais.length; i++) { //percorrer cada vogal
                if(letra == vogais[i]) qtdVogais[i]++; //verificar se a letra corresponde ao vogal e contabilizar
            }
        }

        //mostar a ocorrencia de cada vogal
        for(int i=0; i<vogais.length;i++){
            if(qtdVogais[i] !=0)
                System.out.println(vogais[i] + " aparece "+qtdVogais[i]+" vez(es)");
        }
        ler.close();
    }
}