package avaliacaoSemestral;

public class EntregaDrone implements Transporte{
	@Override
	public boolean podeAplicar(Encomenda encomenda, Localizacao localizacao) {
		return encomenda.getDimensao()<= 0.5 && localizacao.isAreaMetropolitana();
	}

	@Override
	public void executar(Encomenda encomenda) {
		System.out.println("Executando entrega por drone em area metropolitana.");
	}
}
