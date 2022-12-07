package exercicio05;
import java.util.Scanner;

public class exercicio05 {
        private static Scanner entrada;

        public static void main(String[] args) {
            entrada = new Scanner(System.in);

            int a;

            System.out.println("   BEM-VINDO AO SHOW DE PREMIOS!!!!  ");
            System.out.println("Digite seu numero da sorte entre 1 e 9: ");
            a = entrada.nextInt();


            if (a == 1) {
                System.out.println("Parabens, voce ganhou um carro.");
            }else if(a == 2) {
                System.out.println("Parabens, voce ganhou uma bola.");
            }else if(a == 3) {
                System.out.println("Parabens, voce ganhou uma TV.");
            }else if(a == 4) {
                System.out.println("Parabens, voce ganhou uma bicicleta.");
            }else if(a == 5) {
                System.out.println("Parabens, voce ganhou uma panela.");
            }else if(a == 6) {
                System.out.println("Parabens, voce ganhou um computador.");
            }else if(a == 7) {
                System.out.println("Parabens, voce ganhou uma moto.");
            }else if(a == 8) {
                System.out.println("Parabens, voce ganhou um videogame.");
            }else if(a == 9) {
                System.out.println("Parabens, voce ganhou um celular.");
            }else {
                System.out.println("Numero incorreto, digite novamente.");
            }
        }
}
