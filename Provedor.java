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
public class Provedor {
    private String ID_Provedor;
    private String Nombre;
    private String APaterno;
    private String AMaterno;
    private int Telefono;
    private String Correo;
    
    public Provedor(String ID_Provedor,String Nombre,String APaterno,String AMaterno,int Telefono,String Correo){
        this.ID_Provedor=ID_Provedor;
        this.Nombre=Nombre;
        this.APaterno=APaterno;
        this.Telefono=Telefono;
        this.Correo=Correo;
    }
    /**
     * @return the ID_Provedor
     */
    public String getID_Provedor() {
        return ID_Provedor;
    }

    /**
     * @param ID_Provedor the ID_Provedor to set
     */
    public void setID_Provedor(String ID_Provedor) {
        this.ID_Provedor = ID_Provedor;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the APaterno
     */
    public String getAPaterno() {
        return APaterno;
    }

    /**
     * @param APaterno the APaterno to set
     */
    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    /**
     * @return the AMaterno
     */
    public String getAMaterno() {
        return AMaterno;
    }

    /**
     * @param AMaterno the AMaterno to set
     */
    public void setAMaterno(String AMaterno) {
        this.AMaterno = AMaterno;
    }

    /**
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
   
    
}
