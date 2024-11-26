package avaliacaoSemestral;

public class TransporteAereo implements Transporte {
	
	private static final double LIMITE_PESO = 50.0;
	private static final double LIMITE_DIMENSOES =  1.0;
	@Override
	public boolean podeAplicar(Encomenda encomenda, Localizacao localizacao) {
		return encomenda.getPeso() <= LIMITE_PESO && encomenda.getDimensao() <= LIMITE_DIMENSOES;
	}

	@Override
	public void executar(Encomenda encomenda) {
		System.out.println("Executando transporte aereo considerando limites de peso e dimensoes.");
	}
}
