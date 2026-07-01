package aula12;

public class Ex04 {
    // criar o metodo baskhara que recebe como parametro os valores de a,b,c
    // e mostra as raizes da equação: x = (-b +/- raiz(b^2 - 4ac))/2a
    public static void baskhara(int a, int b, int c){
        double delta = b*b - 4*a*c;
        double x1 = ((-1)*b + Math.sqrt(delta))/(2*a);
        double x2 = ((-1)*b - Math.sqrt(delta))/(2*a);
        System.out.println("x{"+x1+","+x2+"}");
    }
    public static void main(String[] args) {
        baskhara(1, 2, 1);
        baskhara(1, -4, -2);
    }
}
