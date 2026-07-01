package aula13;

import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        //Ficha03 - Ex04
        //Exemplo: Maria Graça Pimenta = MGP
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = ler.nextLine().toUpperCase();
        String iniciais =""+ nome.charAt(0); //1a letra
        for(int i=0; i< nome.length(); i++){
            char letra = nome.charAt(i); //as outras iniciais
            if(letra == ' '){
                iniciais += nome.charAt(i+1);
            }
        }
        System.out.println("Iniciais: "+iniciais);
        ler.close();
    }
}