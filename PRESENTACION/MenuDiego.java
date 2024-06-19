package PRESENTACION;
import NEGOCIO.*;
import java.util.*;

public class MenuDiego{
    OperacionesDiego obj = new OperacionesDiego();

	public void opcionesmenu(){
        Scanner leer = new Scanner(System.in);
        System.out.println("\n\n¡Hola! Bienvenid@ a AutoMotorsDiego\n");
        System.out.println("Tisnado Vazquez Diego\nArquitecturas de Software\n7IDS2\n");
        System.out.println("Herramientas utilizadas: \n\nLenguaje de programacion: JAVA\nGestor de Base de Datos: MySQL\nSistema Operativo: WINDOWS 10\nArquitectura de Software: CAPAS\nUltima modificacion: 18/NOV/2023 - 20:05 PM");
        System.out.println("Selecciona una opcion del Menu");
        System.out.println("\n1. CREAR USUARIO REMOTO\n2. CREAR TABLAS & PROCEDIMIENTOS\n3. GESTIONAR CLIENTES\n4. GESTIONAR AUTOMOVILES\n5. GESTIONAR SERVICIOS\n6. SALIR DEL SISTEMA");
    for(;;){
        int opc=leer.nextInt();       
            switch(opc){
                case 1:
                        System.out.println("Escogiste la opcion 1: CREAR USUARIO REMOTO\n");
                        obj.crearURemoto();
                break;
                case 2:
                        System.out.println("Escogiste la opcion 2: CREAR TABLAS & PROCEDIMIENTOS\n");
                        obj.crearTodo();
                break;
                case 3:
                        System.out.println("Escogiste la opcion 3: GESTIONAR CLIENTES\n");
                        GestClieDiego diegocli = new GestClieDiego();
                        diegocli.opcionesClienteDiego();
                break;
                case 4:
                        System.out.println("Escogiste la opcion 4: GESTIONAR AUTOMOVILES\n");
                        GestAutoDiego diegoauto = new GestAutoDiego();
                        diegoauto.opcionesAutoDiego();             
                break;
                case 5:
                        System.out.println("Escogiste la opcion 5: GESTIONAR SERVICIOS\n");
                        GestServDiego diegoservicio = new GestServDiego();
                        diegoservicio.opcionesServDiego();  
                break;
                case 6:
                        System.out.println("Escogiste la opcion 6: SALIR");
                        System.out.println("Que tengas un buen dia. Hasta luego! <3  -   DTV Todos los Derechos Reservados");
                        System.exit(0);
                break;
                default: 
                    System.out.println("Escoge una de las opciones del Menu");
            }
        System.out.println("\n1. CREAR USUARIO REMOTO\n2. CREAR TABLAS & PROCEDIMIENTOS\n3. GESTIONAR CLIENTES\n4. GESTIONAR AUTOMOVILES\n5. GESTIONAR SERVICIOS\n6. SALIR DEL SISTEMA");
        }
    }
}