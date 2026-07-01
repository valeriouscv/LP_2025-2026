package aula01;
public class Ex01{
    public static void main(String[] args) {
        byte idade = 18;
        System.out.println("Idade: "+idade);

        //float (32bits) ~6 a 7 digitos de precisão
        //double (64bits) ~14 a 15 digitos de precisão
        float nota =  16.6f;
        System.out.println("Nota: "+nota);

        boolean sinal=false;
        System.out.println("sinal: "+sinal);

        char letra='v';
        System.out.println("Letra: "+letra);

        String texto = "Sabura é la na nôs terra Cabo Verde";
        System.out.println("texto: "+texto);

        long idadeUniverso = 13000000000l;
        System.out.println("idade do universo: "+idadeUniverso);
    }
}