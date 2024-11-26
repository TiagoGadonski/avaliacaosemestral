package avaliacaoSemestral;

public interface Transporte {
	boolean podeAplicar(Encomenda encomenda, Localizacao localizacao);
	void executar(Encomenda encomenda);
}
