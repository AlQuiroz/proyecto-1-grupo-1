package proyecto1;

import java.util.Scanner;
public class Aeropuerto {
	private String aeropuerto;
	private LineaAerea linea;
	Scanner scanner = new Scanner(System.in);
	public Aeropuerto(){
		aeropuerto = "La Aurora";
		linea=new LineaAerea();
	}
	public String getAeropuerto() {
		return aeropuerto;
	}
	public void setAeropuerto(String aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
	public void asignarLinea(){
		System.out.println("Ingrese el nombre de la aerolinea");
		String nombre = scanner.nextLine();
		linea.setNombreLinea(nombre);
		linea.asignarAdministrador();
		linea.asignarVuelo();
	}
}
