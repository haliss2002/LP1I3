import java.util.Scanner;
import java.lang.Math;
public class Trigonometria{

  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in); 
  double a,b,c;
  c=Math.PI;

  System.out.printf("Informe o angulo ");
  a = ler.nextDouble(); 

  System.out.printf("\nSeno de "+a+" graus e:"+(Math.sin(Math.toRadians(a))));
  System.out.printf("\nCoseno de "+a+" graus e:"+(Math.cos(Math.toRadians(a))));
  System.out.printf("\nTangente de "+a+" graus e:"+(Math.tan(Math.toRadians(a))));
  System.out.printf("\nSecante de "+a+" graus e:"+(1/(Math.cos(Math.toRadians(a)))));
  //elaborado por halisson de oliveira sousa e vinicius ribeiro menezes
  //16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.

  }

}