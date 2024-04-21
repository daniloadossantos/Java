import java.util.Scanner;
public class Caixa {

    public static double calcDesconto (double x){
        if (x < 50)
            x *= 0.95;

        else if (x >= 50 && x <= 100)
            x *= 0.9;

        else if (x > 100 && x <= 200)
            x *= 0.85;

        else
            x *= 0.8;

        return x;
    }

    public static void main(String[] args) {

        Scanner lerBotao = new Scanner (System.in);
        double preco;
        double desconto;
        double subtotal = 0;

        System.out.println("Bem-vindo. \nDigite o preco do produto ou 0 (zero) para sair.");

        do {
            System.out.print("Preco do produto: ");
            preco = lerBotao.nextDouble();
            subtotal += preco;

        }while (preco != 0);

        System.out.printf("Valor total original: R$ %.2f", subtotal);
        System.out.printf("\nValor total c/ desc.: R$ %.2f", calcDesconto(subtotal));


        System.out.println("\n---Obrigado---");
        System.out.println("---Fim do programa---");
    }
}