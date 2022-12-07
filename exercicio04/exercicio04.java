package exercicio04;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio04 {
    private static Scanner input;

    public static void main(String[]args) {
       input = new Scanner(System.in);
        
       int[] listaNumeros = new int[5];

       for (int i = 1; i < listaNumeros.length; i++) {
            System.out.print("Digite o "+i+"° numero:");
            listaNumeros[i] = input.nextInt();
       }
       
       Arrays.sort(listaNumeros);

       System.out.println(Arrays.toString(listaNumeros));

    }
}
