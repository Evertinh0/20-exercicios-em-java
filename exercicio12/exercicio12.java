package exercicio12;
import java.util.Scanner;

public class exercicio12 {
    private static Scanner entrada;

    public static void main(String[] args) {
        
        boolean s = true;
        int entrar;
        char opcao;

        entrada = new Scanner(System.in);

        while (s) {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 = Aprender");
            System.out.println("2 = Escrever");
            System.out.println("3 = Falar");
            System.out.println("S = Sair");
            entrar = entrada.nextInt();

            if (entrar == 1) {
                System.out.println("Aprender");
            }else if(entrar==2) {
                System.out.println("Escrever");
            }else if(entrar == 3){
                System.out.println("Falar");
            }else{

            }

            System.out.println("Deseja encerrar o programa?");
            opcao = entrada.next().charAt(0);

            if (opcao =='s') {
                s=false;
                System.out.println("voce saiu.");
            }
        }
    }
}
