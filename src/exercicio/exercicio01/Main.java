package exercicio.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        // classe produto recebe novo produto
        Produto produto = new Produto();

        System.out.println("Entre com o Produto : ");
        System.out.println("Nome : ");
        produto.nome = entrada.nextLine();
        System.out.println("Preço : ");
        produto.preco = entrada.nextDouble();
        System.out.println("Quantidade no estoque  : ");
        produto.quantidade = entrada.nextInt();

        System.out.println("Produto data : " + produto.toString());

        System.out.println();

        // adicionando no estoque
        System.out.println("Entre com o numero de produto para adicionar no estoque :");
        int quanti = entrada.nextInt();
        produto.addProdutos(quanti); // atualização da quantidade no objeto addproduts

        System.out.println();
        System.out.println("Produto data : " + produto.toString());

        // removendo produtos no estoque

        System.out.println("Entre com o numero de produto para remover no estoque :");
        int remove = entrada.nextInt();
        produto.removeProduto(remove);
        System.out.println();
        System.out.println("Produto data : " + produto.toString());


        entrada.close();
    }
}
