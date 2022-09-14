import java.util.Locale;
import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do deposito: ");
        double deposito = sc.nextDouble;

        double rendimento;
        double juros = 0.07;
        
        rendimento = deposito + (deposito * juros);
        
        System.out.printf("Os rendimentos após um mês foram de R$ %.2f%n.", rendimento);

        sc.close();
        
    }
}
