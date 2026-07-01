package aula18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestAlunos {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Aluno> lista = new ArrayList<>();
        File fich = new File("aula18/alunos.csv");
        if(fich.exists()){
            //System.out.println("ficheiro existe");
            Scanner ler = new Scanner(fich);
           
            //ler uma linha do ficheiro
            //String linha = ler.nextLine();
            //System.out.println(linha);

            //separar a linha do ficheiro
            //String[] sep = linha.split(";");
            //System.out.println("Nome: "+sep[1]);

            //ler todos os alunos do ficheiro csv e colocar numa coleção (ArrayList) de alunos
            while(ler.hasNext()){
                //ler cada linha do ficheiro
                String linha = ler.nextLine();
                //separar cada linha por ";".
                String[] sep = linha.split(";");
                //sep[0] -> codAluno
                //sep[1] -> nome
                //sep[2] -> telefone
                //sep[3] -> email
               
                //cirar um aluno
                Aluno aluno = new Aluno();
                aluno.codAluno  = Integer.parseInt(sep[0]); //converter para inteiro
                aluno.nome      = sep[1];
                aluno.telefone  = sep[2];
                aluno.email     = sep[3];
                
                //colocar o aluno na lista
                lista.add(aluno);
            }
        }else{
            System.out.println("Não foi encontrado o ficheiro "+fich.getName());
        }
        
    }
}
