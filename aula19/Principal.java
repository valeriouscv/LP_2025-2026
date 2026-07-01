package aula19;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {
        public static char menu() {
        Scanner ler = new Scanner(System.in);
        System.out.println("+----------------------------+");
        System.out.println("|      Gestao de Alunos      |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - inserir                |");
        System.out.println("| 2 - listar                 |");
        System.out.println("| 3 - consultar              |");
        System.out.println("| 4 - media                  |");
        System.out.println("| 5 - eliminar               |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - sair                   |");
        System.out.println("+----------------------------+");
        System.out.print("Escolha uma opcao: ");
        char op = ler.nextLine().charAt(0);
        //ler.close();
        return op;
    }
    public static void main(String[] args) throws FileNotFoundException {
        GestAlunos gestAlunos = new GestAlunos();
        //carregar do ficheiro
        ArrayList<Aluno> lista = gestAlunos.carregarFich();
        gestAlunos.guardarFicheiro(lista); //vai escrever no ficheiro
        char op;
        do {
            op = menu();
            switch (op) {
                case '1':
                    System.out.println(" inserir aluno");
                    break;
                case '2':
                    System.out.println(" listar alunos");
                    break;
                case '3':
                    System.out.println(" consultar dados do aluno");
                    break;
                case '4':
                    System.out.println(" media das nota do aluno");
                    break;
                case '5':
                    System.out.println(" eliminar");
                    break;
                case '0':
                    //guardar as informações do aluno no ficheiro
                    System.out.println(" escolheu sair");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        } while (op != '0');
    }
}
