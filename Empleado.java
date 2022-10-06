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
public abstract class  Empleado extends Usuario {
    private String ID_Empleado;
    private String Contrasenia;
    private float Sueldo;
    private String Puesto;
    private String Rol;
    private String Observaciones;
    
    
    Empleado(String ID_Empleado, String Contrasenia, float Sueldo, String Puesto, String Observaciones , String Rol, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String CorreoElectronico, int Telefono) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, CorreoElectronico, Telefono);
        this.ID_Empleado =ID_Empleado;
        this.Contrasenia = Contrasenia;
        this.Sueldo = Sueldo;
        this.Puesto = Puesto;
        this.Rol=Rol;
        this.Observaciones = Observaciones;
    }

    /**
     * @return the ID_Empleado
     */
    public String getID_Empleado() {
        return ID_Empleado;
    }

    /**
     * @param ID_Empleado the ID_Empleado to set
     */
    public void setID_Empleado(String ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
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
     * @return the Puesto
     */
    public String getPuesto() {
        return Puesto;
    }

    /**
     * @param Puesto the Puesto to set
     */
    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
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
