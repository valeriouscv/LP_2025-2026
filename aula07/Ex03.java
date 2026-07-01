package aula07;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // FOR (Cond.INI; Cond.FIN; INCR/DREC){ .... }
        System.out.println("--- ciclo FOR --------");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }

        // Cond. INI
        // WHILE (Cond.FIN)
        // { .... 
        //      INCR/DECR
        // }
        System.out.println("\n--- ciclo WHILE --------");
        int j=0;
        while (j<10) {
            System.out.print(j+" ");
            j++;
        }

       
        // DO { .... 
        //     ----
        // }WHILE (Cond.FIN)
        System.out.println("\n--- ciclo DO WHILE --------");
        Scanner ler = new Scanner(System.in);
        int nota;
        
        do{
            System.out.print("Nota: ");
            nota = ler.nextInt();
        }while(nota<0 || nota > 20);

        
    }
}
