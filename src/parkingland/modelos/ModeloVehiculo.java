
package parkingland.modelos;


public class ModeloVehiculo {
    
    private String placa;
    private String marca;
    private String tipo;

    public ModeloVehiculo() {
    }

    public ModeloVehiculo(String placa, String marca, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
