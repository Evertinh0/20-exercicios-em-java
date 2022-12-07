package exercicio11;

public class exercicio11 {
    public static void main(String[]args) {

        int cont= 0;
        int a = 1;


        for (int i = 0; i<=5; i++){
			for (int j = 0; j<=10; j++){
				System.out.println (i+" x "+ j + " = " + i*j);
            }
        }

        for (cont = 0; cont<=20; cont++){
				System.out.print ("soma: "+cont+" + 1 = ");  
                int soma = a+cont;
                System.out.println(soma);
        }
    }
}