package br.com.alura.alurator;

import java.util.Map;

import br.com.alura.alurator.protocolo.Request;

public class Alurator {

	private String pacoteBase;

	public Alurator(String pacoteBase) {
		this.pacoteBase = pacoteBase;
	}

	public Object executa(String url) {
		// TODO - processa a requisicao executando o metodo
		// da classe em questao

		Request request = new Request(url);
		String nomeControle = request.getNomeControle();
		String nomeMetodo = request.getNomeMetodo();
		Map<String, Object> params = request.getQueryParams();

		Object retorno = new Reflexao().refleteClasse(pacoteBase + nomeControle).criaInstancia().getMetodo(nomeMetodo,params)
				.invoca();

		return retorno;
	}
}
