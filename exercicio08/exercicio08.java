package exercicio08;
import java.util.Scanner;

public class exercicio08 {
    private static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);

        double volume, raio;

        System.out.println("  CALCULE O VOLUME!!!  ");
        System.out.println("Digite o valor do raio: ");
        raio = entrada.nextDouble();

        volume = (4*3.14*raio*raio*raio)/3;
        System.out.println("O volume total é de: "+volume+" cm³");
    }
}