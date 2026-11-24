package act1;

public class ServicioLibre extends Licencia {
	public ServicioLibre (String id){
		super(id);
	}
	@Override
	public double contribucionONAT(double ingresos,double cuota){
		double contribucion=cuota;
		double porCiento=0;
		if(ingresos > cuota){
			porCiento=25/100.0*ingresos;
			contribucion += porCiento;
		}
		return contribucion;
	}
	

}
