import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("idade: ");
        int idade = ler.nextInt();

        /*if(idade > 45){
            System.out.println("Kota");
        }else{
            System.out.println("Jovem");
        }*/

        //operador - ternario  (condicao) ? verdade : falso
        //String msg = (idade > 45)? "Kota":"Jovem";
        System.out.println((idade > 45)? "Kota":"Jovem");
    }
}
