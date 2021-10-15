
package parkingland.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import parkingland.modelos.ModeloBD;
import parkingland.vistas.Vista_parkingLand;


public class Controlador implements ActionListener{
    
    ModeloBD modelo = new ModeloBD();
    Vista_parkingLand vista = new Vista_parkingLand();
    
    public Controlador (ModeloBD modelo, Vista_parkingLand vista){
        this.modelo = modelo;
        this.vista = vista;
        vista.Conexion.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
       modelo.conectarBD_HemaSoft();
    }
    
    
}
