package proyecto1;

public class Avion {
	
	private Asiento cantidadAsientos;
	private int nacional;
	private int internacional;
	
	public Avion(){
		cantidadAsientos = new Asiento();
		nacional = 0;
		internacional = 0;
	}

	public int getNacional() {
		return nacional;
	}

	public void setNacional(int nacional) {
		this.nacional = nacional;
	}

	public int getInternacional() {
		return internacional;
	}

	public void setInternacional(int internacional) {
		this.internacional = internacional;
	}

	public Asiento asignarInternacional(){
		cantidadAsientos.setAsiento_ejecutivo(200);
		cantidadAsientos.setAsiento_primera(100);
		cantidadAsientos.setAsiento_turista(500);
		return cantidadAsientos;
	}
	public Asiento asignarNacional(){
		cantidadAsientos.setAsiento_ejecutivo(150);
		cantidadAsientos.setAsiento_primera(50);
		cantidadAsientos.setAsiento_turista(300);
		return cantidadAsientos;
	}
}
