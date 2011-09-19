/********************************************************************************************************************
 * Nombre del archivo: BaseDato.java
 * Autores: Douglas Dávila - Carné 11042
 *          María Fernanda Martínez Rivera - Carné 11176
 *          Pablo Recinos - Carné 11052
 * Fecha de entrega: 20 de septiembre de 2011
 * Descripción: esta clase contiene el método principal para que se ejecute el menú de las
 * opciones a llevar a cabo en un aeropuerto. En esta, el usuario puede ver la información
 * disponible (de la clase Dato), ingresar nueva información (que manda a llamar a la clase
 * Aeropuerto, Linea y Vuelo), cancelar un vuelo y comprar un boleto (utiliza la clase
 * Pasajero y la clase Dato).
 ********************************************************************************************************************/
package proyecto1;

//Se importa la clase Scanner para el ingreso de datos por teclado.
import java.util.Scanner;

public class BaseDatos {
	
	/*Se define el método principal para que se ejecute el programa. Su parámetro es un 
	 * arreglo de String y no hay valor de retorno.*/
	public static void main(String[] args){
		
		//Se crean los objetos de la clase
		Dato datos= new Dato();//Se crea un objeto de tipo Dato para obtener los datos precargados
		LineaAerea linea = new LineaAerea();//Se crea un objeto de tipo LineaAerea para crear una nueva aerolinea
		Vuelo vuelo = new Vuelo();//Se crea un objeto de tipo Vuelo para generar un nuevo vuelo
		Aeropuerto aeropuerto = new Aeropuerto();//Se crea un objeto de tipo Aeropuerto para crear un nuevo aeropuerto
		Pasajero pasajero=new Pasajero();//Se crea un objeto de tipo Pasajero para la compra de boleto
		Scanner scanner=new Scanner(System.in);//Se crea un objeto de tipo Scanner para el ingreso de datos por teclado
		int[]numeroAsiento=new int[1];//Se crea un arreglo de tipo entero para guardar los número de asiento
		String[] nombre=new String[1];//Se crea un arreglo de tipo String para guardar los nombres de los pasajeros
		String[] apellido= new String[1];//Se crea un arreglo de tipo String para guardar los apellidos de los pasajeros
		int c=0;//Se refiere a la cantidad de pasajeros que comprarán boleto
		int opcion = 1;//Se refiere a la opción del menú
		int respuesta = 0;//Se refiere a la respuesta de la opción de ingreso de datos 
		String salida="";//Se refiere a la fecha de despegue
		String llegada="";//Se refiere a la fecha de aterrizaje
		int num=0;//Se refiere al numero de vuelo ingresado por el usuario

		//Se da la bienbenida al usuario y se le explica el funcionamiento del programa
		System.out.println("Bienvenido");
		System.out.println("En el siguiente programa se simula una base de datos de un aeropuerto");
		System.out.println("En el puede ver la informacion disponible de los aeropuertos existentes,");
		System.out.println("de las aerolineas y su personal, de los vuelos disponibles y su estatus, etc.");
		System.out.println("Ademas, puede ingresar un nuevo aeropuerto, una nueva aerolinea, o un nuevo vuelo.");
		System.out.println("Tambien se puede cancelar un vuelo que aun no haya despegado, y se pueden comprar");
		System.out.println("boletos para un vuelo ya existente. En tal caso, se verifican que hayan suficientes");
		System.out.println("asientos disponibles de la clase ingresada");
		System.out.println("Cuando se le den las opciones disponibles numeradas, ingrese el numero de la opcion");
		System.out.println("que desea llevar a cabo; cuando se le den las opciones escritras, ingrese una de las");
		System.out.println("opciones; si solo se le pide el ingreso de datos, ingrese unicamente lo que se le solicita.");
		System.out.println("Que desea hacer?");
		
		/*El ciclo do-while se utiliza para que se repita el menú de las opciones que se pueden
		 * llevar a cabo en el programa. Se repite hasta que el usuario ingrese el dato (5) de
		 * salida del menú.*/
		do{
			//Se muestran las opciones disponibles
			System.out.println("1. Ver informacion disponible");
			System.out.println("2. Registrar nueva informacion");
			System.out.println("3. Cancelar vuelo");
			System.out.println("4. Comprar boleto");
			System.out.println("5. Salir");
			opcion = scanner.nextInt();
			/*Si la respuesta del usuario es 1, se le pregunta que es lo que desea ver y se
			 * manda a llamar el método de verInfo de la clase Dato, que es donde está toda
			 * la información precargada y donde se guardará la nueva.*/
			if (opcion==1){
				System.out.println("Que desea ver?");
				datos.verInfo(aeropuerto,linea,vuelo,num,salida,llegada);
			}
			/*Si la respuesta del usuario es 2, se le pregunta cual es la información que 
			 * desea ingresar, que puede ser un nuevo aeropuerto, una nueva aerolinea y 
			 * un nuevo vuelo. En todos los casos, debera ingresar todo lo relacionado
			 * con un nuevo vuelo y la información del personal.*/
			else if(opcion==2){
				//Se muestran las opciones que se pueden llevar a cabo
				System.out.println("Que desea ingresar?");
				System.out.println("1. Aeropuerto (debe ingresar toda la informacion que circula en un aeropuerto)");
				System.out.println("2. Aerolinea (debe ingresar toda la informacion que requiere la aerolinea)");
				System.out.println("3. Vuelo (debe ingresar toda la informacion necesaria para generar un vuelo)");
				respuesta = scanner.nextInt();
				/*Si la respuesta del usuario es 1 en la opcion 2, se le solicita al usuario
				 * que ingrese el nombre del aeropuerto y luego manda a llamar los métodos
				 * de la clase Aeropuerto para crear el nuevo aeropuerto.*/
				if (respuesta==1){
					System.out.println("Ingrese el nombre del aeropuerto (en una palabra)");
					aeropuerto.setAeropuerto(scanner.next());
					aeropuerto.asignarLinea();
				}
				/*Si la respuesta del usuario es 2 en la opcion 2, se le solicita al usuario
				 * que ingrese el nombre de la aerolinea y el aeropuerto al que pertenece,
				 * y luego manda a llamar los metodos de la clase LineaAerea para crear
				 * la nueva linea aerea.*/
				else if (respuesta==2){
					System.out.println("Ingrese el nombre de la aerolinea (en una palabra)");
					linea.setNombreLinea(scanner.next());
					System.out.println("Ingrese el aeropuerto al que pertenece (una palabra)");
					linea.setAeropuerto(scanner.next());
					linea.asignarAdministrador();
					linea.asignarVuelo();
				}
				/*Si la respuesta del usuario es 3 en la opcion 2, se le solicita al usuario
				 * que ingrese toda la información necesaria para generar un nuevo vuelo.
				 * Para ello también se manda a llamar los métodos de la clase Vuelo.*/
				else if(respuesta==3){
					System.out.println("Ingrese el destino (en una palabra)");
					vuelo.setDestino(scanner.next());
					System.out.println("Ingrese el dia (fecha) de salida");
					int dia_salida=scanner.nextInt();
					System.out.println("Ingrese el numero de mes de salida");
					int mes_salida=scanner.nextInt();
					salida=vuelo.asignarFechaSalida(dia_salida, mes_salida);
					System.out.println("Ingrese la hora de salida en formato 00.00 horas");
					vuelo.setHora_salida(scanner.nextDouble());
					System.out.println("Ingrese el dia (fecha) de aterrizaje");
					int dia_llegada=scanner.nextInt();
					System.out.println("Ingrese el numero de mes de aterrizaje");
					int mes_llegada=scanner.nextInt();
					llegada=vuelo.asignarFechaLlegada(dia_llegada, mes_llegada);
					System.out.println("Ingrese la hora de llegada en formato 00.00 horas");
					vuelo.setHora_llegada(scanner.nextDouble());
					if(salida.equals(llegada)){
						/*El ciclo while se utiliza para controlar que los tiempos de despegue y aterrizaje
						 * sean coherentes, es decir, la hora y fecha de aterrizaje deben ser después de
						 * la hora y fecha de despegue. El ciclo termina cuando la hora de salida sea menor
						 * que la hora de llegada, ya que ambos tienen la misma fecha.*/
						while(vuelo.getHora_llegada()<vuelo.getHora_salida()){
							System.out.println("Tiempo de vuelo invalido");
							System.out.println("Ingrese la hora de salida en formato 00.00 horas");
							vuelo.setHora_salida(scanner.nextDouble());
							System.out.println("Ingrese la hora de llegada en formato 00.00 horas");
							vuelo.setHora_llegada(scanner.nextDouble());
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
								vuelo.asignarFechaLlegada(dia_llegada, mes_llegada);
								vuelo.asignarFechaSalida(dia_salida, mes_salida);
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
									vuelo.asignarFechaLlegada(dia_llegada, mes_llegada);
									vuelo.asignarFechaSalida(dia_salida, mes_salida);
								}
							}
						}
					System.out.println("Ingrese el numero de vuelo");
					vuelo.setNumero(scanner.nextInt());
					System.out.println("Ingrese el tipo de vuelo (nacional/internacional)");
					vuelo.setTipo(scanner.next());
					System.out.println("Ingrese el estatus del vuelo (Tierra/Volando)");
					vuelo.setEstatus(scanner.next());
					vuelo.asignarAvion();
					vuelo.asignarPersonal();
				}
				//Si la opcion ingresada no es valida, se manda mensaje de error.
				else
					System.out.println("Opcion no valida");
			}
			/*Si la respuesta del usuario es 3, se le solicita que ingrese el numero de vuelo
			 * que desea cancelar. Se compara el dato ingresado con los numeros de vuelo precargados
			 * y con el numero de vuelo, si se ha ingresado, que ha sido guardado. Si el vuelo
			 * existe, se verifica su estatus. Si el avion ha despegado, el vuelo no puede
			 * cancelarse. Tampoco se puede si no existe.*/
			else if(opcion==3){
				System.out.println("Ingrese el numero de vuelo que desea cancelar");
				num=scanner.nextInt();
				if(num==datos.vuelo1.getNumero()){
					datos.vuelo1.setEstatus("Cancelado");
					System.out.println("Ingrese el motivo de la cancelacion (clima, mecanico, etc)");
					datos.vuelo1.setMotivo(scanner.next());
				}
				else if(num==datos.vuelo2.getNumero()){
					datos.vuelo2.setEstatus("Cancelado");
					System.out.println("Ingrese el motivo de la cancelacion (clima, mecanico, etc)");
					datos.vuelo2.setMotivo(scanner.next());
				}
				else if(num==datos.vuelo3.getNumero()){
					datos.vuelo3.setEstatus("Cancelado");
					System.out.println("Ingrese el motivo de la cancelacion (clima, mecanico, etc)");
					datos.vuelo3.setMotivo(scanner.next());
				}
				else if(num==aeropuerto.getLinea().getVuelo().getNumero()){
					if(aeropuerto.getLinea().getVuelo().getEstatus().equals("volando"))
						System.out.println("El vuelo no puede cancelarse porque ya ha despegado");
					else{
						aeropuerto.getLinea().getVuelo().setEstatus("Cancelado");
						System.out.println("Ingrese el motivo de la cancelacion (clima, mecanico, etc)");
						aeropuerto.getLinea().getVuelo().setMotivo(scanner.next());
					}
				}
				else if(num==linea.getVuelo().getNumero()){
					if(linea.getVuelo().getEstatus().equals("volando"))
						System.out.println("El vuelo no puede cancelarse porque ya ha despegado");
					else{
						linea.getVuelo().setEstatus("Cancelado");
						System.out.println("Ingrese el motivo de la cancelacion (clima, mecanico, etc)");
						linea.getVuelo().setMotivo(scanner.next());
					}
				}
				else if(num==vuelo.getNumero()){
					if(vuelo.getEstatus().equals("volando"))
						System.out.println("El vuelo no puede cancelarse porque ya ha despegado");
					else{
						vuelo.setEstatus("Cancelado");
						System.out.println("Ingrese el motivo de la cancelacion (clima, mecanico, etc)");
						vuelo.setMotivo(scanner.next());
					}
				}
				else
					System.out.println("El vuelo no existe");
			}
			/*Si la respuesta del usuario es 4, se solicita que ingrese el numero de vuelo que desea
			 * comprar. Se verifica que el vuelo exista. Luego, el usuario debe ingresar la cantidad de
			 * personas que viajarán y la clase en que desean hacerlo. Se verifica que hayan suficientes
			 * lugares, y si así es, se procede al ingreso de datos personales. Al final se muestran
			 * los boletos comprados.*/
			else if(opcion==4){
				System.out.println("Ingrese el numero de vuelo");
				pasajero.setNumeroVuelo(scanner.nextInt());
				if(pasajero.getNumeroVuelo()==datos.vuelo1.getNumero()||pasajero.getNumeroVuelo()==datos.vuelo2.getNumero()||pasajero.getNumeroVuelo()==datos.vuelo3.getNumero()||pasajero.getNumeroVuelo()==aeropuerto.getLinea().getVuelo().getNumero()||pasajero.getNumeroVuelo()==linea.getVuelo().getNumero()||pasajero.getNumeroVuelo()==vuelo.getNumero()){
					System.out.println("Vuelo valido");
				}
				else{
					System.out.println("El vuelo no existe");
					System.out.println("Ingrese el numero de vuelo");
					pasajero.setNumeroVuelo(scanner.nextInt());
				}
				System.out.println("Ingrese la cantidad de personas que viajaran");
				c=scanner.nextInt();
				System.out.println("Que tipo de asiento desea?\n1. Primera clase\n2. Clase ejecutiva\n3. Clase turista");
				int t=scanner.nextInt();
				if(pasajero.getNumeroVuelo()==datos.vuelo1.getNumero()){
					if(datos.vuelo1.getEstatus().equals("Cancelado"))
						System.out.println("El vuelo ha sido cancelado");
					else{
						if(t==1){
							if(c+datos.vuelo1.getAvion().getCantidadAsientos().getAsiento_primera()>100){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									datos.vuelo1.getAvion().getCantidadAsientos().setAsiento_primera(datos.vuelo1.getAvion().getCantidadAsientos().getAsiento_primera()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=datos.vuelo1.getAvion().getCantidadAsientos().getAsiento_primera();
								}
							}
						}
						else if(t==2){
							if(c+datos.vuelo1.getAvion().getCantidadAsientos().getAsiento_ejecutivo()>200){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									datos.vuelo1.getAvion().getCantidadAsientos().setAsiento_ejecutivo(datos.vuelo1.getAvion().getCantidadAsientos().getAsiento_ejecutivo()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=datos.vuelo1.getAvion().getCantidadAsientos().getAsiento_ejecutivo();
								}
							}
						}
						else if(t==3){
							if(c+datos.vuelo1.getAvion().getCantidadAsientos().getAsiento_turista()>500){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									datos.vuelo1.getAvion().getCantidadAsientos().setAsiento_turista(datos.vuelo1.getAvion().getCantidadAsientos().getAsiento_turista()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=datos.vuelo1.getAvion().getCantidadAsientos().getAsiento_turista();
								}
							}
						}
						else
							System.out.println("Opcion invalida");
						System.out.println("\nBoletos comprados\n");
						System.out.println("Nombre     Apellido    Tipo de asiento   Numero de asiento    Numero de vuelo");
						for(int i=0;i<c;i++){
							System.out.println(nombre[i]+"     "+apellido[i]+"       "+t+"                  "+numeroAsiento[i]+"                  "+pasajero.getNumeroVuelo());
						}
					}
				}
				else if(pasajero.getNumeroVuelo()==datos.vuelo2.getNumero()){
					if(datos.vuelo2.getEstatus().equals("Cancelado"))
						System.out.println("El vuelo ha sido cancelado");
					else{
						if(t==1){
							if(c+datos.vuelo2.getAvion().getCantidadAsientos().getAsiento_primera()>100){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									datos.vuelo2.getAvion().getCantidadAsientos().setAsiento_primera(datos.vuelo2.getAvion().getCantidadAsientos().getAsiento_primera()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=datos.vuelo2.getAvion().getCantidadAsientos().getAsiento_primera();
								}
							}
						}
						else if(t==2){
							if(c+datos.vuelo2.getAvion().getCantidadAsientos().getAsiento_ejecutivo()>200){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									datos.vuelo2.getAvion().getCantidadAsientos().setAsiento_ejecutivo(datos.vuelo2.getAvion().getCantidadAsientos().getAsiento_ejecutivo()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=datos.vuelo2.getAvion().getCantidadAsientos().getAsiento_ejecutivo();
								}
							}
						}
						else if(t==3){
							if(c+datos.vuelo2.getAvion().getCantidadAsientos().getAsiento_turista()>500){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									datos.vuelo2.getAvion().getCantidadAsientos().setAsiento_turista(datos.vuelo2.getAvion().getCantidadAsientos().getAsiento_turista()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=datos.vuelo2.getAvion().getCantidadAsientos().getAsiento_turista();
								}
							}
						}
						else
							System.out.println("Opcion invalida");
						System.out.println("\nBoletos comprados\n");
						System.out.println("Nombre     Apellido    Tipo de asiento   Numero de asiento    Numero de vuelo");
						for(int i=0;i<c;i++){
							System.out.println(nombre[i]+"     "+apellido[i]+"       "+t+"                  "+numeroAsiento[i]+"                  "+pasajero.getNumeroVuelo());
						}
					}
				}
				else if(pasajero.getNumeroVuelo()==datos.vuelo3.getNumero()){
					if(datos.vuelo3.getEstatus().equals("Cancelado"))
						System.out.println("El vuelo ha sido cancelado");
					else{
						if(t==1){
							if(c+datos.vuelo3.getAvion().getCantidadAsientos().getAsiento_primera()>100){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									datos.vuelo3.getAvion().getCantidadAsientos().setAsiento_primera(datos.vuelo3.getAvion().getCantidadAsientos().getAsiento_primera()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=datos.vuelo3.getAvion().getCantidadAsientos().getAsiento_primera();
								}
							}
						}
						else if(t==2){
							if(c+datos.vuelo3.getAvion().getCantidadAsientos().getAsiento_ejecutivo()>200){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									datos.vuelo3.getAvion().getCantidadAsientos().setAsiento_ejecutivo(datos.vuelo3.getAvion().getCantidadAsientos().getAsiento_ejecutivo()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=datos.vuelo3.getAvion().getCantidadAsientos().getAsiento_ejecutivo();
								}
							}
						}
						else if(t==3){
							if(c+datos.vuelo3.getAvion().getCantidadAsientos().getAsiento_turista()>500){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									datos.vuelo3.getAvion().getCantidadAsientos().setAsiento_turista(datos.vuelo3.getAvion().getCantidadAsientos().getAsiento_turista()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=datos.vuelo3.getAvion().getCantidadAsientos().getAsiento_turista();
								}
							}
						}
						else
							System.out.println("Opcion invalida");
						System.out.println("\nBoletos comprados\n");
						System.out.println("Nombre     Apellido    Tipo de asiento   Numero de asiento    Numero de vuelo");
						for(int i=0;i<c;i++){
							System.out.println(nombre[i]+"     "+apellido[i]+"       "+t+"                  "+numeroAsiento[i]+"                  "+pasajero.getNumeroVuelo());
						}
					}
				}
				else if(pasajero.getNumeroVuelo()==aeropuerto.getLinea().getVuelo().getNumero()){
					if(aeropuerto.getLinea().getVuelo().getEstatus().equals("Cancelado"))
						System.out.println("El vuelo ha sido cancelado");
					else{
						if(t==1){
							if(c+aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_primera()>100){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().setAsiento_primera(aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_primera()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_primera();
								}
							}
						}
						else if(t==2){
							if(c+aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_ejecutivo()>200){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().setAsiento_ejecutivo(aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_ejecutivo()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_ejecutivo();
								}
							}
						}
						else if(t==3){
							if(c+aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_turista()>500){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().setAsiento_turista(aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_turista()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=aeropuerto.getLinea().getVuelo().getAvion().getCantidadAsientos().getAsiento_turista();
								}
							}
						}
						else
							System.out.println("Opcion invalida");
						System.out.println("\nBoletos comprados\n");
						System.out.println("Nombre     Apellido    Tipo de asiento   Numero de asiento    Numero de vuelo");
						for(int i=0;i<c;i++){
							System.out.println(nombre[i]+"     "+apellido[i]+"       "+t+"                  "+numeroAsiento[i]+"                  "+pasajero.getNumeroVuelo());
						}
					}
				}
				else if(pasajero.getNumeroVuelo()==linea.getVuelo().getNumero()){
					if(linea.getVuelo().getEstatus().equals("Cancelado"))
						System.out.println("El vuelo ha sido cancelado");
					else{
						if(t==1){
							if(c+linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_primera()>100){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									linea.getVuelo().getAvion().getCantidadAsientos().setAsiento_primera(linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_primera()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_primera();
								}
							}
						}
						else if(t==2){
							if(c+linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_ejecutivo()>200){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									linea.getVuelo().getAvion().getCantidadAsientos().setAsiento_ejecutivo(linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_ejecutivo()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_ejecutivo();
								}
							}
						}
						else if(t==3){
							if(c+linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_turista()>500){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									linea.getVuelo().getAvion().getCantidadAsientos().setAsiento_turista(linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_turista()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=linea.getVuelo().getAvion().getCantidadAsientos().getAsiento_turista();
								}
							}
						}
						else
							System.out.println("Opcion invalida");
						System.out.println("\nBoletos comprados\n");
						System.out.println("Nombre     Apellido    Tipo de asiento   Numero de asiento    Numero de vuelo");
						for(int i=0;i<c;i++){
							System.out.println(nombre[i]+"     "+apellido[i]+"       "+t+"                  "+numeroAsiento[i]+"                  "+pasajero.getNumeroVuelo());
						}
					}
				}
				else if(pasajero.getNumeroVuelo()==vuelo.getNumero()){
					if(vuelo.getEstatus().equals("Cancelado"))
						System.out.println("El vuelo ha sido cancelado");
					else{
						if(t==1){
							if(c+vuelo.getAvion().getCantidadAsientos().getAsiento_primera()>100){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									vuelo.getAvion().getCantidadAsientos().setAsiento_primera(vuelo.getAvion().getCantidadAsientos().getAsiento_primera()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=vuelo.getAvion().getCantidadAsientos().getAsiento_primera();
								}
							}
						}
						else if(t==2){
							if(c+vuelo.getAvion().getCantidadAsientos().getAsiento_ejecutivo()>200){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									vuelo.getAvion().getCantidadAsientos().setAsiento_ejecutivo(vuelo.getAvion().getCantidadAsientos().getAsiento_ejecutivo()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=vuelo.getAvion().getCantidadAsientos().getAsiento_ejecutivo();
								}
							}
						}
						else if(t==3){
							if(c+vuelo.getAvion().getCantidadAsientos().getAsiento_turista()>500){
								System.out.println("No hay suficientes asientos disponibles");
								c=0;
							}
							else{
								nombre=new String[c];
								apellido=new String[c];
								numeroAsiento=new int[c];
								/*El ciclo for se utiliza para controlar el ingreso de datos personales para los boletos
								 * Se controla con un contador i, que se incrementa en 1 cada vez que se ejecuta el ciclo,
								 * hasta que alcanza el valor c ingresado por el usuario. En cada repetición se guarda
								 * el nombre de la persona en el arreglo nombre, el apellido de la persona en el arreglo
								 * apellido, se suma un pasajero a la clase del vuelo ingresado y se guarda el numero
								 * de asiento.*/
								for(int i=0;i<c;i++){
									System.out.println("Ingrese el primer nombre del pasajero");
									String n=scanner.next();
									System.out.println("Ingrese el primer apellido del pasajero");
									String a=scanner.next();
									vuelo.getAvion().getCantidadAsientos().setAsiento_turista(vuelo.getAvion().getCantidadAsientos().getAsiento_turista()+1);
									nombre[i]=n;
									apellido[i]=a;
									numeroAsiento[i]=vuelo.getAvion().getCantidadAsientos().getAsiento_turista();
								}
							}
						}
						else
							System.out.println("Opcion invalida");
						System.out.println("\nBoletos comprados\n");
						System.out.println("Nombre     Apellido    Tipo de asiento   Numero de asiento    Numero de vuelo");
						for(int i=0;i<c;i++){
							System.out.println(nombre[i]+"     "+apellido[i]+"       "+t+"                  "+numeroAsiento[i]+"                  "+pasajero.getNumeroVuelo());
						}
					}
				}
				else
					System.out.println("El vuelo no existe");
			}
			
			/*Si la respuesta del usuario fue 5, se termina el programa con una despedida.*/
			else if(opcion==5){
				System.out.println("Feliz dia");
			}
		}while(opcion!=5);
	}
}
