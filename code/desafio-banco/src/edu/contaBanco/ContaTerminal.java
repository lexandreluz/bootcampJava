package edu.contaBanco;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main (String [] args) throws Exception{
        DadosCliente dadosCliente = new DadosCliente();
        System.out.println("--------------------------------------------");
        System.out.println("Olá, Bem Vindo(a) ao Banco IZI");
        System.out.println("Abaixo iremos realizar a abertura da conta");
        System.out.println("--------------------------------------------");
        dadosCliente.criarConta();
        //Teste
    }    
}
