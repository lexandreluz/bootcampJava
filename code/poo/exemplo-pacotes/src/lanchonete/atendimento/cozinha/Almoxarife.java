package lanchonete.atendimento.cozinha;

public class Almoxarife {
	/** ATRIBUTOS NÃO USADOS
	 * private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	 */
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	public void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}