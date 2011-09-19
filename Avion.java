/********************************************************************************************************************
 * Nombre del archivo: Avion.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: En esta clase se asigna la cantidad de asientos a un avión dependiendo si este realiza
 * vuelos nacionales o internacionales.
 ********************************************************************************************************************/
package proyecto1;

//Se importa la clase Scanner para el ingreso de datos por teclado.
import java.util.Scanner;

public class Avion {
	
	//Se definen los atributos de la clase.
	private Asiento cantidadAsientos;//Crea un objeto de tipo Asiento para definir la cantidad de asientos.
	Scanner s=new Scanner(System.in);//Crea un objeto de tipo Scanner para el ingreso de datos por teclado.
	
	/*Se define el constructor de la clase. No recibe parámetros ni tiene valor de retorno.
	 * Su función es crear un objeto.*/
	public Avion(){
		setCantidadAsientos(new Asiento()); 
	}
	
	/*El método asignarInternacional no recibe parámetros y su función es asignar la cantidad
	 * de asientos para un avión con destino internacional. Su valor de retorno es de tipo 
	 * Asiento.*/
	public Asiento asignarInternacional(){
		System.out.println("Ingrese la cantidad de pasajeros en la clase ejecutiva (menos de 200)");
		getCantidadAsientos().setAsiento_ejecutivo(s.nextInt());
		/*El ciclo while se utiliza para controlar que no se pase del límite de asientos en
		 * la clase ejecutiva. Para ello compara el valor ingresado por el usuario guardado
		 * en asiento_ejeccutivo de la variable cantidadAsientos con el máximo de asientos
		 * que es 200. Para salir del ciclo, el dato ingresado por el usuario debe ser menor
		 * que 200.*/
		while(getCantidadAsientos().getAsiento_ejecutivo()>200){
			System.out.println("Ingrese la cantidad de pasajeros en la clase ejecutiva (menos de 200)");
			getCantidadAsientos().setAsiento_ejecutivo(s.nextInt());
		}
		System.out.println("Ingrese la cantidad de pasajeros en primera clase (menos de 100)");
		getCantidadAsientos().setAsiento_primera(s.nextInt());
		/*El ciclo while se utiliza para controlar que no se pase del límite de asientos en
		 * la primera clase. Para ello compara el valor ingresado por el usuario guardado
		 * en asiento_primera de la variable cantidadAsientos con el máximo de asientos
		 * que es 100. Para salir del ciclo, el dato ingresado por el usuario debe ser menor
		 * que 100.*/
		while(getCantidadAsientos().getAsiento_primera()>100){
			System.out.println("Ingrese la cantidad de pasajeros en primera clase (menos de 100)");
			getCantidadAsientos().setAsiento_primera(s.nextInt());
		}
		System.out.println("Ingrese la cantidad de pasajeros en la clase turista (menos de 500)");
		getCantidadAsientos().setAsiento_turista(s.nextInt());
		/*El ciclo while se utiliza para controlar que no se pase del límite de asientos en
		 * la clase turista. Para ello compara el valor ingresado por el usuario guardado
		 * en asiento_turista de la variable cantidadAsientos con el máximo de asientos
		 * que es 500. Para salir del ciclo, el dato ingresado por el usuario debe ser menor
		 * que 500.*/
		while(getCantidadAsientos().getAsiento_turista()>500){
			System.out.println("Ingrese la cantidad de pasajeros en la clase turista (menos de 500)");
			getCantidadAsientos().setAsiento_turista(s.nextInt());
		}
		return getCantidadAsientos();
	}
	
	/*El método asignarNacional no recibe parámetros y su función es asignar la cantidad
	 * de asientos para un avión con destino regional. Su valor de retorno es de tipo 
	 * Asiento.*/
	public Asiento asignarNacional(){
		System.out.println("Ingrese la cantidad de pasajeros en la clase ejecutiva (menos de 150)");
		getCantidadAsientos().setAsiento_ejecutivo(s.nextInt());
		/*El ciclo while se utiliza para controlar que no se pase del límite de asientos en
		 * la clase ejecutiva. Para ello compara el valor ingresado por el usuario guardado
		 * en asiento_ejeccutivo de la variable cantidadAsientos con el máximo de asientos
		 * que es 150. Para salir del ciclo, el dato ingresado por el usuario debe ser menor
		 * que 150.*/
		while(getCantidadAsientos().getAsiento_ejecutivo()>150){
			System.out.println("Ingrese la cantidad de pasajeros en la clase ejecutiva (menos de 150)");
			getCantidadAsientos().setAsiento_ejecutivo(s.nextInt());
		}
		System.out.println("Ingrese la cantidad de pasajeros en la primera clase (menos de 50)");
		getCantidadAsientos().setAsiento_primera(s.nextInt());
		/*El ciclo while se utiliza para controlar que no se pase del límite de asientos en
		 * la primera clase. Para ello compara el valor ingresado por el usuario guardado
		 * en asiento_primera de la variable cantidadAsientos con el máximo de asientos
		 * que es 50. Para salir del ciclo, el dato ingresado por el usuario debe ser menor
		 * que 50.*/
		while(getCantidadAsientos().getAsiento_primera()>50){
			System.out.println("Ingrese la cantidad de pasajeros en la primera clase (menos de 50)");
			getCantidadAsientos().setAsiento_primera(s.nextInt());
		}
		System.out.println("Ingrese la cantidad de pasajeros en la clase turista (menos de 300)");
		getCantidadAsientos().setAsiento_turista(s.nextInt());
		/*El ciclo while se utiliza para controlar que no se pase del límite de asientos en
		 * la clase turista. Para ello compara el valor ingresado por el usuario guardado
		 * en asiento_turista de la variable cantidadAsientos con el máximo de asientos
		 * que es 300. Para salir del ciclo, el dato ingresado por el usuario debe ser menor
		 * que 300.*/
		while(getCantidadAsientos().getAsiento_turista()>300){
			System.out.println("Ingrese la cantidad de pasajeros en la clase turista (menos de 300)");
			getCantidadAsientos().setAsiento_turista(s.nextInt());
		}
		return getCantidadAsientos();
	}

	/*El método getCantidadAsientos no recibe parámetros y su función es mostrar el valor de
     * la variable cantidadAsientos. El valor del retorno es Asiento.*/
	public Asiento getCantidadAsientos() {
		return cantidadAsientos;
	}

	/*El método setCantidadAsientos recibe como parámetro "cantidadAsientos" que es de tipo 
	 * Asiento y se refiere a la cantidad de asientos que hay en el avión por cada clase. 
	 * Este valor se asigna a la variable cantidadAsientos. No tiene valor de retorno.*/
	public void setCantidadAsientos(Asiento cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}
}
