import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Digite o dia da data1 (DD): ");
        int d = lerTeclado.nextInt();

        System.out.print("Digite o mês da data1 (MM): ");
        int m = lerTeclado.nextInt();

        System.out.print("Digite o ano da data1 (AAAA): ");
        int a = lerTeclado.nextInt();
        Data data1 = new Data(d, m, a);

        System.out.println("Data1: " + data1.toString());

    }
}