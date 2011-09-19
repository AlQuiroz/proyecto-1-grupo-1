/********************************************************************************************************************
 * Nombre del archivo: Piloto.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: Esta clase genera una variable para asignar el nombre del piloto del avión.
 ********************************************************************************************************************/
package proyecto1;

public class Piloto {
	
	//Se define el atributo de la clase
	private String nombrePiloto;//Se refiere al nombre del piloto del avión

	/*Se define el constructor de la clase. No recibe parámetros ni tiene valor de retorno.
     * Su función es construir un objeto.*/
	public Piloto(){
		nombrePiloto="";
	}
	
	/*El método getNombrePiloto no recibe parámetros y su función es mostrar el valor de
     * la variable nombrePiloto. El valor del retorno es String.*/
	public String getNombrePiloto() {
		return nombrePiloto;
	}
	
	/*El método setNombrePiloto recibe como parámetro "nombrePiloto" que es de tipo String y
	 * se refiere al nombre del piloto del avión. Este valor se asigna a la variable
	 * nombrePiloto. No tiene valor de retorno.*/
	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}
}