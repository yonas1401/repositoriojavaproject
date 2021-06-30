/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import co.com.siscomputo.forms.ObjectoCrudForm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SISCOMPUTO
 */
public class Conexion {
    private static Connection cnx = null;
//conexion numero 1
public static Connection obtener() throws SQLException,  ClassNotFoundException {
  if (cnx == null) {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost/diligencia", "root", "root");
        
       
     } catch (SQLException ex) {
         
         System.out.println(ex.getMessage());
                 
        
        throw new SQLException(ex);
     } catch (ClassNotFoundException ex) {
         
        throw new ClassCastException(ex.getMessage());
     }
  }
  return cnx;
  }

public static void cerrar() throws SQLException {
  if (cnx != null) {
     cnx.close();
  }
  }

    
}
// conexion numero 2
/*public class Conexion {
    private static Connection cnx = null;

    // Librería de MySQL
    public String driver = "com.mysql.cj.jdbc.Driver";

    // Nombre de la base de datos
    public String database = "diligencia";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "root";

    public Connection obtener() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
public static void cerrar() throws SQLException {
  if (cnx != null) {
     cnx.close();
        }
    }

}*/

