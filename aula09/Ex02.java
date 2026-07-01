package aula09;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //Equacao 2ºgrau - Formula de Bhaskara (ou Formula Resolvente)
        Scanner ler = new Scanner(System.in);
        System.out.print("valor de a: ");
        int a = ler.nextInt();
        System.out.print("valor de b: ");
        int b = ler.nextInt();
        System.out.print("valor de c: ");
        int c = ler.nextInt();
        //fechar a leitura
        ler.close();

        //calcular o delta. delta = b^2 - 4ac
        double delta = b*b - 4*a*c;
        if(delta<0){
            System.out.println("nao vamos calcular raiz de numero negativo");
            return;
        }
        double x1 = ((-1)*b + Math.sqrt(delta))/(2*a);
        double x2 = ((-1)*b - Math.sqrt(delta))/(2*a);
        System.out.println("Raizes {"+x1+","+x2+"}");
    }
}
