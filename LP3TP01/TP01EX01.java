/*
    Entrar via teclado com a base e a altura de um retângulo,
    calcular e exibir sua área.

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP01EX01 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double b, h;
    System.out.println("Digite o valor da base em cm");
    b = read.nextDouble();
    System.out.println("Digite o valor da altura em cm");
    h = read.nextDouble();
    System.out.println("Resultado: " + (b * h));
    read.close();
  }
}