

import java.sql.SQLException;

// Requires ConectorJDBC

public class Main {


     public static void main(String[] args) throws SQLException {

         ModuloDAO si = new ModuloDAO(1, "programacion", 120, "Juan Cruz", 12, 8);
         si.insertarModulo();

         ModuloDAO no = new ModuloDAO(2, "LDM", 120, "Lola Lele", 9, 7);
         no.insertarModulo();
         si.eliminarModulo(1);


    }
}
