/*
    Calcular e exibir a média geométrica de dois
    valores quaisquer que serão digitados.

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP01EX07 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double one, two;

    System.out.println("Digite o valor do primeiro numero");
    one = read.nextDouble();
    System.out.println("Digite o valor do segundo numero");
    two = read.nextDouble();
    System.out.println("Média geométrica: " + Math.sqrt(one*two));
    read.close();
  }
}
