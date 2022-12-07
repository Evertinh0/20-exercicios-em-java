package exercicio03;
import java.util.Scanner;

public class exercicio03 {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int a;

        System.out.println("Digite o numero: ");
        a = input.nextInt();

        if (a %2 == 0) {
            System.out.println("O número: "+a+" é Par.");
        }
        else{
            System.out.println("O número: "+a+" é Impar.");
        }
    }
}