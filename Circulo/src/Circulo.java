import java.util.Scanner;

public class Circulo {

    private double raio;

    public Circulo(double r) {

        setRaio(r);
    }

    public void setRaio(double r) {

        if (r < 0) {
            System.out.println("O raio nao pode ser negativo.");
        } else
            raio = r;
    }

    public double getRaio(){
        return raio;
    }

    public double calcDiam() {
        return raio * 2;
    }

    public double calcArea() {
        return Math.PI * (Math.pow(raio, 2));
    }

    public double calcCircunf() {
        double circunf = 2 * (Math.PI * raio);
        return circunf;
    }

    public void exibeDados() {
        System.out.printf("Raio informado: %.2f", getRaio());
        System.out.printf("\nDiâmetro: %.2f", calcDiam());
        System.out.printf("\nÁrea: %.2f", calcArea());
        System.out.printf("\nCircunferência: %.2f", calcCircunf());
    }
}
