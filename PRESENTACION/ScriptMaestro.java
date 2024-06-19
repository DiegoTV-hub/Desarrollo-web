package PRESENTACION;

public class ScriptMaestro {

    /*
     *  javac PRESENTACION/AutoInicioDiego.java
     *  java -cp .;.\amysql-connector-j-8.0.33.jar PRESENTACION/AutoInicioDiego
     * 
     *                       MYSQL
     *  mysql -u root -p
     *  SHOW DATABASES;
     *  SELECT USER FROM mysql.user;
	 *  SHOW TABLES;
	 *  SHOW COLUMNS FROM control;
	 *  SHOW PROCEDURE STATUS;
	 *  DROP DATABASE diegobd;
	 *  DROP USER 'secrediego'@'%';
     *  
     *                      USUARIO
     *  CREATE USER 'admindiego'@'localhost' IDENTIFIED BY '123';
     *  CREATE USER 'admindiego'@'%' IDENTIFIED BY '123';
     *
     *                    PRIVILEGIOS
     *  GRANT RELOAD, CREATE USER, CREATE ON *.* TO 'secrediego'@'%' REQUIRE NONE WITH GRANT OPTION;
     *  
     *  
     *  GRANT ALL PRIVILEGES ON *.* TO 'admindiego'@'%' REQUIRE NONE WITH GRANT OPTION;
     *  FLUSH PRIVILEGES;
     *  SHOW GRANTS FOR 'secrediego'@'%';
     */
    
}
