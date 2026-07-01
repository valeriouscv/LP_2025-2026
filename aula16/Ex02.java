package aula16;
import java.util.ArrayList;

public class Ex02{
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ivanilson");
        lista.add("melany");
        lista.add("jefferson");
        lista.add("eric");

        //ciclo aprimorado (foreach)
        System.out.println("foreach");
        for (String aluno : lista) {
            System.out.println(aluno);
        }
        System.out.println("for tradicional");
        //ciclo por posição
        for(int i=0; i < lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
}