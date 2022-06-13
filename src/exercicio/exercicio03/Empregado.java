package exercicio.exercicio03;

public class Empregado {
    String nome;
    double salarioBruto;
    double taxa;

    public double salario(){
        return salarioBruto - taxa;
    }
    // void =  metodo que não retorna
    public void  totalSalario(double percentage){
        salarioBruto += salarioBruto * percentage / 100.00;
    }

    public String toString(){

        return nome + ", $ " + String.format("%.2f", salario());

    }

}
