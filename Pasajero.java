/********************************************************************************************************************
 * Nombre del archivo: Pasajero.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: esta clase genera un nuevo pasajero, es decir, guarda el numero de vuelo
 * del pasajero
 ********************************************************************************************************************/
package proyecto1;

public class Pasajero {
	
	//Se definen los atributos de la clase
    private int numeroVuelo;
    
    /*Se define el constructor de la clase. No recibe parámetros ni tiene valor de retorno.
	 * Su función es crear un objeto.*/
    public Pasajero(){
    	numeroVuelo=0;
    }
    
    /*El método getNumeroVuelo no recibe parámetros y su función es mostrar el valor de
     * la variable numeroVuelo. El valor del retorno es int.*/
	public int getNumeroVuelo() {
		return numeroVuelo;
	}
	
	/*El método setNumeroVuelo recibe como parámetro "numeroVuelo" que es de tipo int y
	 * se refiere numero de vuelo que el pasajero desea. Este valor se
	 * asigna a la variable numeroVuelo. No tiene valor de retorno.*/
	public void setNumeroVuelo(int numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

}
