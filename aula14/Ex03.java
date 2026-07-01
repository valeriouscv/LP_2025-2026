package aula14;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //declarar o vetor, reservar espaço para 10 elementos
        int[] idades = new int[10];

        //percorrer o vetor e pedir elementos para o seu preenchimento
        for(int i=0; i<idades.length; i++){
            System.out.print("idades["+i+"] = ");
            idades[i] = ler.nextInt();
        }
        ler.close(); //fechar o objeto de leitura
        
        //mostrar o elemento na posição (índice) 4
        System.out.println(idades[4]);
    }
}
