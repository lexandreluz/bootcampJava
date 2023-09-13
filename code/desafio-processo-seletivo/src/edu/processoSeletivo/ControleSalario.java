package src.edu.processoSeletivo;
import java.util.Locale;
import java.util.Scanner;
/**
 * Case 1: Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 
 * e o salário pretentido pelo candidato. Vamos elaborar um controle de fluxo onde:
 * Se o valor salário base, for maior que valor salário pretentido, imprima : 
 * LIGAR PARA O CANDIDATO;
 * Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : 
 * LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
 * Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.
 */
public class ControleSalario{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, insira o salário pretendido por você para aplicação na vaga!");
        Double salarioPretendido = scanner.nextDouble();
        analisarSalario(salarioPretendido);
        scanner.close();
    }
    public static void analisarSalario(Double salarioPretendido){
        Double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido)
            System.out.println("\nLIGAR PARA O CANDIDATO");
        else if(salarioBase == salarioPretendido)
            System.out.println("\nLIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        else
            System.out.println("\nAGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }
}