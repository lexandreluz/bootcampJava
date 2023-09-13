package src.edu.processoSeletivo;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Caso 1
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, insira o salário pretendido por você para aplicação na vaga!");
        Double salarioPretendido = scanner.nextDouble();
        analisarSalario(salarioPretendido);
        scanner.close();
        // Caso 2
        selecaoCandidato();
        // Caso 3
        candidatosSelecionados();
        // Caso 4
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        System.out.println("\n------------ INICIO DO QUARTO MÉTODO ------------");    
        for ( String candidato : candidatos){
            ligacaoCanditados(candidato);
        }
        System.out.println("\n------------ FIM DO QUARTO MÉTODO ------------");    
    }
/**
 * Case 1: Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 
 * e o salário pretentido pelo candidato. Vamos elaborar um controle de fluxo onde:
 * Se o valor salário base, for maior que valor salário pretentido, imprima : 
 * LIGAR PARA O CANDIDATO;
 * Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : 
 * LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
 * Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.
 */
    public static void analisarSalario(Double salarioPretendido){
        System.out.println("------------ INICIO DO PRIMEIRO MÉTODO ------------");
        Double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        System.out.println("------------ FIM DO PRIMEIRO MÉTODO ------------");
    }
/**
 * Case 2: Foi solicitado, que nosso sistema garanta que, diante das inúmeras candidaturas sejam 
 * selecionados apenas no máximo, 5 candidatos para entrevista, onde o salário pretendido seja menor 
 * ou igual ao salário base.
 */
    public static void selecaoCandidato(){
        System.out.println("\n------------ INICIO DO SEGUNDO MÉTODO ------------");
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        Double salarioBase = 2000.0;
        int totalSelecionados = 0;
		int proximoCandidato = 0;
        while (totalSelecionados < 5 && proximoCandidato < candidatos.length){
            String candidato = candidatos[proximoCandidato++];
			double valorPretendido = valorPretendido();
			System.out.println("\nO candidato " + candidato + " está pedindo " + valorPretendido);
			if(valorPretendido > salarioBase) {
				System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
				
			}else {
				System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
				totalSelecionados++;
			}

        }
        System.out.println("------------ FIM DO SEGUNDO MÉTODO ------------");
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
/**
 * Case 3: Agora é hora de imprimir a lista dos candidatos 
 * selecionados, para disponibilizar para o RH entrar em contato.
 */
    public static void candidatosSelecionados(){
        System.out.println("\n------------ INICIO DO TERCEIRO MÉTODO ------------");
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        System.out.println("\nEsses foram os candidatos selecionados");
        for (String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
        System.out.println("\n------------ FIM DO TERCEIRO MÉTODO ------------");
    }
/**
 * Case 4: O RH deverá realizar uma ligação, com no máximo 03 tentativas para cada candidato 
 * selecionado e caso o candidato atenda, deve-se imprimir:
 * "CONSEGUIMOS CONTATO COM _[CANDIDATO] ``` APÓS **_**[TENTATIVA]`** TENTATIVA(S)" ;*
 * *Do contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O _[CANDIDATO]_".
 * @param canditato
 */
    public static void ligacaoCanditados(String candidato){    
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("\nCONTATO REALIZADO COM SUCESSO");
			
		} while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("\nNÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
    }
    	//método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}

