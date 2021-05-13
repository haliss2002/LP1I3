/*
    Vinicius Ribeiro Menezes
    Halisson Oliveira

    Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
*/
import java.util.Scanner;

public class TP02EX06 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    String [][] matriz = new String[2][3];

    System.out.println("Digite um nome");
    matriz [0][0] = read.next();
    System.out.println("Digite um nome");
    matriz [0][1] = read.next();
    System.out.println("Digite um nome");
    matriz [0][2] = read.next();
    System.out.println("Digite um nome");
    matriz [1][0] = read.next();
    System.out.println("Digite um nome");
    matriz [1][1] = read.next();
    System.out.println("Digite um nome");
    matriz [1][2] = read.next();
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
