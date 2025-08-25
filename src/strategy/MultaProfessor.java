package strategy;

public class MultaProfessor implements EstrategiaMulta{

    @Override
    public double calcularMulta(int diasDeAtrasos){
        return diasDeAtrasos * 1.5;
    }
}
