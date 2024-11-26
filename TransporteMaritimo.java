package avaliacaoSemestral;

public class TransporteMaritimo implements Transporte {
	@Override
	public boolean podeAplicar(Encomenda encomenda, Localizacao localizacao) {
		return encomenda.isInternacional();
	}

	@Override
	public void executar(Encomenda encomenda) {
		System.out.println("Executando transporte maritimo para entrega internacional.");
	}
}
