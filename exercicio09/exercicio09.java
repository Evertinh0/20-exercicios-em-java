package exercicio09;
import java.util.Scanner;

public class exercicio09 {
    private static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);

        double menu;
        double temperaturaA, temperaturaB, calculoA, calculoB;
  
        System.out.println("#######    CONVERSÃO DE TEMPERATURA   #######");
        System.out.println("Escolha uma opção:");
        System.out.println("Digite 1 = FARENHEIT PARA CELCIUS");
        System.out.println("Digite 2 = CELCIUS PARA FARENHEIT");
        menu = entrada.nextDouble();


        if (menu == 1) {
            System.out.print("Digite a temperatura: ");
            temperaturaA = entrada.nextDouble();


            calculoA = (temperaturaA-32)/1.8;

            System.out.println(temperaturaA+"°F é igual a "+calculoA+"°C.");
            
        } else if (menu == 2) {
            System.out.print("Digite a temperatura:");
            temperaturaB = entrada.nextDouble();

            calculoB = (temperaturaB*1.8)+32;

            System.out.println(temperaturaB+"°C é igual a "+calculoB+"°F.");
        }else{
            System.out.println("Opção invalida.");
        }
    }
}
