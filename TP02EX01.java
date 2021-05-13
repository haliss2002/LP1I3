/*
    Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor..

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP02EX01 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int x;
    int y = 0;
    System.out.println("Digite o valor 1: ");
    x = read.nextInt();
    while(x >= y){
      System.out.println("Digite o valor 2: ");
      y = read.nextInt();
    }
    read.close();
  }
}