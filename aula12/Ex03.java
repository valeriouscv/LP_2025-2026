package aula12;
import java.util.Scanner;

public class Ex03 {
    public static char getLetra(){
        Scanner ler = new Scanner(System.in);
        char letra = ler.next().charAt(0);
        return letra;
    }
    public static void main(String[] args) {
        System.out.println("Digite uma letra: ");
        char letra = getLetra();
        System.out.println("Letra: "+letra);
    }
}
