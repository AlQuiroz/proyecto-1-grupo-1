/********************************************************************************************************************
 * Nombre del archivo: Aeropuerto.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: esta clase genera un aeropuerto que utiliza la clase LineaAerea para 
 * crear su base de datos.
 ********************************************************************************************************************/
package proyecto1;

//Se importa la clase Scanner para el ingreso de datos por teclado.
import java.util.Scanner;

public class Aeropuerto {
	
	//Se definen los atributos de la clase.
	private String aeropuerto;//Se refiere al nombre del aeropuerto
	private LineaAerea linea;//Se crea un objeto de tipo LineaAerea para crear una linea aerea
	Scanner scanner = new Scanner(System.in);//Se crea un objeto de tipo Scanner para el ingreso de datos por teclado
	
	/*Se define el constructor de la clase. No recibe parámetros ni tiene valor de retorno.
     * Su función es construir un objeto.*/
	public Aeropuerto(){
		aeropuerto = "";
		setLinea(new LineaAerea());
	}
	
	/*El método getAeropuerto no recibe parámetros y su función es mostrar el valor de
     * la variable aeropuerto. El valor del retorno es String.*/
	public String getAeropuerto() {
		return aeropuerto;
	}
	
	/*El método setAeropuerto recibe como parámetro "aeropuerto" que es de tipo String y
	 * se refiere al nombre del aeropuerto. Este valor se
	 * asigna a la variable aeropuerto. No tiene valor de retorno.*/
	public void setAeropuerto(String aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
	
	/*El método asignarLinea no recibe parámetro y su función es generar una nueva aerolinea
	 * en el aeropuerto. No tiene valor de retorno.*/
	public void asignarLinea(){
		System.out.println("Ingrese el nombre de la aerolinea");
		String nombre = scanner.nextLine();
		getLinea().setNombreLinea(nombre);
		getLinea().asignarAdministrador();
		getLinea().asignarVuelo();
	}
	
	/*El método getLinea no recibe parámetros y su función es mostrar el valor de
     * la variable linea. El valor del retorno es LineaAerea.*/
	public LineaAerea getLinea() {
		return linea;
	}
	
	/*El método setLinea recibe como parámetro "linea" que es de tipo LineaAerea y
	 * se refiere al objeto de tipo LineaAerea. Este valor se
	 * asigna a la variable linea. No tiene valor de retorno.*/
	public void setLinea(LineaAerea linea) {
		this.linea = linea;
	}
}
