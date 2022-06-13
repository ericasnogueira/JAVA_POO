package exercicio.exercicio02;

public class Retangulo {
    // atributos
    double largura;
    double altura;

    //metodos

    public double area(){
           return  largura * altura;
    }
    public double perimetro(){
        return 2 * (largura + altura);
    }
    public  double diagonal (){
        return Math.sqrt(largura * largura + altura * altura);
    }
}
