import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome da(o) aluna(o): ");
        String nome = sc.nextLine();
        sc.nextLine();
        System.out.println("Insira o nota da primeira prova: ");
        double nota1 = sc.nextDouble();
        System.out.println("Insira o nota da segunda prova: ");
        double nota2 = sc.nextDouble();
        System.out.println("Insira o nota da terceira prova: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("%s. obteve média %.2f%n", nome, media);

        sc.close();
    }
}
