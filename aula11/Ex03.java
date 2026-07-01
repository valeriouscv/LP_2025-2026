package aula11;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("como te chamas? ");
        String nome = ler.nextLine().toUpperCase();
        System.out.print("nome: " );
        ler.close();
        for(int i=nome.length()-1; i>=0; i--){
            System.out.print(nome.charAt(i));
        }
    }
}
