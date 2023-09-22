import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();        

        // Criar um objeto DecimalFormat para formatar o valor final
        DecimalFormat df = new DecimalFormat("#.##");   

        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));        
        scanner.close();
    }
}