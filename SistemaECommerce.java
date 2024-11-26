package avaliacaoSemestral;

public class SistemaECommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransporteFactory factory = new TransporteFactory();
		TransportSelector selector = new TransportSelector(factory);
		
		Encomenda encomenda = new Encomenda(10.0, 0.8, false);
		Localizacao localizacao = new Localizacao("Sao Paulo", "SP", "Brasil");
		
		Transporte transporte = selector.selecionarTransporte(encomenda, localizacao);
		
		if(transporte != null) {
			transporte.executar(encomenda);
		}else {
			System.out.println("Nenhum transporte disponivel para os criterios.");
		}
		
		
		
		Encomenda encomendaNova = new Encomenda(5.0, 1.8, true);
		Localizacao localizacaoNova = new Localizacao("Curitiba", "PR", "Brasil");
		
		Transporte transporteNova = selector.selecionarTransporte(encomendaNova, localizacaoNova);
		
		if(transporteNova != null) {
			transporteNova.executar(encomendaNova);
		}else {
			System.out.println("Nenhum transporte disponivel para os criterios.");
		}
	}

}
