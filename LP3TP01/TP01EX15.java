/*
    Entrar via teclado com o valor da cotação do dólar
    e uma certa quantidade de dólares. Calcular e exibir o valor
    correspondente em Reais (R$).

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP01EX15 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double v, d;

    System.out.println("Digite a cotação do dolar atual em R$");
    d = read.nextDouble();

    System.out.println("Digite a quantidade de dólares que você tem");
    v = read.nextDouble();

    double rs = v*d;
    System.out.println("Você possui R$ "+rs);
    read.close();
  }
}
