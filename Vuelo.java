/********************************************************************************************************************
 * Nombre del archivo: Vuelo.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: En esta clase se generan las características de un vuelo. 
 ********************************************************************************************************************/
package proyecto1;

//Se importa la clase Scanner para el ingreso de datos por teclado.
import java.util.Scanner;

public class Vuelo {
	
	//Se definen los atributos de la clase.
	private String destino;//Se refiere al destino del avion
	private double hora_salida;//Se refiere a la hora de despegue
	private double hora_llegada;//Se refiere a la hora de aterrizaje
	private int numero;//Se refiere al numero de vuelo
	private String tipo;//Se refiere a si es nacional o internacional
	private Avion avion;//Se crea un objeto de tipo Avion para generar un avion con determinados asientos
	private Piloto piloto;//Se crea un objeto de tipo Piloto para crear al piloto encargado del vuelo
	Scanner scanner = new Scanner(System.in);//Se crea un objeto de tipo Scanner para el ingreso de datos por teclado
	private String[] mozos=new String[1];//Se crea un arreglo para guardar los nombres de los aeromozos
	private String estatus;//Se refiere a si el avión se encuentra en tierra o volando
	private String motivo;//Se refiere al motivo de la cancelacion del vuelo
	
	
	/*Se define el constructor de la clase. No recibe parámetros ni tiene valor de retorno.
	 * Su función es crear un objeto.*/
	public Vuelo(){
		destino="";
		hora_salida=0.00;
		hora_llegada=0.00;
		numero = 0;
		tipo = "";
		setAvion(new Avion());
		setPiloto(new Piloto());
		mozos[0]="";
		estatus="";
	}
	
	/*El método asignarFechaSalida recibe como parámetros "dia" que es de tipo entero y "mes"
	 * que también es de tipo entero. Su función es crear la cadena de la fecha de despegue.
	 * Su valor de retorno es un String.*/
	public String asignarFechaSalida(int dia,int mes) {
		return dia+"/"+mes+"/11";
	}
	
	/*El método asignarFechaLlegada recibe como parámetros "dia" que es de tipo entero y "mes"
	 * que también es de tipo entero. Su función es crear la cadena de la fecha de aterrizaje.
	 * Su valor de retorno es un String.*/
	public String asignarFechaLlegada(int dia,int mes){
		return dia+"/"+mes+"/11";
	}
	
	/*El método getDestino no recibe parámetros y su función es mostrar el valor de
     * la variable destino. El valor del retorno es String.*/
	public String getDestino() {
		return destino;
	}
	
	/*El método setDestino recibe como parámetro "destino" que es de tipo String y
	 * se refiere al sitio donde aterrizará el avión. Este valor se
	 * asigna a la variable destino. No tiene valor de retorno.*/
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	/*El método getHora_salida no recibe parámetros y su función es mostrar el valor de
     * la variable hora_salida. El valor del retorno es double.*/
	public double getHora_salida() {
		return hora_salida;
	}
	
	/*El método setHora_salida recibe como parámetro "hora_salida" que es de tipo double y
	 * se refiere a la hora de despegue del avion. Este valor se
	 * asigna a la variable hora_salida. No tiene valor de retorno.*/
	public void setHora_salida(double hora_salida) {
		this.hora_salida = hora_salida;
	}
	
	/*El método getHora_llegada no recibe parámetros y su función es mostrar el valor de
     * la variable hora_llegada. El valor del retorno es double.*/
	public double getHora_llegada() {
		return hora_llegada;
	}
	
	/*El método setHora_llegada recibe como parámetro "hora_llegada" que es de double entero y
	 * se refiere a la hora de aterrizaje del avión. Este valor se
	 * asigna a la variable hora_llegada. No tiene valor de retorno.*/
	public void setHora_llegada(double hora_llegada) {
		this.hora_llegada = hora_llegada;
	}
	
	/*El método getNumero no recibe parámetros y su función es mostrar el valor de
     * la variable numero. El valor del retorno es entero.*/
	public int getNumero() {
		return numero;
	}
	
