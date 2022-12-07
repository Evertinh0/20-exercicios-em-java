package exercicio06;

import java.util.Scanner;

public class exercicio06 {
    private static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);

        float horastrabalhadas, valorhoras, desconto,calculo,calculo2,calculo3;

        System.out.print("Digite quantas horas foram trabalhadas no mes: ");
        horastrabalhadas = entrada.nextFloat();

        System.out.print("Digite o valor da sua hora: ");
        valorhoras = entrada.nextFloat();

        System.out.print("Digite a % de desconto: ");
        desconto = entrada.nextFloat();

        System.out.println();
        calculo = horastrabalhadas*valorhoras;
        System.out.println("Seu salario bruto é de R$:"+calculo);

        System.out.println();
        calculo2 = (desconto/100)*calculo;
        System.out.println("O desconto foi de R$:"+calculo2);

        System.out.println();
        calculo3 = calculo - calculo2;
        System.out.println("Seu salario liquido é de R$:"+calculo3);
    }
}
