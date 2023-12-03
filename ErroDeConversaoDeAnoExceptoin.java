package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExceptoin extends RuntimeException {
	private String mensagem;

	public ErroDeConversaoDeAnoExceptoin(String mensagem) {
	this.mensagem = mensagem;
	}
	
	@Override
	public String getMessage() {
		return this.mensagem;
	}
}
