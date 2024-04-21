import java.util.Scanner;

public class TesteRetangulo {
    public static void main (String [] args){

        double lado1;
        double lado2;
        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Digite a base: ");
        lado1 = lerTeclado.nextDouble();

        System.out.print("Digite a altura: ");
        lado2 = lerTeclado.nextDouble();

        Retangulo retangulo = new Retangulo (lado1,lado2);

        retangulo.exibeDados();


    }
}
