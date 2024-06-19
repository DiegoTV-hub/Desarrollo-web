package DATOS;

import java.sql.*;
import javax.print.DocFlavor.STRING;

public class EjecutarCrudU2Diego {
     ConexionBDiego obj = new ConexionBDiego();

    //TABLA USUARIO 
    public void insert_cli(String nom, String ap_pat, String ap_mat, int edad, String rfc){
        try {
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            consulta.executeUpdate("CALL sp_ins_cli_diego('"+nom+"','"+ap_pat+"','"+ap_mat+"','"+edad+"','"+rfc+"')");
            System.out.println("");
            System.out.println("¡Registro realizado con exito!\n");
        }catch (SQLException error) {
            System.out.print("Cuidado. Error de tipo: " + error.getMessage());
        }
    }
    public void ver_cli(){
        try{
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            ResultSet res = consulta.executeQuery("CALL sp_sel_cli_diego()");
            System.out.println("");
            System.out.println("Aqui tienes tu Consulta\n");
            while(res.next()){
                System.out.println(res.getInt(1) + " " + res.getString(2)+ " " + res.getString(3)+ " " + res.getString(4)+ " "+ res.getInt(5)+ " "+ res.getString(6));
        }
        //usuario.close();
        }catch (SQLException error) {
            System.out.println("Cuidado con el error! "+ error.getMessage());
        }
    }
    public void actuali_cli(String nom, String ap_pat, String ap_mat, int edad, String rfc,int id){
        try {
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            consulta.executeUpdate("CALL sp_upd_cli_diego('"+nom+"','"+ap_pat+"','"+ap_mat+"','"+edad+"','"+rfc+"','"+id+"')");                                  /*viva México*/
            System.out.println("");
            System.out.println("Actualizado Correctamente\n");
        }catch (SQLException error) {
            System.out.println("Cuidado con el error! "+ error.getMessage());
        }
    }
    public void delete_cli(int id){
        try{
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            consulta.executeUpdate("CALL sp_del_cli_diego('"+id+"')");
            System.out.println("\n");
            System.out.println("Registro eliminado con exito\n");
         }catch(SQLException error){
            System.out.print("Cuidado con el error! " + error.getMessage());
         }
    }

    //TABLA AUTOMOVIL
    public void insert_auto(String marca, String modelo, String color, String matricula){
        try {
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            consulta.executeUpdate("CALL sp_ins_auto_diego('"+marca+"','"+modelo+"','"+color+"','"+matricula+"')");
            System.out.println("");
            System.out.println("¡Registro realizado con exito!\n");
        }catch (SQLException error) {
            System.out.print("Cuidado. Error de tipo: " + error.getMessage());
        }
    }
    public void ver_auto(){
        try{
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            ResultSet res = consulta.executeQuery("CALL sp_sel_auto_diego()");
            System.out.println("");
            System.out.println("Aqui tienes tu Consulta\n");
            while(res.next()){
                System.out.println(res.getInt(1) + " " + res.getString(2)+ " " + res.getString(3)+ " " + res.getString(4)+ " "+ res.getString(5));                         /*saludos profe*/
        }
        //usuario.close();
        }catch (SQLException error) {
            System.out.println("Cuidado con el error! "+ error.getMessage());
        }
    }
    public void actuali_auto(String marca, String modelo, String color, String matricula, int id){
        try {
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            consulta.executeUpdate("CALL sp_upd_auto_diego('"+marca+"','"+modelo+"','"+color+"','"+matricula+"','"+id+"')");                    /*venga ese SA*/
            System.out.println("");
            System.out.println("Actualizado Correctamente\n");
        }catch (SQLException error) {
            System.out.println("Cuidado con el error! "+ error.getMessage());
        }
    }
    public void delete_auto(int id){
        try{
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            consulta.executeUpdate("CALL sp_del_auto_diego('"+id+"')");
            System.out.println("\n");
            System.out.println("Registro eliminado con exito\n");
         }catch(SQLException error){
            System.out.print("Cuidado con el error! " + error.getMessage());
         }
    }

    //TABLA SERVICIO
    public void insert_ser(String nom_servicio, String descripcion, int costo){
        try {
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            consulta.executeUpdate("CALL sp_ins_ser_diego('"+nom_servicio+"','"+descripcion+"','"+costo+"')");
            System.out.println("");
            System.out.println("¡Registro realizado con exito!\n");
        }catch (SQLException error) {
            System.out.print("Cuidado. Error de tipo: " + error.getMessage());
        }
    }
    public void ver_ser(){
        try{
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            ResultSet res = consulta.executeQuery("CALL sp_sel_ser_diego()");
            System.out.println("");
            System.out.println("Aqui tienes tu Consulta\n");
            while(res.next()){
                System.out.println(res.getInt(1) + " " + res.getString(2)+ " " + res.getString(3)+ " " + res.getInt(4));
        }
        //usuario.close();
        }catch (SQLException error) {
            System.out.println("Cuidado con el error! "+ error.getMessage());
        }
    }
    public void actuali_ser(String nom_servicio, String descripcion, int costo, int id){
        try {
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            consulta.executeUpdate("CALL sp_upd_ser_diego('"+nom_servicio+"','"+descripcion+"','"+costo+"','"+id+"')");                             /*tengo hambre*/
            System.out.println("");
            System.out.println("Actualizado Correctamente\n");
        }catch (SQLException error) {
            System.out.println("Cuidado con el error! "+ error.getMessage());
        }
    }
    public void delete_ser(int id){
        try{
            ConexionBDiego obj = new ConexionBDiego();
            Connection usuario = obj.getConnectionUSUARIO2();
            Statement consulta = usuario.createStatement();
            consulta.executeUpdate("CALL sp_del_ser_diego('"+id+"')");
            System.out.println("\n");
            System.out.println("Registro eliminado con exito\n");
         }catch(SQLException error){
            System.out.print("Cuidado con el error! " + error.getMessage());
         }
    }
}

