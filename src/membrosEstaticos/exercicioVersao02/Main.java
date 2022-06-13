package membrosEstaticos.exercicioVersao02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        // instanciando o objeto
        Calculator calc = new Calculator();

        System.out.println("entre com o valor do raio");
        double raio = entrada.nextDouble();

        double c = calc.circunferencia(raio);
        double v = calc.volume(raio);

        System.out.printf("Circunferência : %.2f%n", c);
        System.out.printf("Volume  : %.2f%n ", v);
        System.out.printf("PI VALOR :  %.2f%n ", calc.PI);

    }
}

