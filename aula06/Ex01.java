package aula06;

public class Ex01 {
    public static void main(String[] args) {
        int a=2,b=3,e=3;    // a=2, b=3, e=3
        int d= a--*b;       // a=2, b=3,d=(2)*3=6,e=3, a depois: 1
        int c=--b*a;        // a=1, b=2,c=(2)*1=2,c=2,d=6,e=3
        c=c--*2;            // a=1, b=2, c=(2)*2=4,c=4,d=6,e=3
        int h=5/3;          // a=1, b=2, c=4, d=6, e=3, h=1
        int f=e*--e-1;      // a=1, b=2, c=4, d=6, e=2, f=3*2-1=6-1=5, f=5, h=1
        int g=7%2;          // a=1, b=2, c=4, d=6, e=2, f=5, g=1, h=1
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        System.out.println("e: "+e);
        System.out.println("f: "+f);
        System.out.println("g: "+g);
        System.out.println("h: "+h);
    }
}
