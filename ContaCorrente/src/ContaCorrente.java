import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class ContaCorrente {
    public int nrConta;
    public String titular;
    private double saldo = 0;

    private double limite = 0;

    public ContaCorrente(int nrC, String t, double s, double lim) {
        setnrConta(nrC);
        setTitular(t);
        setSaldo(s);
        setLimite(lim);
    }

    public ContaCorrente(int nrC, String t, double s) {
        setnrConta(nrC);
        setTitular(t);
        setSaldo(s);
        setLimite(1000);
    }

    public ContaCorrente(int nrC, String t) {
        setnrConta(nrC);
        setTitular(t);
        setSaldo(0);
        setLimite(0);
    }

    private double setSaldo(double s) {
        if (s < 0){
            System.out.print("Numero inválido.");
        }
        else
            saldo = s;
        return saldo;
    }

    private String setTitular(String t) {
        titular = t;
        return titular;
    }

    private int setnrConta(int nrC) {
        return nrConta = nrC;
    }

    private double setLimite(double lim){
        return limite = lim;
    }

     public int getConta(){
        return nrConta;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public void deposito(double d) {
        if (d < 0)
            System.out.printf("Quantidade inválida.\n");
        else {
            saldo += d;
            System.out.printf("Deposito/Transferencia de R$ %.2f realizado com sucesso.\n", d);
        }
        System.out.println("===========================");
    }

    public void saque(double w) {
        if (w < 0 ) {
            System.out.printf("Quantidade invalida!\n");
        }

        if (getSaldo() < w && ((getSaldo() + getLimite()) < w)) {
            System.out.printf("Saldo insuficiente!\n");
        }

        else if (((getSaldo() + getLimite()) >= w)) {
            if (getSaldo() >= w) {
                setSaldo(getSaldo() - w);
                System.out.printf("Retirada de R$ %.2f realizado com sucesso.\n", w);
                System.out.printf("Novo saldo: R$ %.2f\n", getSaldo());
                System.out.printf("Novo limite: R$ %.2f\n", getLimite());
                System.out.println("===========================");
            }

            else if (getSaldo() < w) {
                setLimite((getSaldo() + getLimite()) - w);
                setSaldo(0);
                System.out.printf("Retirada de R$ %.2f realizado com sucesso.\n", w);
                System.out.printf("Novo saldo: R$ %.2f\n", getSaldo());
                System.out.printf("Novo limite: R$ %.2f\n", getLimite());
                System.out.println("===========================");
            }
        }
    }

    public double transferencia (double transf) {
        if (getSaldo() < transf && ((getSaldo() + getLimite()) < transf)) {
            System.out.printf("Saldo insuficiente!\n");
            return 0;
        } else if (((getSaldo() + getLimite()) > transf)) {
            if (getSaldo() > transf) {
                setSaldo(getSaldo() - transf);
                return transf;
            } else if (getSaldo() < transf) {
                setLimite((getSaldo() + getLimite()) - transf);
                setSaldo(0);
                return transf;

            }
        } return 1;
    }



    public void exibeDados() {
        System.out.printf("Nr Conta: %d", getConta());
        System.out.printf("\nTitular: %s", getTitular());
        System.out.printf("\nSaldo: R$ %.2f", getSaldo());
        System.out.printf("\nCheque Especial: R$ %.2f", getLimite());
        System.out.println("\n===========================");
    }





}