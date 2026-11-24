package act1;

public class LineaRegular extends Licencia{

	public LineaRegular(String id) {
		super(id);
	}

	@Override
	public double contribucionONAT(double ingresos, double cuota){
		double contribucion = cuota;
		double porCiento=0;
		if(ingresos > cuota){
			porCiento=5/100.0*ingresos;
			contribucion += porCiento;
		}
		return contribucion;
	}
}
