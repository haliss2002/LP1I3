
import java.util.Scanner;
/*
    Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,calcular e exibir a matriz inversa.
Exibir as matrizes na tela, sob a forma matricial (linhas x colunas).

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import Jama.Matrix;

public class TP02EX10 {

        public static void main(String[] args) {
          Scanner read = new Scanner(System.in);
          int [][] matrix = new int[11][11];
          int m,n;
      
          System.out.println("Digite a ondem de m");
          m = read.nextInt();
          System.out.println("Digite a ondem de n");
          n = read.nextInt();
          System.out.println(" ");
        
            if(m>10||n>10)
             {
              System.out.println("Execedu o limite");
             }
            else
             {
              for (int l = 0; l < m; l++)  
                { 
                  for (int c = 0; c < n; c++)    
                   {               
                     matrix[l][c] = read.nextInt();
                   }  
                }
             System.out.println(" ");
             for (int c = 0; c <n; c++)     
               { 
                 for (int l = 0; l < m; l++)  
                   {       
                     System.out.print((matrix[l][c]) + " ");
                   }  
                 System.out.println(" ");
               }
               matrix = matriz.transpose();
System.out.println("Matriz Transposta");

//imprime matriz transposta

matriz.print(matrix);
          read.close();
        }
      }
      }
