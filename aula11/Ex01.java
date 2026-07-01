package aula11;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int qtdPalavras = 1;
        int qtdLetras=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("escreva um texto: ");
        String texto = ler.nextLine();
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)== ' '){
                qtdPalavras++;
            }else{
                qtdLetras++;
            }
        }
        System.out.println("Temos "+ qtdPalavras+ " palavras");
        System.out.println("Temos "+qtdLetras+ " letras");
        ler.close();
    }
}
