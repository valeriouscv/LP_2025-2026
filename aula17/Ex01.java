package aula17;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    // Gestão de Alunos
    public static char menu() {
        Scanner ler = new Scanner(System.in);
        System.out.println("+----------------------------+");
        System.out.println("|      Gestao de Alunos      |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - inserir                |");
        System.out.println("| 2 - listar                 |");
        System.out.println("| 3 - pesquisar              |");
        System.out.println("| 4 - remover                |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - sair                   |");
        System.out.println("+----------------------------+");
        System.out.print("Escolha uma opcao: ");
        char op = ler.nextLine().charAt(0);
        //ler.close();
        return op;
    }

    public static void inserir(ArrayList<String> lista) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Como te chamas? ");
        String nome = leitor.nextLine();
        lista.add(nome);
        //leitor.close();
    }

    public static void listar(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("A lista encontra-se vazia");
            return;
        }
        System.out.println(" --> Lista de Alunos <-----\n");
        for (String nomeAluno : lista) {
            System.out.println(nomeAluno);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        char op;
        do {
            op = menu();
            switch (op) {
                case '1':
                    inserir(lista);
                    break;
                case '2':
                    listar(lista);
                    break;
                case '3':
                    System.out.println(" escolheu Pesquisar");
                    break;
                case '4':
                    System.out.println(" escolheu Remover");
                    break;
                case '0':
                    System.out.println(" escolheu Kaprir");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        } while (op != '0');

    }
}
