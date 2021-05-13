/*
    Vinicius Ribeiro Menezes
    Halisson Oliveira
    
    Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
    erro, se necessário. Após a digitação, exibir:
     a. O maior valor;
    b. A soma dos valores;
c. A média aritmética dos valores.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class TP02EX02 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int a, b, c, d, e, f, g, h, i, j;
    int x = 0;
    int y = 0;

    List<Integer> Arr = new ArrayList<Integer>();

    System.out.println("Digite o valor 1: ");
    a = read.nextInt();
    Arr.add(a);
    System.out.println("Digite o valor 2: ");
    b = read.nextInt();
    Arr.add(b);
    System.out.println("Digite o valor 3: ");
    c = read.nextInt();
    Arr.add(c);
    System.out.println("Digite o valor 4: ");
    d = read.nextInt();
    Arr.add(d);
    System.out.println("Digite o valor 5: ");
    e = read.nextInt();
    Arr.add(e);
    System.out.println("Digite o valor 6: ");
    f = read.nextInt();
    Arr.add(f);
    System.out.println("Digite o valor 7: ");
    g = read.nextInt();
    Arr.add(g);
    System.out.println("Digite o valor 8: ");
    h = read.nextInt();
    Arr.add(h);
    System.out.println("Digite o valor 9: ");
    i = read.nextInt();
    Arr.add(i);
    System.out.println("Digite o valor 10: ");
    j = read.nextInt();
    Arr.add(j);

    if(Arr.size() > 0) {
      for (int index = 0; index < Arr.size()  ; index++) {
        if (Arr.get(index) >= x) {
            x = Arr.get(index);
        }
      }
    }

    for(int index = 0; index < Arr.size(); index++){
      y += Arr.get(index);
    }
    double md = y/Arr.size();

    System.out.printf("Maior número é :" + x);

    System.out.printf("A soma de todos os valores é:" + y);

    System.out.printf("A media de todos os valores é aproximadamente:" + md);
    read.close();
  }
}