import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        int op;

        Scanner lerTeclado = new Scanner(System.in);

        ContaCorrente cc1 = new ContaCorrente(12311, "Danilo", 10000, 20000);
        ContaCorrente cc2 = new ContaCorrente(14241, "Talita", 2000, 3000);
        ContaCorrente cc3 = new ContaCorrente(14242, "João", 2000);
        ContaCorrente cc4 = new ContaCorrente(14243, "Joana");

        cc1.exibeDados();
        cc2.exibeDados();
        cc3.exibeDados();
        cc4.exibeDados();


        do {
            System.out.println("===========================");
            System.out.println("EXEMPLO DE OPERAÇÃO ENTRE CONTA CC1 E CC2");
            System.out.println("Escolha a conta: 1 - cc1  || 2 - cc2 || 0 - Sair");
            System.out.print("Digite: ");
            op = lerTeclado.nextInt();
            switch (op) {
                case 0:
                    break;
                case 1:
                    System.out.println("Escolha a operação: 1 - Saque || 2 - Deposito || 3 - Transferir || 4 - Saldo || 0 - Sair");
                    System.out.print("Digite: ");
                    int op2 = lerTeclado.nextInt();
                    switch (op2) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("Escolha o valor para sacar de cc1:");
                            System.out.printf("Saldo disponível: %.2f\n", cc1.getSaldo());
                            System.out.printf("Limite Cheque Especial: %.2f\n", cc1.getLimite());
                            System.out.printf("Digite o valor (R$): ");
                            cc1.saque(lerTeclado.nextDouble());
                            break;
                        case 2:
                            System.out.println("Escolha o valor para depositar em cc1:");
                            cc1.deposito(lerTeclado.nextDouble());
                            break;
                        case 3:
                            System.out.println("Escolha o valor para transferir (cc1 p/ cc2):");
                            cc2.deposito(cc1.transferencia(lerTeclado.nextDouble()));
                            break;

                        case 4:
                            cc1.exibeDados();
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Escolha a operação: 1 - Saque || 2 - Deposito || 3 - Transferir || 4 - Saldo || 0 - Sair");
                    System.out.print("Digite: ");
                    int op3 = lerTeclado.nextInt();
                    switch (op3) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("Escolha o valor para sacar de cc2:");
                            System.out.printf("Saldo disponível: %.2f\n", cc2.getSaldo());
                            System.out.printf("Limite Cheque Especial: %.2f\n", cc2.getLimite());
                            System.out.printf("Digite o valor (R$): ");
                            cc2.saque(lerTeclado.nextDouble());
                            break;
                        case 2:
                            System.out.println("Escolha o valor para depositar em cc2:");
                            cc2.deposito(lerTeclado.nextDouble());
                            break;
                        case 3:
                            System.out.println("Escolha o valor para transferir (cc2 p/ cc1):");
                            cc1.deposito(cc2.transferencia(lerTeclado.nextDouble()));
                            break;
                        case 4:
                            cc2.exibeDados();
                            break;
                    }
                    break;
            }
        } while (op != 0);
        System.out.println("====Fim da Operação=======");

    }
}

