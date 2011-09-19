/********************************************************************************************************************
 * Nombre del archivo: Pasajero.java
 * Autores: Douglas D�vila - Carn� 11042
 *          Mar�a Fernanda Mart�nez Rivera - Carn� 11176
 *          Pablo Recinos - Carn� 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripci�n: esta clase genera un nuevo pasajero, es decir, guarda el numero de vuelo
 * del pasajero
 ********************************************************************************************************************/
package proyecto1;

public class Pasajero {
	
	//Se definen los atributos de la clase
    private int numeroVuelo;
    
    /*Se define el constructor de la clase. No recibe par�metros ni tiene valor de retorno.
	 * Su funci�n es crear un objeto.*/
    public Pasajero(){
    	numeroVuelo=0;
    }
    
    /*El m�todo getNumeroVuelo no recibe par�metros y su funci�n es mostrar el valor de
     * la variable numeroVuelo. El valor del retorno es int.*/
	public int getNumeroVuelo() {
		return numeroVuelo;
	}
	
	/*El m�todo setNumeroVuelo recibe como par�metro "numeroVuelo" que es de tipo int y
	 * se refiere numero de vuelo que el pasajero desea. Este valor se
	 * asigna a la variable numeroVuelo. No tiene valor de retorno.*/
	public void setNumeroVuelo(int numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

}
