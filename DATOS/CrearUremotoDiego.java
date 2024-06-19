package DATOS;
import java.sql.*;

public class CrearUremotoDiego {

    public void crearURemoto(){
        try {
            ConexionBDiego compuconBD = new ConexionBDiego();
            Connection remoto = compuconBD.getConnectionREMOTA();
            Statement consulta = remoto.createStatement();
            consulta.executeUpdate("CREATE USER 'secrediego'@'%' IDENTIFIED BY '123';");
            consulta.executeUpdate("GRANT ALL PRIVILEGES ON *.* TO 'secrediego'@'%' IDENTIFIED BY '123';");           /*saludos profe*/
            consulta.executeUpdate("FLUSH PRIVILEGES;");
            System.out.println("EL USUARIO Y PRIVILEGIOS FUERON CREADOS CON EXITO. ¡Bien!\n");
        } catch (SQLException error) {
            System.out.print("Cuidado. Error de tipo: " + error.getMessage());
        }
    }
}
