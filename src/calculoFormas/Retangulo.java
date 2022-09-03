package calculoFormas;

public class Retangulo extends FiguraGeometrica{

    @Override
    public double calcularArea(double comprimento, double largura) {
        setArea(comprimento * largura);
        return getArea();
    }

    @Override
    public String toString() {
        return "A área do " + getTipoDeFigura()+
                " é " + getArea();
    }





}
