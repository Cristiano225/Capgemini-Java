
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int n2 = sc.nextInt();
               
        //Processamento dos dados
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int  multiplicacao = n1 * n2;
        double resultadoDivisao = n1 / n2;
        
        System.out.println("Resultado Soma: "+ soma);
        System.out.println("Resultado Subtraçãoo: "+ subtracao);
        System.out.println("Resultado Multiplicação: "+ multiplicacao);
        System.out.println2("Resultado Divisão: "+ divisao);

        sc.close();
     }
}
