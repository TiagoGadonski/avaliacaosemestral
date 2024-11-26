package avaliacaoSemestral;
import java.util.List;

public class TransportSelector {
 private TransporteFactory factory;
 
 public TransportSelector(TransporteFactory factory) {
	 this.factory = factory;
 }
 
 public Transporte selecionarTransporte(Encomenda encomenda, Localizacao localizacao) {
	 List<Transporte> transportes = factory.getTransportes();
	 for (Transporte transporte : transportes) {
		 if(transporte.podeAplicar(encomenda, localizacao)) {
			 return transporte;
		 }
	 }
	 return null;
 }
}
