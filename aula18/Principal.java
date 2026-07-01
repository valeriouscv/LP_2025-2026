package aula18;
public class Principal{
    public static void main(String[] args) {
        Data hj = new Data();
        hj.ano = 2026;
        hj.mes = 6;
        hj.dia = 23;
        System.out.println(hj.dia+"/"+hj.mes+"/"+hj.ano);

        Aluno aluno = new Aluno();
        aluno.codAluno = 2233;
        aluno.email = "aluno@us.edu.cv";
        aluno.nome = "Djom Kansu";
        aluno.telefone = "(+238) 912-34-56";
        System.out.println("Olá, "+aluno.nome);

        
    }
}