package calculoFormas;

public class Retangulo extends FiguraGeometrica{
    private double base;
    private  double altura;

    public Retangulo() {
    }

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
