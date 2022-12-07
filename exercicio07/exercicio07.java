package exercicio07;

import java.util.Scanner;

public class exercicio07 {
    private static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);

        int a,b,c;
        int valors,valorp, resultadoA, resultadoB;

        System.out.print("Digite o valor de A: ");
        a = entrada.nextInt();
        System.out.print("Digite o valor de B: ");
        b = entrada.nextInt();
        System.out.print("Digite o valor de C: ");
        c = entrada.nextInt();

        System.out.println();
        System.out.println("Equação: "+a+"x² + "+b+"x + "+c+" = 0");
        System.out.println();

        valors = b/a;
        valorp = c/a;
        System.out.println(b+" / "+a+" ="+valors);
        System.out.println(c+" / "+a+" ="+valorp);

        resultadoA = valors/2;
        resultadoB = valorp/2;
       
        System.out.println();
        System.out.println("Resultado: "+resultadoA );
        System.out.println("Resultado: "+resultadoB );
    }
}
