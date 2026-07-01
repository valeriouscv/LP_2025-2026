package aula06;

import java.text.ListFormat.Style;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //Operadores - Relacionais
        Scanner ler = new Scanner(System.in);
        //pedir informacoes ao utilizador
        System.out.println("Nome: ");
        String nome = ler.nextLine();
        System.out.println("Idade: ");
        int idade = ler.nextInt();
        ler.nextLine(); //limpar o buffer do teclada
        System.out.println("Sexo: ");
        char sexo = ler.nextLine().charAt(0);
        /*
        if(idade >=18 || sexo == 'f'){ //operador: ou representado por: ||
            System.out.println("Benvindo a nossa Discoteca");
        }else{
            System.out.println("Kapri!!!!!");
        }*/
       if(idade >=18 && sexo == 'f'){ //operador e: representado por: &&
            System.out.println("Ola,"+nome+".. Seja benvindo a nossa Discoteca");
        }else{
            System.out.println(nome+" ...Kapri!!!!!");
        }
    }
}
