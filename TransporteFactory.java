package avaliacaoSemestral;
import java.util.ArrayList;
import java.util.List;


public class TransporteFactory {
private List<Transporte> transportes = new ArrayList<>();

public TransporteFactory() {
	transportes.add(new TransporteTerrestre());
	transportes.add(new TransporteAereo());
	transportes.add(new TransporteMaritimo());
	transportes.add(new EntregaDrone());
}

public void registrarTransporte(Transporte transporte) {
	transportes.add(transporte);
}

public List<Transporte> getTransportes(){
	return transportes;
}
}
