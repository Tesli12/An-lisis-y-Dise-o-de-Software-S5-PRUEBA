/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadeabarrotes_Clases;

/**
 *  
 * @author Dell
 */
public abstract class  Administrativo extends Usuario  {
     private String ID_Admin;
    private String Contrasenia;
    private float Sueldo;
    private String Jerarquia;
    private String Rol;
    private String Observaciones;
    
    
    Administrativo (String ID_Empleado, String Contrasenia, float Sueldo, String Puesto, String Observaciones , String Rol, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String CorreoElectronico, int Telefono) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, CorreoElectronico, Telefono);
        this.ID_Admin =ID_Empleado;
        this.Contrasenia = Contrasenia;
        this.Sueldo = Sueldo;
        this.Jerarquia = Puesto;
        this.Rol=Rol;
        this.Observaciones = Observaciones;
    }
    
    /**
     * @return the ID_Admin
     */
    public String getID_Admin() {
        return ID_Admin;
    }

    /**
     * @param ID_Admin the ID_Admin to set
     */
    public void setID_Admin(String ID_Admin) {
        this.ID_Admin = ID_Admin;
    }

    /**
     * @return the Contrasenia
     */
    public String getContrasenia() {
        return Contrasenia;
    }

    /**
     * @param Contrasenia the Contrasenia to set
     */
    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    /**
     * @return the Sueldo
     */
    public float getSueldo() {
        return Sueldo;
    }

    /**
     * @param Sueldo the Sueldo to set
     */
    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }

    

    /**
     * @return the Jerarquia
     */
    public String getJerarquia() {
        return Jerarquia;
    }

    /**
     * @param Jerarquia the Jerarquia to set
     */
    public void setJerarquia(String Jerarquia) {
        this.Jerarquia = Jerarquia;
    }

    /**
     * @return the Rol
     */
    public String getRol() {
        return Rol;
    }

    /**
     * @param Rol the Rol to set
     */
    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    /**
     * @return the Observaciones
     */
    public String getObservaciones() {
        return Observaciones;
    }

    /**
     * @param Observaciones the Observaciones to set
     */
    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
}
