package classe;

public class Triangulo {

    //atributos
    public double a;
    public double b;
    public double c;

    //       tipo de retorno , nome do metodo e dentro (Lista de parametros do metodo)
    // metodo
    public  double area () {
        // variavel local
        double p = (a + b + c) / 2.0;
         return   Math.sqrt(p * (p - a )* (p - b )* (p - c));

    }
}
