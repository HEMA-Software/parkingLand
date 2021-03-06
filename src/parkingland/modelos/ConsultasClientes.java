
package parkingland.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConsultasClientes extends ModeloBD{
    
    PreparedStatement consultaSQL;
    ResultSet resultadoSQL;
    
    public boolean registrarClientes(ModeloCliente cliente){
        
        Connection conexion = conectarBD_HemaSoft();
        String querycliente = "INSERT INTO clientes(cedula, nombre, apellidos, telefono_movil, telefono_fijo) "
                + "VALUES (?,?,?,?,?)";
        
        try{
            
            consultaSQL = conexion.prepareStatement(querycliente);
            
            consultaSQL.setInt(1, cliente.getCedula());
            consultaSQL.setString(3, cliente.getApellidos());
            consultaSQL.setString(2, cliente.getNombres());
            consultaSQL.setInt(1, cliente.getTelefono_movil());
            consultaSQL.setInt(1, cliente.getTelefono_fijo());
         
            
            int resultado = consultaSQL.executeUpdate();
            
            if(resultado > 0){
                return true;
            }else{
                return false;
            }
            
        }catch(Exception error){
            System.out.println("UPPS error" + error);
            
            
            return false;
        
        }
        
    }
    
    public ModeloCliente buscarCliente(int cedula){
        
        Connection conexion = conectarBD_HemaSoft();
        String querycliente = "SELECT * from clientes where cedula=?";
        
        try{
           
            consultaSQL = conexion.prepareStatement(querycliente);
            
            consultaSQL.setInt(1,cedula);
            
            resultadoSQL= consultaSQL.executeQuery();
            
            ModeloCliente cliente = new ModeloCliente();
            
            if(resultadoSQL.next()){
                cliente.setCedula(resultadoSQL.getInt("cedula"));
                cliente.setNombres(resultadoSQL.getString("nombre"));
                cliente.setApellidos(resultadoSQL.getString("apellidos"));
                cliente.setTelefono_movil(resultadoSQL.getInt("telefono_movil"));
                cliente.setTelefono_fijo(resultadoSQL.getInt("telefono_fijo"));
               
                
                return cliente;
                
            }else{
                return null;
            }
           
       
        }catch(Exception error){
            System.out.println("UPPS error" + error);
        
            return null;
        }
        
        
    }
    
    
}
