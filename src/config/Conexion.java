
package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OptiTransport", "root", "");
        } catch (Exception e) {
            System.err.println("No se puede establecer concexion con la base de datos"+e);
        }
    }
        public Connection gConnection(){
            return con;
        }
        
        
    
    public void obtenerDatos() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `datosu` WHERE 1");

            while (rs.next()) {
                int id = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                String solicitud = rs.getString("SOLICITUD");

                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Solicitud: " + solicitud);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error al obtener datos de la base de datos: " + e);
        }
    }
}    
        




  
