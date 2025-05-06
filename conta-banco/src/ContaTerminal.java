import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome (Ex: João Silva): ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta (Ex: 12345): ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha

        System.out.println("Digite o número da agência (Ex: 1234-X): ");
        String agencia = scanner.nextLine();

        System.out.println("Seu saldo (Ex: 2500.75): R$ ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consome a quebra de linha

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
