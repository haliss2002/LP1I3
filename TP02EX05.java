/*
    Vinicius Ribeiro Menezes
    Halisson Oliveira

    Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
*/
import java.util.Scanner;

public class TP02EX05 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int [][] matriz = new int[3][2];

    System.out.println("Digite um valor");
    matriz [0][0] = read.nextInt();
    System.out.println("Digite um valor");
    matriz [0][1] = read.nextInt();

    System.out.println("Digite um valor");
    matriz [1][0] = read.nextInt();
    System.out.println("Digite um valor");
    matriz [1][1] = read.nextInt();

    System.out.println("Digite um valor");
    matriz [2][0] = read.nextInt();
    System.out.println("Digite um valor");
    matriz [2][1] = read.nextInt();
    System.out.println(" ");

    for (int l = 0; l < matriz.length; l++)  {  
      for (int c = 0; c < matriz[0].length; c++)     { 
          System.out.print(matriz[l][c] + " ");
      }  
      System.out.println(" ");
    }
    read.close();
  }
}
