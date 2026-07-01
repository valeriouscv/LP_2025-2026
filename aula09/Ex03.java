package aula09;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Como te chamas? ");
        //String nome  = ler.next(); //lê apenas uma palavra e não o texto todo
        String nome  = ler.nextLine();
        System.out.println("Nome: "+nome);
    }
}
