/********************************************************************************************************************
 * Nombre del archivo: Asiento.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: En esta clase se crean las variables que contendrán la cantidad de asientos
 * en cada clase de un avión.
 ********************************************************************************************************************/
package proyecto1;

public class Asiento {
	
	//Se definen los atributos de la clase
    private int asiento_primera;//Se refiere a la cantidad de asientos de primera clase
    private int asiento_ejecutivo;//Se refiere a la cantidad de asientos de la clase ejecutiva
    private int asiento_turista;//Se refiere a la cantidad de asientos de la clase turista
    
    /*Se define el constructor de la clase. No recibe parámetros ni tiene valor de retorno.
     * Su función es construir un objeto.*/
    public Asiento()
    {
    	asiento_primera=0;
    	asiento_ejecutivo=0;
    	asiento_turista=0;
    }
    
    /*El método getAsiento_primera no recibe parámetros y su función es mostrar el valor de
     * la variable asiento_primera. El valor del retorno es entero.*/
	public int getAsiento_primera() {
		return asiento_primera;
	}

	/*El método setAsiento_primera recibe como parámetro "cantidad" que es de tipo entero y
	 * se refiere a la cantidad de asientos que hay en la primera clase. Este valor se
	 * asigna a la variable asiento_primera. No tiene valor de retorno.*/
	public void setAsiento_primera(int cantidad) {
		this.asiento_primera = cantidad;
	}

	/*El método getAsiento_ejecutivo no recibe parámetros y su función es mostrar el valor de
     * la variable asiento_ejecutivo. El valor del retorno es entero.*/
	public int getAsiento_ejecutivo() {
		return asiento_ejecutivo;
	}

	/*El método setAsiento_ejecutivo recibe como parámetro "cantidad" que es de tipo entero y
	 * se refiere a la cantidad de asientos que hay en la clase ejecutiva. Este valor se
	 * asigna a la variable asiento_ejecutivo. No tiene valor de retorno.*/
	public void setAsiento_ejecutivo(int cantidad) {
		this.asiento_ejecutivo = cantidad;
	}

	/*El método getAsiento_turista no recibe parámetros y su función es mostrar el valor de
     * la variable asiento_turista. El valor del retorno es entero.*/
	public int getAsiento_turista() {
		return asiento_turista;
	}

	/*El método setAsiento_turista recibe como parámetro "cantidad" que es de tipo entero y
	 * se refiere a la cantidad de asientos que hay en la clase turista. Este valor se
	 * asigna a la variable asiento_turista. No tiene valor de retorno.*/
	public void setAsiento_turista(int cantidad) {
		this.asiento_turista = cantidad;
	}
}
