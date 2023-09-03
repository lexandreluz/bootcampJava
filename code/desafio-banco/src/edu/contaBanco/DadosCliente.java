package edu.contaBanco;
import java.util.Locale;
import java.util.Scanner;

/*
 * Classe criada para adicionar 
 * os dados do usuário
 */

public class DadosCliente{
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    String nomeCliente;
    String agencia; 
    int numeroConta;
    double saldo;

    public void criarConta(){
        System.out.println("Digite o seu nome completo: ");
        nomeCliente = scanner.next();
        System.out.println("Insira a Agência: ");
        agencia = scanner.next();
        System.out.println("Insira o número da conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Insira o saldo inicial: ");
        saldo = scanner.nextDouble();
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", \nconta " + numeroConta + " e seu saldo R$" + saldo +" já está disponível para saque");
        System.out.println("--------------------------------------------------------------------------------------");

    }
}