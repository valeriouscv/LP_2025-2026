package aula10;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {  
        //criar o email institucional
        //Exemplo: 
        //Nome: Valerio Santos
        //Email: valerio.santos@us.edu.cv

        Scanner ler = new Scanner(System.in);
        System.out.println("Seu nome (primeiro nome e ultimo apelido): ");
        String nome = ler.nextLine();
 
        int posEsp = nome.indexOf(' ');
        int tam    = nome.length();
        String primeiroNome  = nome.substring(0,posEsp);
        String ultimoApelido = nome.substring(posEsp+1,tam);
        String email = primeiroNome + "."+ultimoApelido+"@us.edu.cv";
        System.out.println("email: "+email);
        ler.close();
    }
}
