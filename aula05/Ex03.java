package aula05;

public class Ex03 {
    public static void main(String[] args) {
        //Ficha02Ex03)
        int a=2, b=a;
        a = a++ * ++b;
        b = b++ * a;
        int c = a--;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }
}
