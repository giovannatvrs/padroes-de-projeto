package strategy;

public class MultaAluno implements EstrategiaMulta{
    @Override
    public double calcularMulta(int diasDeAtraso){
        return diasDeAtraso*0.5;
    }
}
