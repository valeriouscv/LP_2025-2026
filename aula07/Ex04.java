package aula07;

public class Ex04 {
    public static void main(String[] args) {
        //CICLO INFINITO
        int i=0;
        while(true){
            System.out.println(i);
            if(i==9999) break;
            i++;
        }
        System.out.println("--- SAIU DO CICLO ---");

        /*for(;;){
            System.out.println("");
        }*/
    }
}
