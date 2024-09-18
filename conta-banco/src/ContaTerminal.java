import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                        + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
