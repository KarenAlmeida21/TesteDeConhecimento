package quartoExercicio;

public class numerosImpares {
    public static void main(String[] args) {
        int soma = 0;
        int limite=200;
        //A variavel limite está definida como 200, pois no exercicio foi pedido os 100 primeiros numeros
        // impares e eles estão dentro dos primeiros 200 numeros naturais
        int i = 0;

        while (i < limite) {
            i++;
            if (i % 2 == 1) {
                soma += i;

            }
        }

        System.out.println(soma);
    }
}
