/*  Enunciado: Exo 4
Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. 
Escreva um programa que determine e escreva a menor e a maior idade e sua respetiva posições
*/
package aula16;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] idades = new int[10];
        //ler todas as idades ecalcular menor, maior e as posicoes
        int menor = Integer.MAX_VALUE; 
        int maior = Integer.MIN_VALUE;
        int posMaior = 0; 
        int posMenor = 0;

        for(int i=0; i < idades.length; i++){
            System.out.print("idades["+i+"] = ");
            idades[i] = ler.nextInt(); 
            if(idades[i] < menor){
                menor = idades[i];
                posMenor = i;
            }
            if(idades[i] > maior){
                maior = idades[i];
                posMaior = i;
            }
        }
        System.out.println("Menor Idade: "+menor+ " foi encontrada na pos: "+posMenor);
        System.out.println("Maior Idade: "+maior+ " foi encontrada na pos: "+posMaior);
        ler.close();
    }
}
