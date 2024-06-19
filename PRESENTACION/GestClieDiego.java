package PRESENTACION;
import NEGOCIO.*;
import java.util.*;

public class GestClieDiego{
    OperacionesDiego obj = new OperacionesDiego();

	public void opcionesClienteDiego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Selecciona una opcion del Menu");
        System.out.println("\n1. INSERTAR CLIENTE\n2. SELECCIONAR CLIENTE \n3. ACTUALIZAR CLIENTE\n4. ELIMINAR CLIENTE\n5. REGRESAR\n6 SALIR DEL SISTEMA");
    for(;;){
        int opc=leer.nextInt();       
            switch(opc){
                case 1:
                        System.out.println("Escogiste la opcion 1: INSERTAR CLIENTE\n");
                        obj.insert_cli();
                break;
                case 2:
                        System.out.println("Escogiste la opcion 2: SELECCIONAR CLIENTE\n");
                        obj.checar_cli();
                break;
                case 3:
                        System.out.println("Escogiste la opcion 3: ACTUALIZAR CLIENTE\n");
                        obj.actualizar_cli();
                break;
                case 4:
                        System.out.println("Escogiste la opcion 3: ELIMINAR CLIENTE\n");
                        obj.delete_cli();
                break;
                case 5:
                        System.out.println("Escogiste la opcion 4: REGRESAR\n");
                        MenuDiego diegoregresa1 = new MenuDiego();
                        diegoregresa1.opcionesmenu();              
                break;
                case 6:
                        System.out.println("Escogiste la opcion 5: SALIR DEL SISTEMA");
                        System.out.println("Que tengas un buen dia. Hasta luego! <3  -   DTV Todos los Derechos Reservados");
                        System.exit(0);
                break;
                default: 
                    System.out.println("Escoge una de las opciones del Menu");
            }
        System.out.println("\n1. INSERTAR CLIENTE\n2. SELECCIONAR CLIENTE\n3. ACTUALIZAR CLIENTE\n4. ELIMINAR CLIENTE\n5. REGRESAR\n6. SALIR DEL SISTEMA");
        }
    }
}