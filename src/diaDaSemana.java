import java.util.Scanner;

public class diaDaSemana {
    public static void main(String[] args) {
        Scanner obterInformacoes = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 1 à 7 e eu falarei qual dia da semana ele representa!");
        int numeroEscolhido = obterInformacoes.nextInt();

        switch (numeroEscolhido){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("valor inválido");
                break;
        }
    }
}
