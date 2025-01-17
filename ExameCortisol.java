import java.util.Scanner;


public class ExameCortisol {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Cortisol: ");
    double cortisol = entrada.nextDouble();
    
    // Cortisol ideal é 6 e 18.4
    boolean resultadoNormal = cortisol >= 6 && cortisol <= 18.4;

    System.out.printf("Cortisol normal: %b%n", resultadoNormal);

    boolean resultadoAnormal = cortisol < 6 || cortisol > 18.4;
    System.out.printf("Cortisol anormal: %b%n", resultadoAnormal);

  }

}