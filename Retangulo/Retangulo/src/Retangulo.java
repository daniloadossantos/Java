public class Retangulo {
    private double base;
    private double altura;

    public Retangulo (double b, double h) {
        if (b > 0 && h > 0){
            setBase(b);
            setAltura(h);
        }
        else{
            System.out.println("[Números inválidos] As dimensões devem ser maiores que zero.");
            if (b <= 0) setBase(2);
            if (h <= 0) setAltura(1);
        }
    }

    public void setBase (double base){
        if (base > 0)
            this.base = base;
        else
            System.out.println("[Número inválido] A base deve ser maior que zero.");
    }

    public void setAltura (double altura){
        if (altura > 0)
            this.altura = altura;
        else
            System.out.println("[Número inválido] A altura deve ser maior que zero.");
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double calcArea(){
        return base * altura;
    }

    public double calcPerimetro(){
        return 2 * (base + altura);
    }

    public boolean testeQuadrado(){
        if (base == altura) return true;
        else return false;
    }

    public void exibeDados(){
        System.out.printf("Base: %.2f cm\n", getBase());
        System.out.printf("Altura: %.2f cm\n", getAltura());
        System.out.printf("Área: %.2f cm²\n", calcArea());
        System.out.printf("Perímetro: %.2f cm\n", calcPerimetro());
        if (testeQuadrado())
            System.out.printf("Objeto é um quadrado? R: Sim.");
        else
            System.out.printf("Objeto é um quadrado? R: Não.");
    }

}