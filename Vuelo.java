package proyecto1;
import java.util.Date;
import java.util.Scanner;

public class Vuelo {
	private Date fecha;
	private String destino;
	private double hora_salida;
	private double hora_llegada;
	private int numero;
	private String tipo;
	private Avion avion;
	private Piloto piloto;
	private Aeromozo mozo;
	Scanner scanner = new Scanner(System.in);
	
	public Vuelo(){
		fecha = new Date();
		destino="España";
		hora_salida=6.00;
		hora_llegada=13.00;
		numero = 0;
		tipo = "internacional";
		avion = new Avion();
		piloto = new Piloto();
		mozo = new Aeromozo();
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public double getHora_salida() {
		return hora_salida;
	}
	public void setHora_salida(double hora_salida) {
		this.hora_salida = hora_salida;
	}
	public double getHora_llegada() {
		return hora_llegada;
	}
	public void setHora_llegada(double hora_llegada) {
		this.hora_llegada = hora_llegada;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Avion asignarAvion(){
		if (tipo.equals("nacional"))
			avion.asignarNacional();
		else if(tipo.equals("internacional"))
			avion.asignarInternacional();
		return avion;
	}
	public void asignarPersonal(){
		System.out.println("Ingrese el nombre del piloto");
		String name = scanner.nextLine();
		piloto.setNombrePiloto(name);
		System.out.println("Ingrese el nombre del aeromozo");
		String nombre = scanner.nextLine();
		mozo.setNombreMozo(nombre);
	}
}
