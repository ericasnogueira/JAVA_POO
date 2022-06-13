package encapsulamento;

public class Produto05 {
    private  String nome;
    private  double preco;
    private int quantidade;


    public Produto05(String nome, double preco, int quantidade) {
        // executando no  momento da instacia do objeto
        // obrigando a usar o nome,preço e quantidade

        // atribuindo com o atributo
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;


    }

    public Produto05(String nome, double preco) {

        // atribuindo com o atributo
        this.nome = nome;
        this.preco = preco;
        //this.quantidade = 0; //opcional
        // pode ser assim tambem
        //quantidade = 0;


    }
    // são colocados depois dos construtores
    public String getNome() {
        return nome;
    }

    // são colocados depois dos construtores
    public  void setNome(String nome){
        this.nome = nome;
    }

    public  double getPreco(){
        return preco;
    }

    public void  setPreco(double preco){
        this.preco = preco;
    }
    // retornando somente a quantidade do produto
    public  int getQuantidade(){
        return quantidade;
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
