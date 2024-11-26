package avaliacaoSemestral;

public class TransporteTerrestre implements Transporte {
@Override
public boolean podeAplicar(Encomenda encomenda, Localizacao localizacao) {
	return true;
}

@Override
public void executar(Encomenda encomenda) {
	System.out.println("Executando transporte terrestre com transportadora local.");
}
}
