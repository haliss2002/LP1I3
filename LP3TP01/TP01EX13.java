/*
    Calcular e exibir a velocidade final (em km/h) de um automóvel,
    a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s2)
    e do tempo de percurso (em s) que serão digitados.

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/
import java.util.Scanner;

public class TP01EX13 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double v, a, t;

    System.out.println("Digite a velocidade inicial em m/s");
    v = read.nextDouble();

    System.out.println("Digite a aceleração em m/s");
    a = read.nextDouble();

    System.out.println("Digite o tempo de percurso em segundos");
    t = read.nextDouble();

    double vf = (v+(a*t))*3.6;
    System.out.println("Velocidade final: "+ vf +" km/h");
    read.close();
  }
}
