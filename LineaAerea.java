/********************************************************************************************************************
 * Nombre del archivo: LineaAerea.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: En esta clase se crea una nueva linea aerea con su respectivo vuelo. Además se le asigna un
 * administrador y se indica al aeropuerto al que pertenece
 ********************************************************************************************************************/
package proyecto1;

//Se importa la clase Scanner para el ingreso de datos por teclado.
import java.util.Scanner;

public class LineaAerea {
	
	//Se definen los atributos de la clase
	private String nombreLinea;//Se refiere al nombre de la linea aerea
	private Administrativo admin;//Se crea un objeto de tipo Administrativo para asignar el nombre del administrador de la linea
	private Vuelo vuelo;//Se crea un objeto de tipo Vuelo para generar un vuelo en la aerolinea
	private String aeropuerto;//Se refiere al nombre del aeropuerto al que pertenece la aerolinea
	private String salida;//Se refiere a la fecha de despegue
	private String llegada;//Se refiere a la fecha de aterrizaje
	Scanner scanner=new Scanner(System.in);//Se crea un objeto de tipo Scanner para el ingreso de datos por teclado
	
	/*Se define el constructor de la clase. No recibe parámetros ni tiene valor de retorno.
     * Su función es construir un objeto.*/
	public LineaAerea(){
		nombreLinea="";
		admin= new Administrativo();
		setVuelo(new Vuelo());
		aeropuerto="";
		salida="";
		llegada="";
	}
	
	/*El método getNombreLinea no recibe parámetros y su función es mostrar el valor de
     * la variable nombreLinea. El valor del retorno es String.*/
	public String getNombreLinea() {
		return nombreLinea;
	}
	
