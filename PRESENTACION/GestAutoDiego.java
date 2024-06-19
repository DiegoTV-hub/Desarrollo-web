package PRESENTACION;
import NEGOCIO.*;
import java.util.*;

public class GestAutoDiego{
    OperacionesDiego obj = new OperacionesDiego();

	public void opcionesAutoDiego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Selecciona una opcion del Menu");
        System.out.println("\n1. INSERTAR AUTOMOVIL\n2. SELECCIONAR AUTOMOVIL \n3. ACTUALIZAR AUTOMOVIL\n4. ELIMINAR AUTOMOVIL\n5. REGRESAR\n6 SALIR DEL SISTEMA");
    for(;;){
        int opc=leer.nextInt();       
            switch(opc){
                case 1:
                        System.out.println("Escogiste la opcion 1: INSERTAR AUTOMOVIL\n");
                        obj.insert_auto();
                break;
                case 2:
                        System.out.println("Escogiste la opcion 2: SELECCIONAR AUTOMOVIL\n");
                        obj.checar_auto();
                break;
                case 3:
                        System.out.println("Escogiste la opcion 3: ACTUALIZAR AUTOMOVIL\n");
                        obj.actualizar_auto();
                break;
                case 4:
                        System.out.println("Escogiste la opcion 3: ELIMINAR AUTOMOVIL\n");
                        obj.delete_auto();
                break;
                case 5:
                        System.out.println("Escogiste la opcion 4: REGRESAR\n");
                        MenuDiego diegoregresa2 = new MenuDiego();
                        diegoregresa2.opcionesmenu();              
                break;
                case 6:
                        System.out.println("Escogiste la opcion 5: SALIR DEL SISTEMA");
                        System.out.println("Que tengas un buen dia. Hasta luego! <3  -   DTV Todos los Derechos Reservados");
                        System.exit(0);
                break;
                default: 
                    System.out.println("Escoge una de las opciones del Menu");
            }
        System.out.println("\n1. INSERTAR AUTOMOVIL\n2. SELECCIONAR AUTOMOVIL \n3. ACTUALIZAR AUTOMOVIL\n4. ELIMINAR AUTOMOVIL\n5. REGRESAR\n6 SALIR DEL SISTEMA");
        }
    }
}

























/*arriba las chivas*/