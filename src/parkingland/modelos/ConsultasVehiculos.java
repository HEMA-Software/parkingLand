
package parkingland.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConsultasVehiculos extends ModeloBD {
    
    PreparedStatement consultaSQL;
    ResultSet resultadoSQL;
    
    public boolean registrarVehiculos(ModeloVehiculo vehiculo){
        
        Connection conexion = conectarBD_HemaSoft();
        String queryvehiculo = "INSERT INTO vehiculos(placa, marca, tipo)"
                + "VALUES (?,?,?)";
        
        try{
            
            consultaSQL = conexion.prepareStatement(queryvehiculo);
            
            consultaSQL.setString(1, vehiculo.getPlaca());
            consultaSQL.setString(2, vehiculo.getMarca());
            consultaSQL.setString(3, vehiculo.getTipo());
            
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
    
    public ModeloVehiculo buscarVehiculos(String placa){
        
        Connection conexion = conectarBD_HemaSoft();
        String queryvehiculo = "SELECT * from vehiculos where placa=?";
        
        try{
           
            consultaSQL = conexion.prepareStatement(queryvehiculo);
            
            consultaSQL.setString(1,placa);
            
            resultadoSQL= consultaSQL.executeQuery();
            
            ModeloVehiculo vehiculo = new ModeloVehiculo();
            
            if(resultadoSQL.next()){
                vehiculo.setPlaca(resultadoSQL.getString("placa"));
                vehiculo.setMarca(resultadoSQL.getString("marca"));
                vehiculo.setTipo(resultadoSQL.getString("tipo"));
                
                return vehiculo;
                
            }else{
                return null;
            }
           
       
        }catch(Exception error){
            System.out.println("UPPS error" + error);
        
            return null;
        }
        
        
    }
    
}
