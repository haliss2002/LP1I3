import java.util.Scanner;
import java.lang.Math;
public class Troco{

  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in); 
  double a,b,c,d,e,f,g;
  String h;
  c=Math.PI;

  System.out.printf("Informe o valor do produto ");
  a = ler.nextDouble();
    System.out.printf("Informe o valor do produto ");
  b = ler.nextDouble(); 
    System.out.printf("Informe o valor do produto ");
  c = ler.nextDouble(); 
    System.out.printf("Informe o valor do produto ");
  d = ler.nextDouble(); 
    System.out.printf("Informe o valor do produto ");
  e = ler.nextDouble();  
      System.out.printf("Informe o valor a pagar ");
  f = ler.nextDouble();  
  g=a+b+c+d+e;
  h=(f<=g)?"Sem Troco":"Seu troco e "+(f-g);

  System.out.printf(h);
//elaborado por halisson de oliveira sousa e vinicius ribeiro menezes
//18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
  }

}