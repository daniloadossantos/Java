/*POO - Manha - Danilo Alves dos Santos - RA 22210022*/

import java.util.Scanner;

public class ExercTriangulo {
   
   public static void main (String[] args) {
         double a;
         double b;
         double c;
         Scanner lerTeclado = new Scanner(System.in);
         
         System.out.print("Digite A: ");
         a = lerTeclado.nextDouble();
         if (a < 0){
             System.out.println("Numero invalido. Digite novamente.");
             System.out.print("Digite A: ");
             a = lerTeclado.nextDouble();
         }

         
         System.out.print("Digite B: ");
         b = lerTeclado.nextDouble();
         if (b < 0){
           System.out.println("Numero invalido. Digite novamente.");
           System.out.print("Digite B: ");
           b = lerTeclado.nextDouble();
       }
         
         System.out.print("Digite C: ");
         c = lerTeclado.nextDouble();
         if (c < 0){
           System.out.println("Numero invalido. Digite novamente.");
           System.out.print("Digite C: ");
           c = lerTeclado.nextDouble();
       }
         
         lerTeclado.close();
         
         if ((a + b > c) && (a + c > b) && (b + c > a)) { 
            System.out.print("(" + a + "," + b + "," + c + ") formam um triangulo");
            if (a == b && b == c)
               System.out.println(" do tipo Equilatero.");
            if ((a == b && a !=c) || (b == c && b != a) || (a == c && a != b))
               System.out.println(" do tipo Isosceles.");
            if (a != b && b != c && a != c)
               System.out.println(" do tipo Escaleno.");

         }

         else 
            System.out.println("(" + a + "," + b + "," + c + ") nao formam um triangulo.");
         
         
      System.out.println("Fim do programa");   
}
}