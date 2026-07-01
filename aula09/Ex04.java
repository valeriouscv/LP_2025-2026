package aula09;

public class Ex04 {
    public static void main(String[] args) {
        //metodos String
        String nome1= "anabela";
        String nome2= "anafeia";
        
        /*if(nome1.equals(nome2)){
            System.out.println("Sao iguais");
        }else{
            System.out.println("Sao diferentes");
        } */
       /*if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("Sao iguais");
        }else{
            System.out.println("Sao diferentes");
        }*/

        /*int res = nome1.compareToIgnoreCase(nome2);
        if(res == 0){
            System.out.println("sao iguais");
        }else{
            if (res<0) {
                System.out.println(nome1+ " eh menor");
            }else{
                System.out.println(nome2+" é maior");
            }
        }*/
       //String resultado = nome1.concat(nome2);
       String resultado = nome1 + nome2;
       System.out.println(resultado);
    }
}
