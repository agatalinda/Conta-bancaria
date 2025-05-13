import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Informe seu nome (Ex: Ana): ");
            String nome = scanner.nextLine();

            System.out.println("Digite o seu sobrenome (Ex: Falcão): ");
            String sobrenome = scanner.nextLine(); // Alterado para String para evitar erro

            System.out.println("Digite a sua idade (Ex: 30): ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            System.out.println("Digite sua altura (Ex: 1.75): ");
            double altura = scanner.nextDouble();

            // Exibir a mensagem com os dados fornecidos
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " metros");

            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
