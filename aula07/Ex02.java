package aula07;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Indique o dia da semana: ");
        int dia = ler.nextInt();
        switch (dia) {
            case 1: System.out.println("domingo");  break;
            case 2: System.out.println("segunda");  break;
            case 3: System.out.println("terça");    break;
            case 4: System.out.println("quarta");   break;
            case 5: System.out.println("quinta");   break;
            case 6: System.out.println("sexta");    break;
            case 7: System.out.println("sabado");   break;
            default: System.out.println("dia invalido"); break;
        }
    }
}
