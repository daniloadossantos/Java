import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        final int alunos = 5;
        final int provas = 2;

        int lin;
        int col;
        double mediaTurma = 0;
        double media = 0;

        double notas[][] = new double[alunos][provas];
        Scanner lerTeclado = new Scanner(System.in);

        for (lin = 0; lin < alunos; lin++) {
            System.out.printf("Digite as notas do %do aluno: ", lin + 1);
            for (col = 0; col < provas; col++)
                notas[lin][col] = lerTeclado.nextDouble();
        }

        for (lin = 0; lin < alunos; lin++) {
            for (col = 0; col < provas; col++)
                media += notas[lin][col];
        }
        mediaTurma = media / (alunos * provas);

        System.out.println();
        System.out.println("Notas e Média");
        System.out.printf( "Média Turma: %2.1f \n", mediaTurma);


        for (lin = 0; lin < alunos; lin++) {
            System.out.printf("\nAluno %d: ", lin + 1);
            media = 0;
            for (col = 0; col < provas; col++) {
                System.out.printf("%2.1f ", notas[lin][col]);
                media += notas[lin][col];
            }
            double mediaAluno = media/provas;
            System.out.printf(" - Média Aluno: %2.1f ", mediaAluno);

            if (mediaAluno == mediaTurma)
                System.out.print(" - Média igual da turma");

            else if (mediaAluno > mediaTurma)
                System.out.print(" - Acima da média");
            else
                System.out.print(" - Abaixo da média");
        }
    }
}
