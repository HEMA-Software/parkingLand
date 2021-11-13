 
package parkingland;

import parkingland.controladores.Controlador;
import parkingland.modelos.ModeloBD;
import parkingland.vistas.VistaHome;
import parkingland.vistas.Vista_parkingLand;


public class ParkingLand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModeloBD modelo = new ModeloBD();
        Vista_parkingLand vista = new Vista_parkingLand();
        vista.setVisible(true);
        VistaHome home = new VistaHome(); 
        home.setVisible(true);
        Controlador controlador = new Controlador(modelo, vista, home);
    }
    
}
