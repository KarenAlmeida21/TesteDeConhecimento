package sextoExercicio;

public abstract class FiguraGeometrica {
    private double area;
    public TipoDeFigura tipoDeFigura;


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public TipoDeFigura getTipoDeFigura() {
        return tipoDeFigura;
    }

    public void setTipoDeFigura(TipoDeFigura tipoDeFigura) {
        this.tipoDeFigura = tipoDeFigura;
    }
    public double multiplicar(double n1, double n2){
        Double resultado = n1 * n2;
        return resultado;
    }

    public  double calcularArea(double comprimento, double largura){
        setArea(multiplicar(comprimento,largura));
        return getArea();
    }


    public void alterarFigura(TipoDeFigura tipoDeFigura) {

        setTipoDeFigura(tipoDeFigura);
    }
}
