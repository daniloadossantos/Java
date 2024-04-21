import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {

        int n = 0;
        int conta;
        int digito;
        int soma = 0;
        Scanner lerTeclado = new Scanner (System.in);
        System.out.print("Informe o nr conta: ");
        n = lerTeclado.nextInt();
        conta = n;

        for (int i = 0; i <= 5; i++){
            soma += n % 10;
            n/=10;
        }

        digito = soma % 10;
        System.out.printf("O numero da conta: %06d-%d", conta, digito);
    }
}