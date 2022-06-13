package sobrecarga;

public class produto {
    // atributos
    public String nome;
    public double preco;
    public int quantidade;

    // adicionando o construtor
    // não precisa usar o mesmo que no atributo , mas é sempre bom usar
    public produto(String nome, double preco, int quantidade) {
        // executando no  momento da instacia do objeto
        // obrigando a usar o nome,preço e quantidade

        // atribuindo com o atributo
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;


    }

    public produto(String nome, double preco) {

        // atribuindo com o atributo
        this.nome = nome;
        this.preco = preco;
        //this.quantidade = 0; //opcional
        // pode ser assim tambem
        //quantidade = 0;


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
