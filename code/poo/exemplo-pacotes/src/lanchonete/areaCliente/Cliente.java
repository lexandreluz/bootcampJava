package lanchonete.areaCliente;

public class Cliente {
	public void escolherLanche() {
		System.out.println("ESCOLHENDO O LANCHE");
	}
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
	public void pagarConta() {
        consultarSaldoAplicativo();
		System.out.println("PAGANDO A CONTA");
	}
	private void consultarSaldoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}
	/** ATRIBUTOS NÃO USADOS
	 * private void pegarPedidoBalcao() {s
	 * 		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	 * }
	 */
}