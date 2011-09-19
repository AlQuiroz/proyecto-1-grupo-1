/********************************************************************************************************************
 * Nombre del archivo: Dato.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: esta clase contiene los datos precargados del aeropuerto. Además, puede
 * guardar los nuevos datos ingresados por el usuario
 ********************************************************************************************************************/
package proyecto1;

//Se importa la clase Scanner para el ingreso de datos por teclado.
import java.util.Scanner;

public class Dato {
	
	//Se definen los atributos de la clase, los vuelos de tipo Vuelo
	Vuelo vuelo1= new Vuelo();
	Vuelo vuelo2= new Vuelo();
	Vuelo vuelo3= new Vuelo();
	Scanner s= new Scanner(System.in);//Se crea el objeto de tipo Scanner para el ingreso de datos
	
	/*Se define el constructor de la clase. No recibe parámetros ni tiene valor de retorno.
	 * Su función es crear un objeto.*/
	public Dato()
	{
		vuelo1.setNumero(402);
		vuelo2.setNumero(573);
		vuelo3.setNumero(2128);
		vuelo1.setEstatus("En tierra");
		vuelo2.setEstatus("En tierra");
		vuelo3.setEstatus("En tierra");
		vuelo1.getAvion().getCantidadAsientos().setAsiento_ejecutivo(150);
		vuelo1.getAvion().getCantidadAsientos().setAsiento_primera(50);
		vuelo1.getAvion().getCantidadAsientos().setAsiento_turista(300);
		vuelo2.getAvion().getCantidadAsientos().setAsiento_ejecutivo(195);
		vuelo2.getAvion().getCantidadAsientos().setAsiento_primera(80);
		vuelo2.getAvion().getCantidadAsientos().setAsiento_turista(475);
		vuelo3.getAvion().getCantidadAsientos().setAsiento_ejecutivo(200);
		vuelo3.getAvion().getCantidadAsientos().setAsiento_primera(100);
		vuelo3.getAvion().getCantidadAsientos().setAsiento_turista(500);
	}
	
