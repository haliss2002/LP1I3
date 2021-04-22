/*
    A partir do diâmetro de um círculo que será digitado,
    calcular e exibir sua área.

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP01EX11 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double d;
    double pi = 3.14;

    System.out.println("Digite o valor do diametro em cm");
    d = read.nextDouble();
    double r = d/2;
    System.out.println("Area do circulo: "+ (pi*Math.pow(r, 2)));
    read.close();
  }
}
