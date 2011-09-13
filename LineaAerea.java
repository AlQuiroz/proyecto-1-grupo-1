package proyecto1;

import java.util.Scanner;
public class LineaAerea {
	private String nombreLinea;
	private Administrativo admin;
	private Vuelo vuelo;
	Scanner scanner=new Scanner(System.in);
	public LineaAerea(){
		nombreLinea="TACA";
		admin= new Administrativo();
		vuelo=new Vuelo();
	}
	public String getNombreLinea() {
		return nombreLinea;
	}
	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}
	public void asignarAdministrador(){
		System.out.println("Ingrese el nombre del administrador");
		String name=scanner.nextLine();
		admin.setNombreAdministrador(name);
	}
	public void asignarVuelo(){
		System.out.println("Ingrese el tipo de vuelo (nacional/internacional)");
		String tipo=scanner.next();
		vuelo.setTipo(tipo);
		System.out.println("Ingrese el destino");
		String destino=scanner.nextLine();
		vuelo.setDestino(destino);
		System.out.println("Ingrese la hora de salida en formato 00.00 horas");
		double time = scanner.nextDouble();
		vuelo.setHora_salida(time);
		System.out.println("Ingrese la hora de llegada en formato 00.00 horas");
		double hora = scanner.nextDouble();
		vuelo.setHora_llegada(hora);
		vuelo.asignarAvion();
		vuelo.asignarPersonal();
	}
	
}
