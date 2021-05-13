
import java.util.Scanner;
/*
    Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,calcular e exibir a matriz inversa.
Exibir as matrizes na tela, sob a forma matricial (linhas x colunas).

    Vinicius Ribeiro Menezes
    Halisson Oliveira
*/

public class TP02EX11 {

        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            int [][] num = new int[11][11];
            int det,m,diagPrin1,diagPrin2,diagPrin3,diagPrin4,diagPrin5,diagPrin6,diagPrin7,diagPrin8,diagPrin9,diagPrin10,diagSec1,diagSec2,diagSec3,diagSec4,diagSec5,diagSec6,diagSec7,diagSec8,diagSec9,diagSec10;
            System.out.println("Digite a ordem");
            m= read.nextInt();
            switch (m) {
    case 1:
        det = num[0][0];
        System.out.println("O determinante da matriz eh : " + det);
        break;
    case 2:
        diagPrin1 = num[0][0] * num[1][1];
        diagPrin2 = num[0][1] * num[1][2];

        // Diagonais Secundárias
        diagSec1 = num[2][0] * num[1][1];
        diagSec2 = num[2][1] * num[1][2];

        // Determinante
        det = -(diagSec1 + diagSec2) + (diagPrin1 + diagPrin2);
        System.out.println("O determinante da matriz eh : " + det);
        break;
    case 3:
        // Diagonais principais
        diagPrin1 = num[0][0] * num[1][1] * num[2][2];
        diagPrin2 = num[0][1] * num[1][2] * num[2][0];
        diagPrin3 = num[0][2] * num[1][0] * num[2][1];
        // Diagonais Secundárias
        diagSec1 = num[2][0] * num[1][1] * num[0][2];
        diagSec2 = num[2][1] * num[1][2] * num[0][0];
        diagSec3 = num[2][2] * num[1][0] * num[0][1];
        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3) + (diagPrin1 + diagPrin2 + diagPrin3);
        System.out.println("O determinante da matriz eh : " + det);
        break;
    case 4:
        // Diagonais principais
        diagPrin1 = num[0][0] * (((num[1][1] * num[2][2] * num[3][3])+(num[1][2]*num[2][3]*num[3][1])+(num[1][3]*num[2][1]*num[3][2]))-((num[1][2]*num[2][1]*num[3][3])+(num[1][1]*num[2][3]*num[3][2])+(num[1][3]+num[2][2]+num[3][1])));
        diagPrin2 = num[0][1] * num[1][2] * num[2][0] ;
        diagPrin3 = num[0][2] * num[1][0] * num[2][1] ;
        diagPrin4 = num[0][2] * num[1][0] * num[2][1] ;
        // Diagonais Secundárias
        diagSec1 = num[2][0] * num[1][1] * num[0][2] * num[][];
        diagSec2 = num[2][1] * num[1][2] * num[0][0] * num[][];
        diagSec3 = num[2][2] * num[1][0] * num[0][1] * num[][];
        diagSec4 = num[2][2] * num[1][0] * num[0][1] * num[][];
        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3 + diagSec4) + (diagPrin1 + diagPrin2 + diagPrin3 + diagPrin4);
        System.out.println("O determinante da matriz eh : " + det);
        break;
    case 5:
        // Diagonais principais
        diagPrin1 = num[0][0] * num[1][1] * num[2][2] * num[][] * num[][];
        diagPrin2 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][];
        diagPrin3 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][];
        diagPrin4 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][];
        diagPrin5 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][];
        // Diagonais Secundárias
        diagSec1 = num[2][0] * num[1][1] * num[0][2] * num[][] * num[][];
        diagSec2 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][];
        diagSec3 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][];
        diagSec4 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][];
        diagSec5 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][];
        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3 + diagSec4 + diagSec5) + (diagPrin1 + diagPrin2 + diagPrin3 + diagPrin4 + diagPrin5);
        System.out.println("O determinante da matriz eh : " + det);
        break;
    case 6:
        // Diagonais principais
        diagPrin1 = num[0][0] * num[1][1] * num[2][2] * num[][] * num[][] * num[][];
        diagPrin2 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][];
        diagPrin3 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][];
        diagPrin4 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][];
        diagPrin5 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][];
        diagPrin6 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][];
        // Diagonais Secundárias
        diagSec1 = num[2][0] * num[1][1] * num[0][2] * num[][] * num[][] * num[][] * num[][];
        diagSec2 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][];
        diagSec3 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][];
        diagSec4 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][];
        diagSec5 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][];
        diagSec6 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][];
        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3 + diagSec4 + diagSec5 + diagSec6) + (diagPrin1 + diagPrin2 + diagPrin3 + diagPrin4 + diagPrin5 + diagPrin6);
        System.out.println("O determinante da matriz eh : " + det);
        break;
    case 7:
        // Diagonais principais
        diagPrin1 = num[0][0] * num[1][1] * num[2][2] * num[][] * num[][] * num[][] * num[][];
        diagPrin2 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin3 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin4 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin5 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin6 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin7 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][];
        // Diagonais Secundárias
        diagSec1 = num[2][0] * num[1][1] * num[0][2] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec2 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec3 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec4 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec5 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec6 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec7 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][];
        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3 + diagSec4 + diagSec5 + diagSec6 + diagSec7) + (diagPrin1 + diagPrin2 + diagPrin3 + diagPrin4 + diagPrin5 + diagPrin6 + diagPrin7);
        System.out.println("O determinante da matriz eh : " + det);
        break;
    case 8:
        // Diagonais principais
        diagPrin1 = num[0][0] * num[1][1] * num[2][2] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin2 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin3 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin4 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin5 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin6 = num[0][0] * num[1][1] * num[2][2] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin7 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin8 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        // Diagonais Secundárias
        diagSec1 = num[2][0] * num[1][1] * num[0][2] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec2 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec3 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec4 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec5 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec6 = num[2][0] * num[1][1] * num[0][2] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec7 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec8 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3 + diagSec4 + diagSec5 + diagSec6 + diagSec7 + diagSec8) + (diagPrin1 + diagPrin2 + diagPrin3 + diagPrin4 + diagPrin5 + diagPrin6 + diagPrin7 + diagPrin8);
        System.out.println("O determinante da matriz eh : " + det);
        break;
    case 9:
        // Diagonais principais
        diagPrin1 = num[0][0] * num[1][1] * num[2][2] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin2 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin3 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin4 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin5 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin6 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin7 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin8 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin9 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        // Diagonais Secundárias
        diagSec1 = num[2][0] * num[1][1] * num[0][2] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec2 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec3 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec4 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec5 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec6 = num[2][0] * num[1][1] * num[0][2] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec7 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec8 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec9 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3 + diagSec4 + diagSec5 + diagSec6 + diagSec7 + diagSec8 + diagSec9) + (diagPrin1 + diagPrin2 + diagPrin3 + diagPrin4 + diagPrin5 + diagPrin6 + diagPrin7 + diagPrin8 + diagPrin9);
        System.out.println("O determinante da matriz eh : " + det);
        break;
    case 10:
        // Diagonais principais
        diagPrin1 = num[0][0] * num[1][1] * num[2][2] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin2 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin3 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin4 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin5 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin6 = num[0][0] * num[1][1] * num[2][2] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin7 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin8 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin9 = num[0][1] * num[1][2] * num[2][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagPrin10 = num[0][2] * num[1][0] * num[2][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        // Diagonais Secundárias
        diagSec1 = num[2][0] * num[1][1] * num[0][2] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec2 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec3 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec4 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec5 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec6 = num[2][0] * num[1][1] * num[0][2] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec7 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec8 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec9 = num[2][1] * num[1][2] * num[0][0] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        diagSec10 = num[2][2] * num[1][0] * num[0][1] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][] * num[][];
        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3 + diagSec4 + diagSec5 + diagSec6 + diagSec7 + diagSec8 + diagSec9+diagSec10)
              +(diagPrin1 + diagPrin2 + diagPrin3 + diagPrin4 + diagPrin5 + diagPrin6 + diagPrin7 + diagPrin8 + diagPrin9 + diagPrin10);
        System.out.println("O determinante da matriz eh : " + det);
        break;
        sc.close();
}

}

}