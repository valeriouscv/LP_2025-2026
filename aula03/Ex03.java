package aula03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        //leitura do teclado(objeto de leitura)
        Scanner ler = new Scanner(System.in);

        //pedir informacoes ao utilizador
        System.out.print("Nome: ");
        String nome = ler.nextLine();

        System.out.print("Morada: ");
        String morada = ler.nextLine();

        System.out.print("Idade: ");
        int idade = ler.nextInt();
        ler.nextLine(); //limpar o buffer do teclado

        System.out.print("Sexo: ");
        char sexo = ler.nextLine().charAt(0);
       
        System.out.print("Nota: ");
        double nota = ler.nextDouble();

        //mostrar essas informacoes
        System.out.println("Ola, eu sou "+nome+ " e tenho "+ idade + " anos, e moro em "+ morada + " e sou do sexo "+sexo+ " e tive "+nota+" valores na disciplina LP");
    }
}
