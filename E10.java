package ExercicioDez;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
      
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int prestacao = 5;
        double precoFinal;
        
        System.out.println("Insira o valor do produto: ");
        double preco = sc.nextDouble();
        
        precoFinal = preco / prestacao;

        System.out.printf("Serviço %d prestações de R$ %.2f%n.", prestacao, precoFinal);

        sc.close();
    }
}
