package exercicio.exercicio04;

public class Estudante {

    public String nome;
    public double grade1;
    public double grade2;
    public double grade3;

    //metodo
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public double pontos(){
        if(finalGrade() < 60.0){
            return 60.0 - finalGrade();
        }else {
            return 0.0;
        }
    }
}
