package aula17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex02{
    public static void main(String[] args) throws FileNotFoundException {
        File fich = new File("data.txt");
        if(!fich.exists()){
            return;
        }
        Scanner ler = new Scanner(fich);
        while (ler.hasNext()) {
            System.out.println(ler.nextLine());
        }
        ler.close();
    }
}