package exercicio.exercicio01;

public class Produto {

    // atributos
    public String nome;
    public double preco;
    public int quantidade;

    //metodo
    public double totalValorEstoque(){
        // retorna o preço * quantidade
        return  preco * quantidade;
    }
    public  void  addProdutos(int quantidade){
     // diferenciando a  quantidade(medoto/atributo do paramentro int quantidade
        // this.quantidade é do atributo     depois do = a quantidade é do parametro
        this.quantidade += quantidade;
    }
    public  void  removeProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return  nome
                + ", $ "
                + String.format("%.2f", preco) // para a casas decimais
                + ", "
                + quantidade
                + " unidade , total : $"
                + String.format("%.2f", totalValorEstoque());
    }
}
