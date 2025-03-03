import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados do terminal

        //Exibir a mensagem da conta criada

        //Variaveis: NUMERO - AGENCIA - NOME CLIENTE - SALDO
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o primeiro nome do cliente !");
        String primeiroNome = scanner.next();

        System.out.println("Por favor, digite o primeiro nome do cliente !");
        String segundoNome = scanner.next();

        String nomeCliente = primeiroNome + " " + segundoNome;

        System.out.println("Por favor, digite o saldo !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
