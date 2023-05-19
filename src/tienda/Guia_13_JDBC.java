
package tienda;

import tienda.persistencia.ProductoDAO;


public class Guia_13_JDBC {

    
    public static void main(String[] args) throws Exception {
        
        ProductoDAO ds = new ProductoDAO();
        
        ds.consultarBase("SELECT * FROM producto");
    }
    
}
