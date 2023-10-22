package temasBasicos.polimorfismo1.apps;

public abstract class ServicoMensagemInstantanea {

	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarConexaoInternet() {
		System.out.println("Validando se está conectado com a internet");
	}
	
	/*
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico da mensagem");
	}
	 */
}
