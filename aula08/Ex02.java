//Fibonacci
package aula08;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //criar um objeto de leitura
        System.out.print("Digite um numero: ");
        int n = ler.nextInt();
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.println("-----> Sequencia de Fibonacci ");
        System.out.print(a + " " +b + " "); //mostrar os 2 primeiros numeros da sequencia
        while(c <= n){
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
        ler.close(); //fechar o objeto de leitura
    }
}
