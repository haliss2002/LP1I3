/*
    Calcular e exibir o volume de uma esfera a partir do valor
    de seu diâmetro que será digitado.

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP01EX05 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double d;
    double pi = 3.14;

    System.out.println("Digite o valor do diametro da esfera em metros");
    d = read.nextDouble();
    double r = d/2;
    System.out.println("Volume: " + (4*pi*Math.pow(r, 3))/3 + " m³");
    read.close();
  }
}
