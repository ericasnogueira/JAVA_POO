package membrosEstaticos.exercicioVersao03;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("entre com o valor do raio");
        double raio = entrada.nextDouble();

        double c = Calculator03.circunferencia(raio);
        double v = Calculator03.volume(raio);

        System.out.printf("Circunferência : %.2f%n", c);
        System.out.printf("Volume  : %.2f%n ", v);
        System.out.printf("PI VALOR :  %.2f%n ", Calculator03.PI);


    }
}
