package calculoFormas;

public class Triangulo extends FiguraGeometrica {

    @Override
    public double calcularArea(double base, double altura) {
        setArea(multiplicar(base,altura)/2);
        return getArea();

    }

    @Override
    public String toString() {
        return "A área do " + getTipoDeFigura()+
                " é " + getArea();
    }
}
