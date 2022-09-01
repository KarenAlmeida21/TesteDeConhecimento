public class numerosImpares {
    public static void main(String[] args) {
        int soma = 0;
        int i = 0;
        while (i < 200) {
            i++;
            if (i % 2 == 1) {
                soma += i;

            }
        }

        System.out.println(soma);
    }
}
