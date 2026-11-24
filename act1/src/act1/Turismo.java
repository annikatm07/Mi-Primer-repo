package act1;

public class Turismo extends Licencia{
	private boolean esConvertible;
	public Turismo (String id, boolean esConvertible){
		super(id);
		this.setEsConvertible(esConvertible);
	}
	public boolean getEsConvertible(){
		return esConvertible;
	}
	public void setEsConvertible(boolean esConvertible){
	this.esConvertible=esConvertible;
	}
	@Override
	public double contribucionONAT(double ingresos,double cuota){
		double contribucion=cuota;
		double porCiento=0;
		if(ingresos > cuota){
			porCiento=50/100.0*ingresos;
			contribucion += porCiento;
		}
		return contribucion;
	}

}