	/*El método verInfo recibe varios parámetros. El parámetro aeropuerto es de tipo Aeropuerto
	 * y se refiere al objeto aeropuerto; el parámetro linea es de tipo LineaAerea y se refiere
	 * a un objeto de linea aerea; el parámetro vuelo es de tipo Vuelo y se refiere al objeto
	 * vuelo; el parámetro num es de tipo entero y se refiere al numero de vuelo ingresado por
	 * el pasajero; el parámetro salida es de tipo String y se refiere a la fecha de despegue;
	 * el parámetro llegada es de tipo String y se refiere a la fecha de aterrizaje.*/
	public void verInfo(Aeropuerto aeropuerto, LineaAerea linea,Vuelo vuelo,int num,String salida,String llegada){
		//Se despliegan las opciones a llevar a cabo por el método
		System.out.println("1. Aeropuertos registrados");
		System.out.println("2. Aerolineas registradas por aeropuerto");
		System.out.println("3. Personal registrado por aeropuerto y linea aerea");
		System.out.println("4. Vuelos registrados y estatus");
		System.out.println("5. Cancelaciones de vuelos");
		System.out.println("6. Tripulacion de vuelo segun numero de vuelo");
		System.out.println("7. Pasajeros de un vuelo por tipo de asiento");
		int r=s.nextInt();
		//Si la respuesta del usuario es 1, se le muestra los nombres de los aeropuertos
		if(r==1){
			System.out.println("Los aeropuertos disponibles son:\n"+linea.getAeropuerto()+"\n"+aeropuerto.getAeropuerto()+"\nAeropuerto Internacional La Aurora\nAeropuerto Internacional Mundo Maya");
		}
		//Si la respuesta del usuario es 2, se le muestra las lineas aereas por aeropuerto
		else if(r==2){
			System.out.println("Aeropuerto             Lineas Aereas");
			System.out.println("La Aurora              TACA");
			System.out.println("                       Iberia");
			System.out.println("                       American Airlines");
			System.out.println("Mundo Maya             Tropic Air");
			System.out.println("                       Transportes Aereos Guatemaltecos");
			System.out.println(aeropuerto.getAeropuerto()+"               "+aeropuerto.getLinea().getNombreLinea());
			System.out.println(linea.getAeropuerto()+"               "+linea.getNombreLinea());
		}
		//Si la respuesta del usuario es 3, se le muestra el personal de una aerolinea y el aeropuerto al que pertenece
		else if(r==3){
			System.out.println("Aerolinea      Aeropuerto   Piloto              Aeromozos");
			System.out.println("TACA           La Aurora    Roberto Perdomo     Andrea Aguirre");
			System.out.println("                                                Irene Gomez");
			System.out.println("                                                Carlos Marroquin");
			System.out.println("                                                Mariano Sandoval");
			System.out.println("Iberia         La Aurora    Juan Asturias       Fernando Alvarez");
			System.out.println("                                                Fatima Ordoñez");
			System.out.println("                                                Maria Valdez");
			System.out.println("American       La Aurora    Rafael Gutierrez    Jose Lopez");
			System.out.println("Airlines                                        Brittany Luna");
			System.out.println("                                                John Ramirez");
			System.out.println("                                                Luisa Santiago");
			System.out.println("Tropic Air     Mundo Maya   Pedro Lucas         Hugo de Leon");
			System.out.println("                                                Max Travis");
			System.out.println("Transportes    Mundo Maya   Francisco Mendez    Natalia Paz");
			System.out.println("Aereos                                          Laura Alonzo");
			System.out.println("Guatemaltecos");
			System.out.println(aeropuerto.getLinea().getNombreLinea()+"    "+aeropuerto.getAeropuerto()+"    "+aeropuerto.getLinea().getVuelo().getPiloto().getNombrePiloto()+"    "+aeropuerto.getLinea().getVuelo().getMozos()[0]);
			/*El ciclo for se utiliza para controlar la puesta en pantalla de los mozos, ya que estos
			 * están dentro de un arreglo. En ambos casos, se controla con un contador i, que se incrementa
			 * en 1 cada vez que se repite el ciclo hasta alcanzar el valor de la longitud del arreglo.*/
			for(int i=1;i<aeropuerto.getLinea().getVuelo().getMozos().length;i++)
				System.out.println("                                                "+aeropuerto.getLinea().getVuelo().getMozos()[i]);
			System.out.println(linea.getAeropuerto()+"    "+linea.getNombreLinea()+"    "+linea.getVuelo().getPiloto().getNombrePiloto()+"    "+linea.getVuelo().getMozos()[0]);
			for(int i=1;i<linea.getVuelo().getMozos().length;i++)
				System.out.println("                                                "+linea.getVuelo().getMozos()[i]);
		}
		//Si la respuesta del usuario es 4, se le muestran los datos del vuelo
		else if(r==4){
			System.out.println("Numero  Fecha/Hora salida   Fecha/Hora llegada   Destino      Status");
			System.out.println("402     23/09/11 09.00      23/09/11 09.45       Belice	      "+vuelo1.getEstatus());
			System.out.println("573     23/09/11 13.00      24/09/11 14.50       Barcelona    "+vuelo2.getEstatus());
			System.out.println("2128    24/09/11 08.20      24/09/11 12.45       Miami        "+vuelo3.getEstatus());
			System.out.println(aeropuerto.getLinea().getVuelo().getNumero()+"     "+aeropuerto.getLinea().getSalida()+" "+aeropuerto.getLinea().getVuelo().getHora_salida()+"        "+aeropuerto.getLinea().getLlegada()+" "+aeropuerto.getLinea().getVuelo().getHora_llegada()+"       "+aeropuerto.getLinea().getVuelo().getDestino()+"    "+aeropuerto.getLinea().getVuelo().getEstatus());
			System.out.println(linea.getVuelo().getNumero()+"     "+linea.getSalida()+" "+linea.getVuelo().getHora_salida()+"        "+linea.getLlegada()+" "+linea.getVuelo().getHora_llegada()+"       "+linea.getVuelo().getDestino()+"    "+linea.getVuelo().getEstatus());
			System.out.println(vuelo.getNumero()+"     "+salida+" "+vuelo.getHora_salida()+"        "+llegada+" "+vuelo.getHora_llegada()+"       "+vuelo.getDestino()+"    "+vuelo.getEstatus());
		}
		/*Si la respuesta del usuario es 5, se le muestran los vuelos cancelados. Para
		 * ello, compara el estatus de los vuelos existentes, y si es igual a cancelado
		 * entonces se imprime.*/
		else if(r==5){
			System.out.println("\n\nVuelos cancelados\n");
			System.out.println("Numero   Destino   Razon");
			System.out.println("928      Bogota    Clima");
			if(vuelo1.getEstatus().equals("Cancelado")){
				System.out.println("402      Belice    "+vuelo1.getMotivo());
			}
			if(vuelo2.getEstatus().equals("Cancelado")){
				System.out.println("573      Barcelona "+vuelo2.getMotivo());
			}
			if(vuelo3.getEstatus().equals("Cancelado")){
				System.out.println("2128     Miami     "+vuelo3.getMotivo());
			}
			if(aeropuerto.getLinea().getVuelo().getEstatus().equals("Cancelado")){
				System.out.println(aeropuerto.getLinea().getVuelo().getNumero()+"     "+aeropuerto.getLinea().getVuelo().getDestino()+"    "+aeropuerto.getLinea().getVuelo().getMotivo());
			}
			if(linea.getVuelo().getEstatus().equals("Cancelado")){
				System.out.println(linea.getVuelo().getNumero()+"     "+linea.getVuelo().getDestino()+"    "+linea.getVuelo().getMotivo());
			}
			if(vuelo.getEstatus().equals("Cancelado")){
				System.out.println(vuelo.getNumero()+"     "+vuelo.getDestino()+"    "+vuelo.getMotivo());
			}
		}
		//Si la respuesta del usuario es 6, se le muestra el personal de un vuelo, según el número que el usuario ingrese
		else if(r==6){
			System.out.println("Ingrese el numero de vuelo");
			int a=s.nextInt();
			if (a==vuelo1.getNumero()){
				System.out.println("Piloto            Aeromozos");
				System.out.println("Pedro Lucas       Hugo de Leon");
				System.out.println("                  Max Travis");
			}
			else if(a==vuelo2.getNumero()){
				System.out.println("Piloto            Aeromozos");
				System.out.println("Roberto Perdomo   Andrea Aguirre");
				System.out.println("                  Irene Gomez");
				System.out.println("                  Carlos Marroquin");
				System.out.println("                  Mariano Sandoval");
			}
			else if(a==vuelo3.getNumero()){
				System.out.println("Piloto            Aeromozos");
				System.out.println("Rafael Gutierrez  Jose Lopez");
				System.out.println("                  Brittany Luna");
				System.out.println("                  John Ramirez");
				System.out.println("                  Luisa Santiago");
			}
			else if(a==aeropuerto.getLinea().getVuelo().getNumero()){
				System.out.println("Piloto            Aeromozos");
				System.out.println(aeropuerto.getLinea().getVuelo().getPiloto().getNombrePiloto()+"            "+aeropuerto.getLinea().getVuelo().getMozos()[0]);
				for(int i=1;i<aeropuerto.getLinea().getVuelo().getMozos().length;i++)
					System.out.println("                  "+aeropuerto.getLinea().getVuelo().getMozos()[i]);
			}
			else if(a==linea.getVuelo().getNumero()){
				System.out.println("Piloto            Aeromozos");
				System.out.println(linea.getVuelo().getPiloto().getNombrePiloto()+"            "+linea.getVuelo().getMozos()[0]);
				for(int i=1;i<linea.getVuelo().getMozos().length;i++)
					System.out.println("                  "+linea.getVuelo().getMozos()[i]);
			}
			else if(a==vuelo.getNumero()){
				System.out.println("Piloto            Aeromozos");
				System.out.println(vuelo.getPiloto().getNombrePiloto()+"            "+vuelo.getMozos()[0]);
				for(int i=1;i<vuelo.getMozos().length;i++)
					System.out.println("                  "+vuelo.getMozos()[i]);
			}
			else
				System.out.println("El numero de vuelo no existe");
		}
		//Si la respuesta del usuario es 7, se le muestra la cantidad de asientos ocupados de cada clase del numero de vuelo ingresado.
		else if(r==7){
			System.out.println("Ingrese el numero de vuelo");
			int a=s.nextInt();
			if (a==vuelo1.getNumero()){
				System.out.println("Asiento           Cantidad de pasajeros");
				System.out.println("Primera clase     "+vuelo1.getAvion().getCantidadAsientos().getAsiento_primera());
				System.out.println("Clase ejecutiva   "+vuelo1.getAvion().getCantidadAsientos().getAsiento_ejecutivo());
				System.out.println("Clase turista     "+vuelo1.getAvion().getCantidadAsientos().getAsiento_turista());
			}
			else if(a==vuelo2.getNumero()){
				System.out.println("Asiento           Cantidad de pasajeros");
				System.out.println("Primera clase     "+vuelo2.getAvion().getCantidadAsientos().getAsiento_primera());
				System.out.println("Clase ejecutiva   "+vuelo2.getAvion().getCantidadAsientos().getAsiento_ejecutivo());
				System.out.println("Clase turista     "+vuelo2.getAvion().getCantidadAsientos().getAsiento_turista());
			}
			else if(a==vuelo3.getNumero()){
				System.out.println("Asiento           Cantidad de pasajeros");
				System.out.println("Primera clase     "+vuelo3.getAvion().getCantidadAsientos().getAsiento_primera());
				System.out.println("Clase ejecutiva   "+vuelo3.getAvion().getCantidadAsientos().getAsiento_ejecutivo());
				System.out.println("Clase turista     "+vuelo3.getAvion().getCantidadAsientos().getAsiento_turista());
			}
			else if(a==aeropuerto.getLinea().getVuelo().getNumero()){
				System.out.println("Asiento           Cantidad de pasajeros");
				System.out.println("Primera clase     "+aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_primera());
				System.out.println("Clase ejecutiva   "+aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_ejecutivo());
				System.out.println("Clase turista     "+aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_turista());
			}
			else if(a==linea.getVuelo().getNumero()){
				System.out.println("Asiento           Cantidad de pasajeros");
				System.out.println("Primera clase     "+linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_primera());
				System.out.println("Clase ejecutiva   "+linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_ejecutivo());
				System.out.println("Clase turista     "+linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_turista());
			}
			else if(a==vuelo.getNumero()){
				System.out.println("Asiento           Cantidad de pasajeros");
				System.out.println("Primera clase     "+vuelo.getAvion().getCantidadAsientos().getAsiento_primera());
				System.out.println("Clase ejecutiva   "+vuelo.getAvion().getCantidadAsientos().getAsiento_ejecutivo());
				System.out.println("Clase turista     "+vuelo.getAvion().getCantidadAsientos().getAsiento_turista());
			}
			else
				System.out.println("El numero de vuelo no existe");
		}
	}
}