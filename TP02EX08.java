/*
    Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP02EX08 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int [][] matriz = new int[3][4];
    int [][] matrix = new int[3][4];
    int constant;

    System.out.println("Digite um numero");
    matriz [0][0] = read.nextInt();
    System.out.println("Digite um numero");
    matriz [0][1] = read.nextInt();
    System.out.println("Digite um numero");
    matriz [0][2] = read.nextInt();
    System.out.println("Digite um numero");
    matriz [0][3] = read.nextInt();

    System.out.println("Digite um numero");
    matriz [1][0] = read.nextInt();
    System.out.println("Digite um numero");
    matriz [1][1] = read.nextInt();
    System.out.println("Digite um numero");
    matriz [1][2] = read.nextInt();
    System.out.println("Digite um numero");
    matriz [1][3] = read.nextInt();


    System.out.println("Digite um numero");
    matriz [2][0] = read.nextInt();
    System.out.println("Digite um numero");
    matriz [2][1] = read.nextInt();
    System.out.println("Digite um numero");
    matriz [2][2] = read.nextInt();
    System.out.println("Digite um numero");
    matriz [2][3] = read.nextInt();

    System.out.println("Digite uma constante");
    constant = read.nextInt();
    System.out.println(" ");

    for (int l = 0; l < matriz.length; l++)  {  
      for (int c = 0; c < matriz[0].length; c++)     { 
        matrix[l][c] = (matriz[l][c])*constant;
      }  
    }

    for (int l = 0; l < matriz.length; l++)  {  
      for (int c = 0; c < matriz[0].length; c++)     { 
          System.out.print((matrix[l][c]) + " ");
      }  
      System.out.println(" ");
    }
    read.close();
  }
}
