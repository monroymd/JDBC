
package tienda.persistencia;

/**
 *
 * @author AzErEuS
 */
public final class ProductoDAO extends DAO {

    @Override
    public void consultarBase(String sql) throws Exception {
        super.consultarBase(sql);
        while (resultado.next()) {
                int a = resultado.getInt(1);
                String b = resultado.getString(2);
                double c = resultado.getDouble(3);
                int d = resultado.getInt(4);
                
                System.out.println("Fila = " + " " + a + " " + b + " " + c + " " + d);
                
            }
    }
    
    
    
    /*
    while (resultado.next()) {
                int a = resultado.getInt(1);
                String b = resultado.getString(2);
                double c = resultado.getDouble(3);
                int d = resultado.getInt(4);
                
                System.out.println("Fila = " + " " + a + " " + b + " " + c + " " + d);
                
            }
    */
}
