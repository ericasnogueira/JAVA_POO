import java.util.Locale;
import java.util.Scanner;

public class ExerciciosSemPoo {
    public static void main(String[] args) {
        /* ler as medidas dos dados de dois triangulos x e y. Em seguida, mostrar o valor das areas dos dois
        * triangulos e dizer qual dos dois possui a maior área.
        * */

        // exercicio usando o poo estara na class

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as medidas do triangulo X : ");
        
        xA = entrada.nextDouble();
        xB = entrada.nextDouble();
        xC = entrada.nextDouble();

        System.out.println("=================================");
        System.out.println("Entre com as medidas do triangulo  Y : ");

        yA = entrada.nextDouble();
        yB = entrada.nextDouble();
        yC = entrada.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangulo X area : %.4f%n ", areaX);
        System.out.printf("Triangulo Y area : %.4f%n ", areaY);

        if (areaX > areaY){
            System.out.println("Area X é maior");
        }else {
            System.out.println("Area Y é maior");
        }


    }
}
