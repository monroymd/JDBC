
package tienda;

import tienda.servicios.ProductoService;


public class Guia_13_JDBC {

    
    public static void main(String[] args) throws Exception {
        
        ProductoService nuevo = new ProductoService();
        nuevo.listarProducto();
        System.out.println("-------------");
        nuevo.listarPorNombreYPrecio();
    }
    
}
