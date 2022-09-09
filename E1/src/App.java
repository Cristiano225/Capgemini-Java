import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    //Declarando as entradas
    int resultado = 0;
       
    System.out.println("Informe o primeiro número: ");
    int numero1 = sc.nextInt();

    System.out.println("Informe o segundo número: ");  
    Scanner sc = new Scanner(System.in);
    
    int numero2 = sc.nextInt();
       
    //Processando os dados
       
    resultado = numero1 + numero2;
       
    System.out.println("O resultado da soma foi " + resultado);
    
    sc.close();
    }
}
