package aula12;

import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual é o teu nome? ");
        String nome = ler.nextLine().toLowerCase();
        int ultEsp      = nome.lastIndexOf(' '); 
        int tam         = nome.length();
        String apelido  = nome.substring(ultEsp+1, tam);
        String email = ""+nome.charAt(0);
        email+= apelido + ".l25@us.edu.cv";
        System.out.println("email: "+email);
        ler.close();
    }
}