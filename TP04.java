// Vinicius RIbeiro CB3010643
// Halisson Oliveira CB3012051
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

class Data{
  Scanner read = new Scanner(System.in);
  private int d;
  private int m;
  private int a;

  public Data(){
    do {
      System.out.println("Digite o dia : ");
      d = read.nextInt(); 
      } while (d > 31 || d < 1);
      do {	
      System.out.println("Digite o mes : ");
      m = read.nextInt();
      } while (m > 12 || m < 1);
      do {
      System.out.println("Digite o ano : ");
      a = read.nextInt();
      } while (a < 0);
  }
  
  public Hora(int dia, int mes, int ano){
    this.d = dia;
    this.m = mes;
    this.a = ano;
  }

  public void entraDia(int dia) { this.d = dia; }
  public void entraMes(int mes) { this.m = mes; }
  public void entraAno(int ano) { this.a = ano; }

  public void entraDia()
  {	
    do {
    System.out.println("Digite o dia: ");
      this.d = read.nextInt(); 
      } while (d > 31 || d < 1);
  }

  public void entraMes()
  {
    do {	
    System.out.println("Digite o mes: ");
      this.m = read.nextInt();
    } while (m > 12 || m < 1);

  }

  public void entraAno()
  {
    do {
    System.out.println("Digite o ano: ");
      this.a = read.nextInt();
    } while ( a < 0);

  }

  public int retDia() { return d; }
  public int retMes() { return m; }
  public int retAno() { return a; }

  public String mostra1() { 
    String time;
    time = (this.d+"/"+this.m+"/"+this.a);
    return time;
  }

  public String mostra2() {
    String time1;
    String mesinho="";
    switch (m) {
      case 1:
          mesinho = "Janeiro";
          break;
      case 2:
          mesinho = "Fevereiro";
          break;
      case 3:
          mesinho = "Marco";
          break;
      case 4:
          mesinho = "Abril";
          break;
      case 5:
          mesinho = "Maio";
          break;
      case 6:
          mesinho ="Junho";
          break;
      case 7:
          mesinho = "Julho";
          break;
      case 8:
          mesinho = "Agosto";
          break;
      case 9:
          mesinho = "Setembro";
          break;
     case 10:
          mesinho = "Outubro";
          break;
     case 11:
          mesinho = "Novembro";
          break;
     case 12:
          mesinho = "Dezembro";
          break;      
    }
    time1 = (this.d+"/"+mesinho+"/"+this.a);
    return time1; }

  public boolean bissexto() {
    int ano1 = a % 4;
    if (ano1==0){
      return true;
    }
    else{
      return false;
    }
  }
  public int diasTranscorridos(){
    int data1 = ((m*31)+d);
    return data1;
  }

  public String apresentaDataAtual(){
    DateFormat DFormat
    = DateFormat.getDateInstance(DateFormat.FULL);
    Date pega =new Date();
      return "Data Atual é "+pega+" formato é  "+DFormat;
  }
  } 
public class TP04 {
  public static void main(String[] args){
    System.out.println("-------testa construtor data-------");
    Data Exibir = new Data();
    System.out.println("-----------------------------------");
    System.out.println("-------testa entras-------");
    Exibir.entraAno();
    Exibir.entraMes();
    Exibir.entraDia();
    System.out.println("-----------------------------------");
    System.out.println("-------testa Rets-------");
    System.out.println(Exibir.retAno());
    System.out.println(Exibir.retMes());
    System.out.println(Exibir.retDia());
    System.out.println("-----------------------------------");
    System.out.println("-------testa Mostra1-------");
    System.out.println( Exibir.mostra1());
    System.out.println("-----------------------------------");
    System.out.println("-------testa Mostra2-------");
    System.out.println( Exibir.mostra2());
    System.out.println("-----------------------------------");
    System.out.println("-------testa Bissexto-------");
    System.out.println( Exibir.bissexto());
    System.out.println("-----------------------------------");
    System.out.println("-------testa diasTranscorridos-------");
    System.out.println( Exibir.diasTranscorridos());
    System.out.println("-----------------------------------");
    System.out.println("-------testa apresentaDataAtual-------");
    System.out.println( Exibir.apresentaDataAtual());
    System.out.println("-----------------------------------");
    
  }
}