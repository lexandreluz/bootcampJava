package edu.contaBanco;
import java.util.Locale;
import java.util.Scanner;

public class DadosCliente{
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    String nomeCliente;
    
    public void criarConta(){
        System.out.println("Digite o seu nome completo: ");
        nomeCliente = scanner.next();
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque");
    }
}