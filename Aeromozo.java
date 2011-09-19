/********************************************************************************************************************
 * Nombre del archivo: Administrativo.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: se crea la variable administrativo para la respectiva aerolinea.
 ********************************************************************************************************************/
package proyecto1;

public class Administrativo {
	
	//Se define el atributo de la clase
	private String nombreAdministrador;
	
	/*Se define el constructor de la clase. No recibe parámetros ni tiene valor de retorno.
     * Su función es construir un objeto.*/
	public Administrativo(){
		nombreAdministrador="";
	}
	
	/*El método getNombreAdministrador no recibe parámetros y su función es mostrar el valor
	 * de la variable nombreAdministrador. El valor del retorno es String.*/
	public String getNombreAdministrador() {
		return nombreAdministrador;
	}
	
	/*El método setNombreAdministrador recibe como parámetro "nombreAdministrador" que es
	 * de tipo String y se refiere al nombre del administrador. Este valor se
	 * asigna a la variable nombreAdministrador. No tiene valor de retorno.*/
	public void setNombreAdministrador(String nombreAdministrador) {
		this.nombreAdministrador = nombreAdministrador;
	}

}
