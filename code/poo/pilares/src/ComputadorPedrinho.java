/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMensagem();
		fb.receberMensagem();

        Telegram tl = new Telegram();
        tl.enviarMensagem();
        tl.receberMensagem();

	}
}