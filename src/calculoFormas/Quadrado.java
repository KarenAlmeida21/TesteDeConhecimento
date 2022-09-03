package calculoFormas;

public class Quadrado extends FiguraGeometrica{
    private double lado;

    @Override
    public double calcularArea(double lado) {
        setArea(lado * lado);
        return getArea();
    }
}
