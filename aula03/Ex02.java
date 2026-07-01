package aula03;

public class Ex02 {
    public static void main(String[] args) {
        
        int a= 3;
        float b=a;
        System.out.println(b);

        byte c = 127;
        int d  = c;
        System.out.println(d);

        int e = 300;
        byte f = (byte) e;
        System.out.println(f);

        float g = 3.1415f;
        int h = (int) g;
        System.out.println(h);

        //Classe Wrapper permite converter String para tipos primitivos
        String i = "3";
        int j = Integer.parseInt(i);
        double k = Double.parseDouble(i);
        short l = Short.parseShort(i);
        byte m = Byte.parseByte(i);
    }
}
