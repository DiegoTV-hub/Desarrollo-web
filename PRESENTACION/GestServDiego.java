package PRESENTACION;
import NEGOCIO.*;
import java.util.*;

public class GestServDiego{
    OperacionesDiego obj = new OperacionesDiego();

	public void opcionesServDiego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Selecciona una opcion del Menu");
        System.out.println("\n1. INSERTAR SERVICIO\n2. SELECCIONAR SERVICIO \n3. ACTUALIZAR SERVICIO\n4. ELIMINAR SERVICIO\n5. REGRESAR\n6 SALIR DEL SISTEMA");
    for(;;){
        int opc=leer.nextInt();       
            switch(opc){
                case 1:
                        System.out.println("Escogiste la opcion 1: INSERTAR SERVICIO\n");
                        obj.insert_ser();
                break;
                case 2:
                        System.out.println("Escogiste la opcion 2: SELECCIONAR SERVICIO\n");
                        obj.checar_ser();
                break;
                case 3:
                        System.out.println("Escogiste la opcion 3: ACTUALIZAR SERVICIO\n");
                        obj.actualizar_ser();
                break;
                case 4:
                        System.out.println("Escogiste la opcion 3: ELIMINAR SERVICIO\n");
                        obj.delete_ser();
                break;        
                case 5:
                        System.out.println("Escogiste la opcion 4: REGRESAR\n");
                        MenuDiego diegoregresa3 = new MenuDiego();
                        diegoregresa3.opcionesmenu();              
                break;
                case 6:
                        System.out.println("Escogiste la opcion 5: SALIR DEL SISTEMA");
                        System.out.println("Que tengas un buen dia. Hasta luego! <3  -   DTV Todos los Derechos Reservados");
                        System.exit(0);
                break;
                default: 
                    System.out.println("Escoge una de las opciones del Menu");
            }
        System.out.println("\n1. INSERTAR SERVICIO\n2. SELECCIONAR SERVICIO \n3. ACTUALIZAR SERVICIO\n4. ELIMINAR SERVICIO\n5. REGRESAR\n6 SALIR DEL SISTEMA");
        }
    }
}