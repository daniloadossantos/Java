public class Data {

    private int mes;
    private int dia;
    private int ano;

    public Data(int d, int m, int a) {
        setData(d, m, a);
    }

    public Data(int m, int a) {
        setData(1, m, a);
    }

    public Data(int a) {
        setData(1, 1, a);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setData(int d, int m, int a) {
        if (m > 0 && m <= 12)
            mes = m;
        else {
            mes = 1;
            System.out.println("Mês " + m + "inválido. Configurado mês = 1");
        }
        ano = a;
        dia = checkDia(d);
    }

    private int checkDia(int diaTeste) {
        int diaMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((bissexto(getAno())) && (diaTeste > 0 && diaTeste <= diaMes[mes])) {
            diaMes[2] = 29;
            return diaTeste;
        }

        else if (!bissexto(getAno()) && (getMes() == 2) && diaTeste == 29){
            System.out.println("Dia " + diaTeste + "/" + getMes() + "/" + getAno() + " inválido. Configurado dia = 1.");
            diaTeste = 1;
            mes = 3;
        }

        return diaTeste;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean bissexto(int anoTeste) {
        anoTeste = getAno() % 100;
        if (anoTeste % 4 == 0)
            return true;
        else
            return false;
    }

}
