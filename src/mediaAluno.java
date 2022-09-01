import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner obterInformacao = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double  nota1 = obterInformacao.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double  nota2 = obterInformacao.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double  nota3 = obterInformacao.nextDouble();

        double media = (nota1 + nota2 + nota3 )/3;

        if(media < 6){
            System.out.println("A sua média é " + media + " e você está reprovado");
        }else if (media > 6 && media < 10 ){
            System.out.println("A sua média é " + media + " e você está aprovado");
        }else if(media == 10){
            System.out.println("A sua média é " + media + " e você está aprovado com êxito");
        }else{
            System.out.println("Verifique as notas informadas");
        }
    }
}
