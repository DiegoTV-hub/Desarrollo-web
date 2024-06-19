package DATOS;
import java.sql.*;

 public class ConexionBDiego{
	Connection remoto = null;
	Connection usuario = null;

    public Connection getConnectionREMOTA(){
		String url = "jdbc:mysql://localhost:3306/";
		String user = "admindiego", password = "123"; 
		try{
			remoto = DriverManager.getConnection(url, user, password);			
		}catch(SQLException error){
			System.out.print("Cuidado. Error de tipo: " + error.getMessage());
		}
	return remoto;
	} 
	 public Connection getConnectionUSUARIO2(){
		String url = "jdbc:mysql://localhost:3306/diegobd"; 
		String user = "secrediego", password = "123";
		try{
			usuario = DriverManager.getConnection(url, user, password);			
		}catch(SQLException error){
			System.out.print("Cuidado. Error de tipo: " + error.getMessage());
		}
	return usuario;
	} 
}