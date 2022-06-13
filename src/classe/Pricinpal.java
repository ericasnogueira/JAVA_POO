package classe;

import java.util.Locale;
import java.util.Scanner;

public class Pricinpal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        // chamando a classe triangulo
        Triangulo x,y;

        // instanciando/criando um objeto
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triangulo X : ");
    //  lendo os dados e armazenando eles no atribudo do objeto
        x.a = entrada.nextDouble();// acessando o atributo
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();

        System.out.println("=================================");
        System.out.println("Entre com as medidas do triangulo  Y : ");

        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();

        double areaX = x.area(); // chamando o metodo

        double areaY = y.area();// chamando o metodo

        System.out.printf("Triangulo X area : %.4f%n ", areaX);
        System.out.printf("Triangulo Y area : %.4f%n ", areaY);

        if (areaX > areaY){
            System.out.println("Area X é maior");
        }else {
            System.out.println("Area Y é maior");
        }



    }
}
