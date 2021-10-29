
package parkingland.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConsultasRegistros extends ModeloBD {
    
    PreparedStatement consultaSQL;
    ResultSet resultadoSQL;
    
    
    public boolean ingresoRegistro(ModeloRegistro registro){
        
        Connection conexion = conectarBD_HemaSoft();
        String queryregistro = "INSERT INTO registro(idregistro, placa, cedula, hora_ingreso, hora_salida, estado) "
                + "VALUES (?,?,?,?,?,?)";
        
        try{
        
            consultaSQL = conexion.prepareStatement(queryregistro);
            
            consultaSQL.setInt(1, registro.getIdregistro());
            consultaSQL.setString(2, registro.getPlaca());
            consultaSQL.setInt(3, registro.getCedula());
            consultaSQL.setString(4, registro.getHora_ingreso());
            consultaSQL.setString(5, registro.getHora_salida());
            consultaSQL.setString(6, registro.getEstado());
            
            int resultado = consultaSQL.executeUpdate();
            
            
            if(resultado > 0){
                return true;            
            }else{
                return false;
            }     
            
        }catch(Exception error){
            System.out.println("UPPP error" + error);
            
            return false;
        }
               
    }
    
     public ModeloRegistro buscarregistro(int idregistro ){
        
        Connection conexion = conectarBD_HemaSoft();
        String queryregistro = "SELECT * from registro where idregistro=?";
        
        try{
           
            consultaSQL = conexion.prepareStatement(queryregistro);
            
            consultaSQL.setInt(1,idregistro);
            
            resultadoSQL= consultaSQL.executeQuery();
            
            ModeloRegistro registro = new ModeloRegistro();
            
            if(resultadoSQL.next()){
                registro.setIdregistro(resultadoSQL.getInt("idregistro"));
                registro.setPlaca(resultadoSQL.getString("placa"));
                registro.setCedula(resultadoSQL.getInt("cedula"));
                registro.setHora_ingreso(resultadoSQL.getString("hora_ingreso"));
                registro.setHora_salida(resultadoSQL.getString("hora_salida"));
                registro.setEstado(resultadoSQL.getString("estado"));
                
                return registro;
                
            }else{
                return null;
            }
           
       
        }catch(Exception error){
            System.out.println("UPPS error" + error);
        
            return null;
        }
        
        
    }
    
}
