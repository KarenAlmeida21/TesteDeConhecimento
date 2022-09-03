package calculoFormas;

public class Quadrado extends FiguraGeometrica{
    private double lado;

    public Quadrado() {
        super();
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

    @Override
    public String toString() {
        return "A área do " + tipoDeFigura +
                 "e " + getArea();
    }
}
