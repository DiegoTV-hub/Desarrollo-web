package NEGOCIO;
import DATOS.*;
import java.util.*;


public class OperacionesDiego{
	EjecutarCrudU2Diego procedimientos = new EjecutarCrudU2Diego();
	CrearUremotoDiego conexion = new CrearUremotoDiego();
	CrearTodoUS2Diego tabla = new CrearTodoUS2Diego();
	Scanner leer = new Scanner(System.in);
	Scanner recibir = new Scanner(System.in);
	Scanner lt = new Scanner(System.in);

	Scanner comodin = new Scanner(System.in);

	//TABLA CLIENTE
	public void insert_cli(){
        String nom = null;
		String ap_pat = null;
		String ap_mat = null;
        int edad = 0;
		String rfc = null;
        System.out.println("Ingresa el nombre del cliente: ");
        nom = leer.nextLine();
		System.out.println("Ingresa el apellido paterno del cliente: ");
        ap_pat = leer.nextLine();
		System.out.println("Ingresa el apellido materno del cliente ");
        ap_mat = leer.nextLine();
        System.out.println("Ingresa la edad del cliente: ");
        edad = recibir.nextInt();
		System.out.println("Ingresa el RFC del cliente: ");
        rfc = comodin.nextLine();
        procedimientos.insert_cli(nom, ap_pat, ap_mat, edad, rfc);
	}

	public void actualizar_cli(){
		String nom = null;
		String ap_pat = null;
		String ap_mat = null;
		int edad = 0;
		String rfc = null;
		int id_registro = 0;
			System.out.println("Ingrese el nuevo nombre del cliente: ");
			nom = leer.nextLine();
			System.out.println("Ingrese el nuevo apellido paterno del cliente: ");
			ap_pat = leer.nextLine();
			System.out.println("Ingrese el nuevo apellido materno del cliente: ");
			ap_mat = leer.nextLine();
			System.out.println("Ingrese la nueva edad del cliente: ");
			edad = lt.nextInt();
			System.out.println("Ingrese el nuevo RFC del cliente: ");
			rfc = leer.nextLine();
			System.out.println("Selecciona el ID que quieres cambiar");
			id_registro = recibir.nextInt();
			procedimientos.actuali_cli(nom, ap_pat, ap_mat, edad ,rfc, id_registro);
	}

	public void delete_cli(){
		int id;
		System.out.print("ID a eliminar: ");
		id = leer.nextInt();
		procedimientos.delete_cli(id);
	}

	public void checar_cli(){
		procedimientos.ver_cli();
	}

	//TABLA AUTOMOVIL
	public void insert_auto(){
        String marca = null;
		String modelo = null;
		String color = null;
        String matricula = null;
        System.out.println("Ingresa la marca del automovil: ");
        marca = leer.nextLine();
		System.out.println("Ingresa el modelo del automovil: ");
        modelo = leer.nextLine();
		System.out.println("Ingresa el color del automovil ");
        color = leer.nextLine();
        System.out.println("Ingresa la matricula del automovil: ");
        matricula = recibir.nextLine();
        procedimientos.insert_auto(marca, modelo, color, matricula);
	}

	public void actualizar_auto(){
		String marca = null;
		String modelo = null;
		String color = null;
		String matricula = null;
		int id_registro = 0;
			System.out.println("Ingrese la nueva marca del automovil: ");
			modelo = leer.nextLine();
			System.out.println("Ingrese el nuevo modelo del automovil: ");
			modelo = leer.nextLine();
			System.out.println("Ingrese el nuevo color del automovil: ");
			color = leer.nextLine();
			System.out.println("Ingrese la nueva matricula del automovil: ");
			matricula = leer.nextLine();
			System.out.println("Selecciona el ID que quieres cambiar");
			id_registro = recibir.nextInt();
			procedimientos.actuali_auto(marca, modelo, color, matricula, id_registro);
	}

	public void delete_auto(){
		int id;
		System.out.print("ID a eliminar: ");
		id = leer.nextInt();
		procedimientos.delete_auto(id);
	}

	public void checar_auto(){
		procedimientos.ver_auto();
	}

	//TABLA SERVICIO
	public void insert_ser(){
        String nom_servicio = null;
		String descripcion = null;
        int costo = 0;
        System.out.println("Ingresa el nombre del servicio: ");
        nom_servicio = leer.nextLine();
		System.out.println("Ingresa la descripcion del servicio: ");
        descripcion = leer.nextLine();
        System.out.println("Ingresa el costo del servicio: ");
        costo = recibir.nextInt();
        procedimientos.insert_ser(nom_servicio, descripcion, costo);
	}

	public void actualizar_ser(){
		String nom_servicio = null;
		String descripcion = null;
		int costo = 0;
		int id_registro = 0;
			System.out.println("Ingrese el nuevo nombre del servicio: ");
			nom_servicio = leer.nextLine();
			System.out.println("Ingrese la nueva descripcion del servicio: ");
			descripcion = leer.nextLine();
			System.out.println("Ingrese el nuevo costo del servicio: ");
			costo = lt.nextInt();
			System.out.println("Selecciona el ID que quieres cambiar");
			id_registro = recibir.nextInt();
			procedimientos.actuali_ser(nom_servicio, descripcion, costo, id_registro);
	}

	public void delete_ser(){
		int id;
		System.out.print("ID a eliminar: ");
		id = leer.nextInt();
		procedimientos.delete_ser(id);
	}

	public void checar_ser(){
		procedimientos.ver_ser();
	}

	public void crearURemoto(){
		conexion.crearURemoto();
	}

	public void crearTodo(){
		tabla.crearCurTab();
	}
}

