/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadeabarrotes_Clases;

/**
 *
 * @author Francisco
 */
public abstract class Cliente extends Usuario {
    private String ID_Cliente;
    private String Tipo;
    
    Cliente(String ID_Cliente, String Tipo, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String CorreoElectronico, int Telefono) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, CorreoElectronico, Telefono);
        this.ID_Cliente =ID_Cliente;
        this.Tipo=Tipo;
    }
    
    /**
     * @return the ID_Cliente
     */
    public String getID_Cliente() {
        return ID_Cliente;
    }

    /**
     * @param ID_Cliente the ID_Cliente to set
     */
    public void setID_Cliente(String ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param ID_Tipo the ID_Tipo to set
     */
    public void setID_Tipo(String ID_Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}
