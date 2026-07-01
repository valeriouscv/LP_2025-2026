package aula10;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //criar o email institucional
        //Exemplo: 
        //Nome: Valerio Domingos Rosa dos Santos
        //Email: valerio.santos@us.edu.cv

        Scanner ler = new Scanner(System.in);
        System.out.println("Seu nome completo: ");
        String nome = ler.nextLine().toLowerCase();
 
        int posEsp = nome.indexOf(' ');
        int posUltEsp = nome.lastIndexOf(' ');
        int tam    = nome.length();
        String primeiroNome  = nome.substring(0,posEsp);
        String ultimoApelido = nome.substring(posUltEsp+1,tam);
        String email = primeiroNome + "."+ultimoApelido+"@us.edu.cv";
        System.out.println("email: "+email);
        ler.close();

    }
}
