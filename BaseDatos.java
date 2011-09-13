package proyecto1;
import java.util.Scanner;
public class BaseDatos {
	public static void main(String[] args){
		Administrativo administrativo = new Administrativo();
		Aeromozo aeromozo = new Aeromozo();
		Asiento asiento = new Asiento();
		Avion avion = new Avion();
		LineaAerea linea = new LineaAerea();
		Piloto piloto = new Piloto();
		Vuelo vuelo = new Vuelo();
		Aeropuerto aeropuerto = new Aeropuerto();
		Scanner scanner=new Scanner(System.in);
		int opcion = 1;
		int respuesta = 0;
		String resp="";
		System.out.println("Bienvenido");
		System.out.println("Que desea hacer?");
		do{
			System.out.println("1. Ver vuelos disponibles");
			System.out.println("2. Registrar nueva información");
			System.out.println("3. Cancelar vuelo");
			System.out.println("4. Salir");
			opcion = scanner.nextInt();
			if (opcion==1){
				System.out.println(vuelo.getNumero());
			}
			else if(opcion==2){
				System.out.println("Que desea ingresar?");
				System.out.println("1. Aeropuerto");
				System.out.println("2. Aerolinea");
				System.out.println("3. Vuelo");
				respuesta = scanner.nextInt();
				if (respuesta==1){
					System.out.println("Ingrese el nombre del aeropuerto");
					resp = scanner.next();
					aeropuerto.setAeropuerto(resp);
				}
				else if (respuesta==2){
					System.out.println("Ingrese la aerolinea");
					linea.setNombreLinea(scanner.next());
				}
				else if(respuesta==3){
					System.out.println("Ingrese el destino");
					System.out.println("Ingrese el avion");
					System.out.println("Ingrese la hora de saldia");
					System.out.println("Ingrese la hora de llegada");
				}
				else
					System.out.println("Opcion no valida");
			}
			else if(opcion==3){
				System.out.println("Ingrese el numero de vuelo que desea cancelar");
			}
			else if(opcion==4){
				System.out.println("Feliz dia");
			}
		}while(opcion!=4);
	}

}
