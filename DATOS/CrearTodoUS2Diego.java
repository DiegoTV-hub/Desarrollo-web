package DATOS;
import java.sql.*;

public class CrearTodoUS2Diego {
   
    public void crearCurTab(){
        try {
            ConexionBDiego si = new ConexionBDiego();
            Connection usuario = si.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            //TABLA CLIENTE
            consulta.executeUpdate("CREATE TABLE cliente_diego (id INT PRIMARY KEY AUTO_INCREMENT, nom VARCHAR(50) , ap_pat VARCHAR(50) , ap_mat VARCHAR(50) , edad INT , rfc VARCHAR(20));");
            consulta.executeUpdate("CREATE PROCEDURE sp_ins_cli_diego(nom VARCHAR(50), ap_pat VARCHAR(50), ap_mat VARCHAR(150), edad INT, rfc VARCHAR(20)) INSERT INTO cliente_diego VALUES(null,nom,ap_pat,ap_mat,edad,rfc)");
            consulta.executeUpdate("CREATE PROCEDURE sp_sel_cli_diego() SELECT * FROM cliente_diego");
            consulta.executeUpdate("CREATE PROCEDURE sp_del_cli_diego(eliminar INT) DELETE FROM cliente_diego WHERE id = eliminar");
            consulta.executeUpdate("CREATE PROCEDURE sp_upd_cli_diego(nombre VARCHAR(50), appat VARCHAR(50), apmat VARCHAR(50), age INT, sat VARCHAR(20), num_id INT) UPDATE cliente_diego SET nom = nombre, ap_pat = appat, ap_mat = apmat, edad = age, rfc = sat WHERE id=num_id;");
            //TABLA AUTOMOVIL
            consulta.executeUpdate("CREATE TABLE automovil_diego (id INT PRIMARY KEY AUTO_INCREMENT, marca VARCHAR(50) , modelo VARCHAR(50) , color VARCHAR(50) , matricula VARCHAR(50));");
            consulta.executeUpdate("CREATE PROCEDURE sp_ins_auto_diego(marca VARCHAR(50), modelo VARCHAR(50), color VARCHAR(150), matricula VARCHAR(20)) INSERT INTO automovil_diego VALUES(null,marca,modelo,color,matricula)");                  //Diego estuvo aqui
            consulta.executeUpdate("CREATE PROCEDURE sp_sel_auto_diego() SELECT * FROM automovil_diego");
            consulta.executeUpdate("CREATE PROCEDURE sp_del_auto_diego(eliminar INT) DELETE FROM automovil_diego WHERE id = eliminar");
            consulta.executeUpdate("CREATE PROCEDURE sp_upd_auto_diego(marca VARCHAR(50), modelo VARCHAR(50), color VARCHAR(50), matricula VARCHAR(50), num_id INT) UPDATE automovil_diego SET marca = marca, modelo = modelo, color = color, matricula = matricula WHERE id=num_id;");
            //TABLA SERVICIO
            consulta.executeUpdate("CREATE TABLE servicio_diego (id INT PRIMARY KEY AUTO_INCREMENT, nom_servicio VARCHAR(150) , descripcion VARCHAR(150) , costo INT);");
            consulta.executeUpdate("CREATE PROCEDURE sp_ins_ser_diego(nom_servicio VARCHAR(150), descripcion VARCHAR(150), costo INT) INSERT INTO servicio_diego VALUES(null,nom_servicio,descripcion,costo)");
            consulta.executeUpdate("CREATE PROCEDURE sp_sel_ser_diego() SELECT * FROM servicio_diego");
            consulta.executeUpdate("CREATE PROCEDURE sp_del_ser_diego(eliminar INT) DELETE FROM servicio_diego WHERE id = eliminar");
            consulta.executeUpdate("CREATE PROCEDURE sp_upd_ser_diego(nser VARCHAR(50), descr VARCHAR(50), valor VARCHAR(50), num_id INT) UPDATE servicio_diego SET nom_servicio = nser, descripcion = descr, costo = valor WHERE id=num_id;");
            System.out.println("LA BASE, TABLAS Y PROCEDIMIENTOS FUERON CREADOS CON EXITO\n");
        } catch (SQLException error) {
            System.out.print("Cuidado. Error de tipo: " + error.getMessage());
        }
    }
}
