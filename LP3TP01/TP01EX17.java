/*
    Entrar via teclado com o valor da cotação do dólar
    e uma certa quantidade de dólares. Calcular e exibir o valor
    correspondente em Reais (R$).

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP01EX17 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double x, y;

    System.out.println("Digite o valor X");
    x = read.nextDouble();

    System.out.println("Digite o valor Y");
    y = read.nextDouble();

    double xy = Math.pow(x, y);
    System.out.println("Resultado: "+xy);
    read.close();
  }
}
