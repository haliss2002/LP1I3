/*
Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP02EX03 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int [][] matriz = new int[2][3];

    System.out.println("Digite um valor");
    matriz [0][0] = read.nextInt();
    System.out.println("Digite um valor");
    matriz [0][1] = read.nextInt();
    System.out.println("Digite um valor");
    matriz [0][2] = read.nextInt();
    System.out.println("Digite um valor");
    matriz [1][0] = read.nextInt();
    System.out.println("Digite um valor");
    matriz [1][1] = read.nextInt();
    System.out.println("Digite um valor");
    matriz [1][2] = read.nextInt();
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
