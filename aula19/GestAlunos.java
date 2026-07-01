package aula19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestAlunos {
    //metodos
    //carregar do ficheiro
    public ArrayList<Aluno> carregarFich() throws FileNotFoundException{
        ArrayList<Aluno> lista = new ArrayList<>();
        File ficheiro = new File("aula19/alunos.csv");
        if(ficheiro.exists()){
            Scanner ler = new Scanner(ficheiro);
            String linha = ler.nextLine(); //ignorar a primeira linha
            while (ler.hasNext()) {
                linha = ler.nextLine();
                String[]sep = linha.split(";");
                int codAluno = Integer.parseInt(sep[0]);
                String nome = sep[1];
                String email = sep[2];
                String telefone = sep[3];
                int notaLP = Integer.parseInt(sep[4]);
                int notaBD = Integer.parseInt(sep[5]);
                int notaES = Integer.parseInt(sep[6]);
                int notaAMI = Integer.parseInt(sep[7]);
                int notaAL = Integer.parseInt(sep[8]);

                Aluno aluno = new Aluno();
                aluno.codAluno = codAluno;
                aluno.nomeAluno = nome;
                aluno.telefone = telefone;
                aluno.email = email;
                aluno.disciplinas[0] = notaLP;
                aluno.disciplinas[1] = notaBD;
                aluno.disciplinas[2] = notaES;
                aluno.disciplinas[3] = notaAMI;
                aluno.disciplinas[4] = notaAL;

                //colocar aluno na lista
                lista.add(aluno);
            }
        }else{
            System.out.println("O ficheiro "+ficheiro.getAbsolutePath()+" nao foi encontrado");
        }

        return lista;
    }
    //inserir aluno
    //listar todos os alunos
    //consultar info de um aluno
    //calcular e mostrar media
    //eliminar alunos
    //guardar no ficheiro
    public void guardarFicheiro(ArrayList<Aluno> lista) throws FileNotFoundException{
        File ficheiro = new File("aula19/KelottuAlunos.csv");
        Aluno aluno = lista.get(0);
        String linha = ""+aluno.codAluno+";"+aluno.nomeAluno;
        PrintWriter escrita = new PrintWriter(ficheiro);
        escrita.print(linha);
        escrita.close();
        
    }
}
