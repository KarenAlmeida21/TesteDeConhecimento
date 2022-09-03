package calculoFormas;

public class Executor {


    public static void main(String[] args) {

        Quadrado x = new Quadrado();
        x.alterarFigura(TipoDeFigura.QUADRADO);
        x.calcularArea(2, 2);
        System.out.println(x);

        Retangulo retangulo1 = new Retangulo();
        retangulo1.alterarFigura(TipoDeFigura.RETANGULO);
        retangulo1.calcularArea(12, 9);
        System.out.println(retangulo1);

        Triangulo o = new Triangulo();
        o.alterarFigura(TipoDeFigura.TRIANGULO);
        o.calcularArea(5, 4);
        System.out.println(o);

        Circulo circulo1 = new Circulo();
        circulo1.alterarFigura(TipoDeFigura.CIRCULO);
        circulo1.calcularArea(5, circulo1.PI);
        System.out.println(circulo1);
    }
}
