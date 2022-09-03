package calculoFormas;

public class Executor {


    public static void main(String[] args) {
        Quadrado x = new Quadrado();

        x.alterarFigura(TipoDeFigura.QUADRADO);
        x.calcularArea(2,2);
        System.out.println(x);

        Retangulo retangulo1 = new Retangulo();
        retangulo1.alterarFigura(TipoDeFigura.RETANGULO);
        retangulo1.calcularArea(12,9);
        System.out.println(retangulo1);
    }
}
