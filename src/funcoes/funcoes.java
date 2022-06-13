package funcoes;

import java.util.Scanner;

public class funcoes {

    // Função main(principal)d
    public static void main(String[] args) {
        // fazer um programa para ler três números inteiros e mostrar na tela o maior deles.

        Scanner entrada = new Scanner(System.in);

        System.out.println("ENTRE COM TRêS NÚMEROS  : ");

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        // chamando a função
        int maior = max(a, b, c);

        //função
        showResult(maior);
    }
    //                 tipo de dado que ela retorna
    //função max    |   nome da função
    public static  int max(int x , int  y, int z){ // (PARAMENTROS QUE ELA RECEBE)
        int aux; // variavel local , so vai ter na função

        if (x > y && x > z){
            aux = x;
        } else if(y > z) {
            aux= y ;
        } else {
            aux = z;
        }
        // indicando para a função retornar o valor
        return aux;
    }
    //              fazendo uma ação retornando uma mensagem
    //              |
    public static  void showResult(int value){
        System.out.println("maior : " + value);
    }
}
