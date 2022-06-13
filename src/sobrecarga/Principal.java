package sobrecarga;

import construtores.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);



        System.out.println("Entre com o Produto : ");
        System.out.println("Nome : ");
        String nome = entrada.nextLine();
        System.out.println("Preço : ");
        double preco = entrada.nextDouble();


        produto produto = new produto(nome , preco);

        System.out.println("Produto data : " + produto.toString());

        System.out.println();

        // adicionando no estoque
        System.out.println("Entre com o numero de produto para adicionar no estoque :");
        int quantidade = entrada.nextInt();
        produto.addProdutos(quantidade); // atualização da quantidade no objeto addproduts

        System.out.println();
        System.out.println("Produto data : " + produto.toString());

        // removendo produtos no estoque

        System.out.println();
        System.out.println("Entre com o numero de produto para remover no estoque :");
        int remove = entrada.nextInt();
        produto.removeProduto(remove);
        System.out.println();
        System.out.println("Produto data : " + produto.toString());


        entrada.close();
    }
}
