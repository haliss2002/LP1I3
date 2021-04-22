import java.util.Scanner;
import java.lang.Math;
public class EsferaCubo{

  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in); 
  double a,b,c;
  c=Math.PI;

  System.out.printf("Informe o raio da esfera ");
  a = ler.nextDouble(); 
  System.out.printf("Informe a aresta do cubo ");
  b = ler.nextDouble(); 

  System.out.printf("Seu Volume livre e "+((Math.pow (b, 3))-(4*c*(Math.pow (a, 3))/3)));
  //elaborado por halisson de oliveira sousa e vinicius ribeiro menezes
  //14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados.

  }

}