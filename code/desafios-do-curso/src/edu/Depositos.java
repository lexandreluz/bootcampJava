/**
 * Desafio
Você foi contratado por um banco para desenvolver um programa que auxilie seus clientes a 
realizar depósitos em suas contas. O programa deve solicitar ao cliente o valor do depósito 
e verificar se o valor é válido. Se o valor for maior do que zero, o programa deve adicionar 
o valor ao saldo da conta. Caso contrário, o programa deve exibir uma mensagem de erro. 
O programa deve soliticar apenas uma vez o valor de depósito.

* Entrada
O programa deve utilizar o Scanner para receber o valor de depósito digitado pelo cliente. 
Os valor pode ser decimal, representando valor em reais.

* Saída
O programa deve exibir uma mensagem de sucesso quando um valor de depósito válido for 
informado e o saldo da conta for atualizado. Se o valor for "0", deverá imprimir uma 
mensagem encerrando o programa. Caso um valor inválido seja digitado, o programa deve 
exibir uma mensagem de erro solicitando um novo valor.

500.50
-100
0


Saldo atual: R$ 500.50

Valor invalido! Digite um valor maior que zero.

Encerrando o programa...
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Depositos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat ("#.00");

        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + df.format(valor));
        } else if (valor < 0) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
             System.out.println("Encerrando o programa...");
        }
        scanner.close();
    }
}