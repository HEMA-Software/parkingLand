
package parkingland.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import parkingland.modelos.ModeloBD;
import parkingland.vistas.VistaHome;
import parkingland.vistas.Vista_parkingLand;


public class Controlador implements ActionListener{
    
    ModeloBD modelo = new ModeloBD();
    Vista_parkingLand vista = new Vista_parkingLand();
    VistaHome home = new VistaHome();
    
    public Controlador (ModeloBD modelo, Vista_parkingLand vista, VistaHome home){
        this.modelo = modelo;
        this.vista = vista;
        this.home = home;
        vista.Conexion.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
       modelo.conectarBD_HemaSoft();
    }
    
    
}
