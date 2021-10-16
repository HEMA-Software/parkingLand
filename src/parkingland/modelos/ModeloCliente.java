
package parkingland.modelos;


public class ModeloCliente {
    
    private int cedula;
    private String nombres;
    private String apellidos;
    private int telefono_movil;
    private int telefono_fijo;

    public ModeloCliente() {
    }

    public ModeloCliente(int cedula, String nombres, String apellidos, int telefono_movil, int telefono_fijo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono_movil = telefono_movil;
        this.telefono_fijo = telefono_fijo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(int telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public int getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(int telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }
    
    
    
}
