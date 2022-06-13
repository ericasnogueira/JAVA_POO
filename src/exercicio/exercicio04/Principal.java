package exercicio.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("NOME DO ESTUDANTE : ");
        estudante.nome = entrada.nextLine();
        estudante.grade1 = entrada.nextDouble();
        estudante.grade2 = entrada.nextDouble();
        estudante.grade3 = entrada.nextDouble();

        System.out.printf("FINAL GRADE : %.2f%n", estudante.finalGrade());

        if (estudante.finalGrade() < 60.0){
            System.out.println("GAME OVER");
            System.out.printf("PONTOS : %.2f ", estudante.pontos());
        } else {
            System.out.println("PASSOU");
        }


    }
}
