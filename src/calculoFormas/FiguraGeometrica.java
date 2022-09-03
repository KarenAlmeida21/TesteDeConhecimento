package calculoFormas;

public abstract class FiguraGeometrica {
    private double area;
    public TipoDeFigura tipoDeFigura;

    public FiguraGeometrica(calculoFormas.TipoDeFigura tipoDeFigura) {
        this.area = area;
        this.tipoDeFigura = tipoDeFigura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public TipoDeFigura getTipoDeFigura() {
        return tipoDeFigura;
    }
    public abstract double calcularArea(double medida);
}
