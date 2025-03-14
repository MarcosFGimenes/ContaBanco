import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int numeroDaConta;
        String agencia;
        String nomeCliente = "Fulano de tal";
        double saldo = 1000.0;


        Scanner scanner = new Scanner(System.in);
        System.out.println(("Digite o número da sua conta."));
        numeroDaConta = scanner.nextInt();
        System.out.println(("Digite a agência da sua conta."));
        agencia = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numeroDaConta + " e seu saldo R$" + saldo + " já está disponível para saque.");


        scanner.close();
    }
}
