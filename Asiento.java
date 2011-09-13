package proyecto1;

public class Asiento {
    private int asiento_primera;
    private int asiento_ejecutivo;
    private int asiento_turista;
    
    public Asiento()
    {
    	asiento_primera=0;
    	asiento_ejecutivo=0;
    	asiento_turista=0;
    }

	public int getAsiento_primera() {
		return asiento_primera;
	}

	public void setAsiento_primera(int cantidad) {
		this.asiento_primera = cantidad;
	}

	public int getAsiento_ejecutivo() {
		return asiento_ejecutivo;
	}

	public void setAsiento_ejecutivo(int cantidad) {
		this.asiento_ejecutivo = cantidad;
	}

	public int getAsiento_turista() {
		return asiento_turista;
	}

	public void setAsiento_turista(int cantidad) {
		this.asiento_turista = cantidad;
	}
    
}
