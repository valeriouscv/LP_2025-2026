//Fatorial de n
package aula08;

import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int n = ler.nextInt();
        long fat = 1L;
        for(int i=n; i>0; i--){
            fat = fat * i;
        }
        System.out.println(n+ " != " + fat);
        ler.close();

    }
}