import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        System.out.println("Número da Conta: ");
        int conta = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite a Agência!");
        System.out.println("Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        System.out.println("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta!");
        System.out.println("Saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
