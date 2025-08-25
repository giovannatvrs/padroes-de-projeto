package strategy;

public class MultaVisitante implements EstrategiaMulta{
    @Override
    public double calcularMulta(int diasDeAtraso){
        return diasDeAtraso*2.0;
    }
}
