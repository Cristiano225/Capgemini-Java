import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do(a) vendedor(a): ");
        String nome = sc.nextLine();
        sc.nextLine();
        System.out.println("Informe o salário fixo do(a) vendedor(a): ");
        double salario = sc.nextDouble();
        System.out.println("Informe o total de vendas em dinheiro do(a) mesmo(a): ");
        double vendas = sc.nextDouble();

        double salarioTotal = salario + (vendas * 15 / 100);

        System.out.printf("%s tem um salário fixo de R$ %.2f e faturou no mês "
                + "com as comissões um valor de R$ %.2f", nome, salario, salarioTotal);

        sc.close();
    }
}
