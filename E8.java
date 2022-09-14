package ExercicioOito;

import java.util.Locale;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
         
        double real;
  
        System.out.println("Informe o valor em USS Dolar para ser convertido em Real");
        double dolar = sc.nextDouble;
        System.out.println("Informe a cotação do USS Dolar para Real: ");
        double cotacaoRealDolar = sc.nextDouble;
        System.out.println("Informe a quantidade de USS Dolar disponível com o usuários");
        double reserva  = sc.nextDouble;

        real = dolar * cotacaoRealDolar;
        
        System.out.printf("A(o) usuária(o) converteu US$ %.2f na cotação de %.2f"
        + " totalizando um valor de R$ %.2f%n.", dolar, cotacaoRealDolar, real);

        sc.close();

    }
}
