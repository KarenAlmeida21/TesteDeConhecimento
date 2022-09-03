package calculoFormas;

public class Circulo extends FiguraGeometrica {
    double PI = Math.PI;

    @Override
    public double calcularArea(double raio, double PI) {
        double raioDuplo = multiplicar(raio, raio);
        setArea(raioDuplo * PI);
        return getArea();
    }

    @Override
    public String toString() {
        return "A área do " + getTipoDeFigura() +
                " é " + getArea();
    }
}