	/*El método setNumero recibe como parámetro "numero" que es de tipo entero y
	 * se refiere al numero de vuelo. Este valor se asigna a la variable numero.
	 * No tiene valor de retorno.*/
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/*El método getTipo no recibe parámetros y su función es mostrar el valor de
     * la variable tipo. El valor del retorno es String.*/
	public String getTipo() {
		return tipo;
	}
	
	/*El método setTipo recibe como parámetro "tipo" que es de tipo String y
	 * se refiere al tipo de vuelo, es decir, nacional o internacional. Este valor se
	 * asigna a la variable tipo. No tiene valor de retorno.*/
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/*El método getMozos no recibe parámetros y su función es mostrar el valor de
     * la variable mozos. El valor del retorno es un arreglo de String.*/
	public String[] getMozos() {
		return mozos;
	}

	/*El método asignarAvion no recibe parámetros y su función es asignar el avión que
	 * corresponde al tipo de vuelo. Dependiendo de la respuesta se le asignan los asientos,
	 * mandando a llamar al método asignarNacional o asignarNacional de la clase Avion.
	 * Su valor de retorno es Avion.*/
	public Avion asignarAvion(){
		if (tipo.equals("nacional"))
			getAvion().asignarNacional();
		else if(tipo.equals("internacional"))
			getAvion().asignarInternacional();
		return getAvion();
	}
	
	/*El método asignarPersonal no recibe parámetros y su función es asignar el personal
	 * a un vuelo. Se pide el nombre del piloto y los nombres de los aeromozos según la cantidad
	 * de aeromozos que se ingresen. No tiene valor de retorno.*/
	public void asignarPersonal(){
		System.out.println("Ingrese el primer nombre del piloto");
		String name = scanner.nextLine();
		getPiloto().setNombrePiloto(name);
		System.out.println("Ingrese la cantidad de aeromozos");
		int i=scanner.nextInt();
		mozos= new String[i];
		/*El ciclo for se utliza para controlar el ingreso del nombre del aeromozo según la cantidad
		 * de mozos ingresada por el usuario. Se controla por medio de un contajor j que se incrementa
		 * en 1 cada vez que repite el ciclo hasta alcanzar el valor ingresado por el usuario,
		 * llamado i. Cada nombre ingresado se guarda en el arreglo mozos.*/
		for(int j=0;j<i;j++){
			System.out.println("Ingrese el primer nombre del aeromozo");
			String nombre= scanner.next();
			mozos[j] = nombre;
		}
	}
	
	/*El método getPiloto no recibe parámetros y su función es mostrar el valor de
     * la variable piloto. El valor del retorno es Piloto.*/
	public Piloto getPiloto() {
		return piloto;
	}
	
	/*El método setPiloto recibe como parámetro "piloto" que es de tipo Piloto y
	 * se refiere al nombre del piloto. Este valor se asigna a la variable piloto.
	 * No tiene valor de retorno.*/
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	/*El método getEstatus no recibe parámetros y su función es mostrar el valor de
     * la variable estatus. El valor del retorno es String.*/
	public String getEstatus() {
		return estatus;
	}
	
	/*El método setEstatus recibe como parámetro "estatus" que es de tipo String y
	 * se refiere al estatus del vuelo, es decir, en tierra o volando. Este valor se
	 * asigna a la variable estatus. No tiene valor de retorno.*/
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	/*El método getMotivo no recibe parámetros y su función es mostrar el valor de
     * la variable motivo. El valor del retorno es String.*/
	public String getMotivo() {
		return motivo;
	}
	
	/*El método setMotivo recibe como parámetro "motivo" que es de tipo String y
	 * se refiere al motivo de la cancelacion del vuelo. Este valor se
	 * asigna a la variable motivo. No tiene valor de retorno.*/
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	/*El método getAvion no recibe parámetros y su función es mostrar el valor de
     * la variable avion. El valor del retorno es Avion.*/
	public Avion getAvion() {
		return avion;
	}
	
	/*El método setAvion recibe como parámetro "avion" que es de tipo Avion y
	 * se refiere al objeto avion. Este valor se asigna a la variable avion.
	 * No tiene valor de retorno.*/
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
}
