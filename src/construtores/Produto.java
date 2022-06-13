package construtores;

public class Produto {

    // atributos
    public String nome;
    public double preco;
    public int quantidade;

    // adicionando o construtor
    // não precisa usar o mesmo que no atributo , mas é sempre bom usar
    public Produto(String nome, double preco, int quantidade){
        // executando no  momento da instacia do objeto
        // obrigando a usar o nome,preço e quantidade

        // atribuindo com o atributo
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;


    }

    //metodo
    public double totalValorEstoque() {
        // retorna o preço * quantidade
        return preco * quantidade;
    }

    public void addProdutos(int quantidade) {
        // diferenciando a  quantidade(medoto/atributo do paramentro int quantidade
        // this.quantidade é do atributo     depois do = a quantidade é do parametro
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco) // para a casas decimais
                + ", "
                + quantidade
                + " unidade , total : $"
                + String.format("%.2f", totalValorEstoque());


    }
}
