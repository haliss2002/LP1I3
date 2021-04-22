/*
    Calcular e exibir a tensão de um determinado
    circuito eletrônico a partir dos
    valores da resistência e corrente elétrica
    que serão digitados. Utilize a lei de Ohm.

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP01EX09 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double R, i;

    System.out.println("Digite o valor da resistencia");
    R = read.nextDouble();
    System.out.println("Digite o valor da corrente eletrica");
    i = read.nextDouble();
    System.out.println("Tensao do circuito: "+ (R*i));
    read.close();
  }
}
