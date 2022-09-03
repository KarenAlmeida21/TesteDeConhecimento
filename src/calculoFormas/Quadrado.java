package calculoFormas;

public class Quadrado extends FiguraGeometrica{
    private double lado;

    public Quadrado(TipoDeFigura tipoDeFigura) {
        super(tipoDeFigura);
    }

    @Override
    public double calcularArea(double lado) {
        setArea(lado * lado);
        return getArea();
    }
    @Override
    public void alterarFigura(calculoFormas.TipoDeFigura tipoDeFigura) {
        super.alterarFigura(TipoDeFigura.QUADRADO);
    }
}