	/*El método setNombreLinea recibe como parámetro "nombreLinea" que es de tipo String y
	 * se refiere al nombre de la linea aerea. Este valor se
	 * asigna a la variable nombreLinea. No tiene valor de retorno.*/
	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}
	
	/*El método getAeropuerto no recibe parámetros y su función es mostrar el valor de
     * la variable aeropuerto. El valor del retorno es String.*/
	public String getAeropuerto() {
		return aeropuerto;
	}
	
	/*El método setAeropuerto recibe como parámetro "aeropuerto" que es de tipo String y
	 * se refiere al nombre del aeropuerto al que pertenece la aerolinea. Este valor se
	 * asigna a la variable aeropuerto. No tiene valor de retorno.*/
	public void setAeropuerto(String aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
	
	/*El método asignarAdministrador no recibe parámetros y su función es asignar el
	 * nombre del administrador de la linea aerea. No tiene valor de retorno*/
	public void asignarAdministrador(){
		System.out.println("Ingrese el primer nombre del administrador");
		String name=scanner.nextLine();
		admin.setNombreAdministrador(name);
	}
	
	/*El método asignarVuelo no recibe parámetros y su función es generar un vuelo, es decir,
	 * asignar todas las características para que se lleve a cabo un vuelo. No tiene valor
	 * retorno*/
	public void asignarVuelo(){
		System.out.println("Ingrese el numero de vuelo");
		getVuelo().setNumero(scanner.nextInt());
		System.out.println("Ingrese el tipo de vuelo (nacional/internacional)");
		getVuelo().setTipo(scanner.next());
		System.out.println("Ingrese el destino (una sola palabra)");
		getVuelo().setDestino(scanner.next());
		System.out.println("Ingrese el dia (fecha) de salida");
		int dia_salida=scanner.nextInt();
		System.out.println("Ingrese el numero de mes de salida");
		int mes_salida=scanner.nextInt();
		setSalida(getVuelo().asignarFechaSalida(dia_salida, mes_salida));
		System.out.println("Ingrese la hora de salida en formato 00.00 horas");
		getVuelo().setHora_salida(scanner.nextDouble());
		System.out.println("Ingrese el dia (fecha) de aterrizaje");
		int dia_llegada=scanner.nextInt();
		System.out.println("Ingrese el numero de mes de aterrizaje");
		int mes_llegada=scanner.nextInt();
		setLlegada(getVuelo().asignarFechaLlegada(dia_llegada, mes_llegada));
		System.out.println("Ingrese la hora de llegada en formato 00.00 horas");
		getVuelo().setHora_llegada(scanner.nextDouble());
		if(getSalida().equals(getLlegada())){
			/*El ciclo while se utiliza para controlar que los tiempos de despegue y aterrizaje
			 * sean coherentes, es decir, la hora y fecha de aterrizaje deben ser después de
			 * la hora y fecha de despegue. El ciclo termina cuando la hora de salida sea menor
			 * que la hora de llegada, ya que ambos tienen la misma fecha.*/
			while(getVuelo().getHora_llegada()<getVuelo().getHora_salida()){
				System.out.println("Tiempo de vuelo invalido");
				System.out.println("Ingrese la hora de salida en formato 00.00 horas");
				getVuelo().setHora_salida(scanner.nextDouble());
				System.out.println("Ingrese la hora de llegada en formato 00.00 horas");
				getVuelo().setHora_llegada(scanner.nextDouble());
			}
		}
		else
			if(mes_llegada==mes_salida){
				/*El ciclo while se utiliza para controlar que el día de salida sea menor que el de
				 * llegada, dado que los meses son iguales. El ciclo termina cuando el dia de salida
				 * sea menor que el de llegada.*/
				while(dia_salida>dia_llegada){
					System.out.println("El dia de llegada debe ser despues del de salida");
					System.out.println("Ingrese el dia (fecha) de salida");
					dia_salida=scanner.nextInt();
					System.out.println("Ingrese el dia (fecha) de aterrizaje");
					dia_llegada=scanner.nextInt();
					getVuelo().asignarFechaLlegada(dia_llegada, mes_llegada);
					getVuelo().asignarFechaSalida(dia_salida, mes_salida);
				}
			}
			else{ 
				if(mes_llegada<mes_salida){
					/*El ciclo while se utiliza para controlar que el mes de salida sea menor que el
					 * de llegada dado que son diferentes. El ciclo termina cuando el mes de salida 
					 * es menor que el de llegada.*/
					while(mes_salida>mes_llegada){
						System.out.println("El mes de salida debe ser mayor que el de llegada");
						System.out.println("Ingrese el numero de mes de salida");
						mes_salida=scanner.nextInt();
						System.out.println("Ingrese el numero de mes de aterrizaje");
						mes_llegada=scanner.nextInt();
						getVuelo().asignarFechaLlegada(dia_llegada, mes_llegada);
						getVuelo().asignarFechaSalida(dia_salida, mes_salida);
					}
				}
			}
		getVuelo().asignarAvion();
		getVuelo().asignarPersonal();
		System.out.println("Ingrese el estatus del vuelo (Tierra/Volando)");
		getVuelo().setEstatus(scanner.next());
	}
	
	/*El método getVuelo no recibe parámetros y su función es mostrar el valor de
     * la variable vuelo. El valor del retorno es Vuelo.*/
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	/*El método setVuelo recibe como parámetro "vuelo" que es de tipo Vuelo y
	 * se refiere al vuelo que realizará la aerolinea. Este valor se
	 * asigna a la variable vuelo. No tiene valor de retorno.*/
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	/*El método getSalida no recibe parámetros y su función es mostrar el valor de
     * la variable salida. El valor del retorno es String.*/
	public String getSalida() {
		return salida;
	}
	
	/*El método setSalida recibe como parámetro "salida" que es de tipo String y
	 * se refiere a la fecha de despegue. Este valor se asigna a la variable
	 * salida. No tiene valor de retorno.*/
	public void setSalida(String salida) {
		this.salida = salida;
	}
	
	/*El método getLlegada no recibe parámetros y su función es mostrar el valor de
     * la variable llegada. El valor del retorno es String.*/
	public String getLlegada() {
		return llegada;
	}
	
	/*El método setLlegada recibe como parámetro "llegada" que es de tipo String y
	 * se refiere a la fecha de aterrizaje. Este valor se asigna a la variable 
	 * llegada. No tiene valor de retorno.*/
	public void setLlegada(String llegada) {
		this.llegada = llegada;
	}
}
