import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da variável A: ");
        String a = sc.next();
        System.out.println("Insira o valor da variável B: ");
        String b = sc.next();

        System.out.printf("O valore trocado de A é %s o valor de B é %s", b, a);

        sc.close();
    }
}
