import java.util.Scanner;
public class VolumeCone{

  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in); 
  double a,b,c;
  c=Math.PI;

  System.out.printf("Informe a altura do cone ");
  a = ler.nextDouble(); 
  System.out.printf("Informe o raio da base do cone ");
  b = ler.nextDouble(); 

  System.out.printf("Seu Volume e "+((c*a*b)/3));
  //elaborado por halisson de oliveira sousa e vinicius ribeiro menezes
  //12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.

  }

}