package encapsulamento;



import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        System.out.println("Entre com o Produto : ");
        System.out.println("Nome : ");
        String nome = entrada.nextLine();
        System.out.println("Preço : ");
        double preco = entrada.nextDouble();

        Produto05 produto05 = new Produto05(nome, preco);

        produto05.setNome("COMPUTADOR");
        // mostrando só o nome do produto
        System.out.println("UPDATE NOME : " + produto05.getNome());
        produto05.setPreco(1200.00);
        System.out.println("UPADATE  PRECO : " + produto05.getPreco());

        System.out.println("Produto data : " + produto05.toString());

        System.out.println();

        // adicionando no estoque
        System.out.println("Entre com o numero de produto para adicionar no estoque :");
        int quantidade = entrada.nextInt();
        produto05.addProdutos(quantidade); // atualização da quantidade no objeto addproduts

        System.out.println();
        System.out.println("Produto data : " + produto05.toString());

        // removendo produtos no estoque

        System.out.println();
        System.out.println("Entre com o numero de produto para remover no estoque :");
        int remove = entrada.nextInt();
        produto05.removeProduto(remove);
        System.out.println();
        System.out.println("Produto data : " + produto05.toString());


        entrada.close();


    }
}
