package avaliacaoSemestral;

public class Encomenda {
private double peso;
private double dimensao;
private boolean internacional;

public Encomenda(double peso, double dimensao, boolean internacional) {
	this.peso = peso;
	this.dimensao = dimensao;
	this.internacional = internacional;
}
public double getPeso() {
	return peso;
}
public double getDimensao() {
	return dimensao;
}

public boolean isInternacional() {
	return internacional;
}


}
