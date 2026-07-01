package aula04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //Ficha01 - Ex02
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = ler.nextLine();

        System.out.println("Salario: ");
        double salario = ler.nextDouble();

        System.out.println("Total de vendas: ");
        double totalVendas = ler.nextDouble();

        double comissao = totalVendas * 0.15;
        System.out.println("------ Vendedor-----------");
        System.out.println("nome: "+nome);
        System.out.println("salario base: "+salario);
        System.out.println("salario final: "+(salario + comissao));

        ler.close();
    }
}
