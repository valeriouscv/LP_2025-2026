package aula05;

public class Ex04 {
    public static void main(String[] args) {
        //Ficha02Ex02b
        int a=2, b=3;
        int d=a--*b;
        int c = --b*a;
        c= c-- *2;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
    }
}
