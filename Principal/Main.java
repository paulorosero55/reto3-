
package Principal;
import Vistas.*;
import Modelo.*;


public class Main {

    public static void main(String[] args) {
        //1. crear instancia de la clse conexion
         Conexion conexion= new Conexion();
         conexion.getConnection();

        // 2. crear instancia del Jframe Login
        Login login = new Login();
        login.setVisible(true);
    
    }  
    
    
}
