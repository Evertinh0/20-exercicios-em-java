package exercicio01;
import java.util.Scanner;

public class exercicio01 {

    private static Scanner input;

    public static void main(String[] args) {
    input = new Scanner(System.in);
         
        double tempo, velmedia,distancia, tempohora;
    
        System.out.println("Informe o tempo gasto da viagem (tempo em minutos): ");
        tempo = input.nextInt();

        tempohora = tempo/60;

        System.out.println("Informe a velocidade media de trafego (km/h): ");
        velmedia = input.nextInt();
      
        distancia = tempohora*velmedia;

        System.out.println("O consumo de gasolina no seu trajeto será de : " + distancia/12 + " litros.");

    }
}

