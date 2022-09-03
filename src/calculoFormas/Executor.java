package calculoFormas;

public class Executor {


    public static void main(String[] args) {
        Quadrado x = new Quadrado();

        x.alterarFigura(TipoDeFigura.QUADRADO);
        x.calcularArea(2);

        System.out.println(x);
    }
}
