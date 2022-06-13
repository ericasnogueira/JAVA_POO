package exercicio.exercicio03;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Empregado empregado = new Empregado();

        System.out.println("NOME DO FUNCIONARIO : ");
        empregado.nome = entrada.nextLine();
        System.out.println("SALARIO BRUTO : ");
        empregado.salarioBruto = entrada.nextDouble();
        System.out.println("TAXA :");
        empregado.taxa = entrada.nextDouble();

        System.out.println();
        System.out.println("EMPREGADO : " + empregado);
        System.out.println();
        System.out.println("QUAL PORCENTAGEM DO AUMENTAR DO SALÁRIO : ");
        double por = entrada.nextDouble();
        empregado.totalSalario(por);

        System.out.println();
        System.out.println("UPDATED DATA : " + empregado );
        entrada.close();
    }
}
