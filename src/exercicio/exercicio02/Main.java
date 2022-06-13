package exercicio.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Retangulo reac = new Retangulo();

        System.out.println("Entre com o numero de largura e altura : ");
        // lendo os numero
        reac.largura = entrada.nextDouble();
        reac.altura = entrada.nextDouble();

        System.out.printf("AREA = %.2f%n", reac.area());
        System.out.printf("PERIMETRO = %.2f%n", reac.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", reac.diagonal());




    }
}
