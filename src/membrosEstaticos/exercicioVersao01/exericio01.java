package membrosEstaticos.exercicioVersao01;

import java.util.Locale;
import java.util.Scanner;

public class exericio01 {

    // valor constante não ira mudar
    public static final double PI = 3.14159; // membro estatico

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("entre com o valor do raio");
        double raio = entrada.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Circunferência : %.2f%n", c);
        System.out.printf("Volume  : %.2f%n ", v);
        System.out.printf("PI VALOR :  %.2f%n ", PI);

    }
    // função
    public static double circunferencia(double raio){
        return 2.0 * PI * raio;
    }
    public  static  double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3 ;
    }

}
