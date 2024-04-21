import java.util.Scanner;

public class TesteCirculo {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");

        double raio = lerTeclado.nextDouble();
        Circulo c = new Circulo(raio);
        c.exibeDados();
    }
}
