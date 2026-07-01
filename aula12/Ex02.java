package aula12;
public class Ex02{

    public static int soma(int a, int b){
        int res = a+b;
        return res;
    }
    public static void main(String[] args) {
      int a=3;
      int b=4;
      int resultado = soma(a, b);
      System.out.println("Res: "+resultado);
    }
}