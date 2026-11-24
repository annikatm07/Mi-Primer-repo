package act1;

public abstract class Licencia {
	private String id;
	
	public Licencia(String id){
		this.setId(id);
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public abstract double contribucionONAT(double ingresos, double cuota);
}
