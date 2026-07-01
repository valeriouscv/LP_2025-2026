package aula14;

public class Ex04 {
    //Crie um vetor de 10 elementos.
    //preencha-o com dados fornecidos pelo utilizador.
    //calcular o menor elemento, o maior e o somatório de todos os elementos.
    public static void main(String[] args) {
       int[]idades = {10,11,12,13,20,15,19,14,18,9};
       //              0  1
       int menor = idades[0];
       int maior = idades[0];
       int soma  = idades[0];

       for(int i=1; i<idades.length;i++){
            if(idades[i] < menor) menor=idades[i];
            if(idades[i] > maior) maior = idades[i];
            soma += idades[i];
       }
       System.out.println("Menor: "+menor);
       System.out.println("Maior: "+maior);
       System.out.println("Soma: "+soma);
    }

}
