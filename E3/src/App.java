import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a distância percorrida do automóvel: ");
        double distancia = sc.nextDouble();
        System.out.println("Insira a quantidade de combustível utilizado: ");
        double combustivel = sc.nextDouble();

        double consumoMedio = 0.0;

        consumoMedio = distancia / combustivel;

        System.out.println("O consumo médio do automóvel foi de " + consumoMedio);

        sc.close();
    }
}