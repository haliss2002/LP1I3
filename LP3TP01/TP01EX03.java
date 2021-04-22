/*
    Calcular e exibir a área de um quadrado a partir do valor
    de sua diagonal que será digitado.

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP01EX03 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double d;
    System.out.println("Digite o valor da diagonal em cm");
    d = read.nextDouble();
    double a = Math.sqrt(d/2)*2;
    System.out.println("Area do quadrado: " +a);
    read.close();
  }
}
