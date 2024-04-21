import java.util.Scanner;

public class Temperatura {
    public static void main(String args[]) {
        Scanner input = new Scanner ( System.in );
        double tempF;
        double tempC = 0.0d;
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        tempF = input.nextDouble();
        tempC = (tempF-32)*5/9;
                
        System.out.printf("A temperatura de %.1f °F equivale a %.1f °C", tempF, tempC );

    }
}
