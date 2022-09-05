package sextoExercicio;

public class Executor {


    public static void main(String[] args) {

        Quadrado quadrado1 = new Quadrado();
        quadrado1.alterarFigura(TipoDeFigura.QUADRADO);
        quadrado1.calcularArea(2, 2);
        System.out.println(quadrado1);

        Retangulo retangulo1 = new Retangulo();
        retangulo1.alterarFigura(TipoDeFigura.RETANGULO);
        retangulo1.calcularArea(12, 9);
        System.out.println(retangulo1);

        Triangulo triangulo1 = new Triangulo();
        triangulo1.alterarFigura(TipoDeFigura.TRIANGULO);
        triangulo1.calcularArea(5, 4);
        System.out.println(triangulo1);

        Circulo circulo1 = new Circulo();
        circulo1.alterarFigura(TipoDeFigura.CIRCULO);
        circulo1.calcularArea(5, circulo1.PI);
        System.out.println(circulo1);
    }
}
