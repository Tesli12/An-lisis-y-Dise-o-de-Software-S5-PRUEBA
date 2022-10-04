
package proyecto.tienda.de.refacciones.Clases;

public abstract class Empleado extends Persona {
    private String Usuario;
    private String Contrasenia;
    private float Sueldo;
    private int DiasDescanso;
    private String Puesto;
    private String Observaciones;
    
    public Empleado(){
       this.Usuario=null;
       this.Contrasenia=null;
       this.DiasDescanso=0;
       this.Sueldo=0;
       this.Puesto=null;
       this.Observaciones=null;
    
    
    }

     Empleado(String Usuario, String Contrasenia, float Sueldo, int DiasDescanso, String Puesto
            , String Observaciones, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String CorreoElectronico, int Telefono) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, CorreoElectronico, Telefono);
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Sueldo = Sueldo;
        this.DiasDescanso = DiasDescanso;
        this.Puesto = Puesto;
        this.Observaciones = Observaciones;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
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
     * @return the DiasDescanso
     */
    public int getDiasDescanso() {
        return DiasDescanso;
    }

    /**
     * @param DiasDescanso the DiasDescanso to set
     */
    public void setDiasDescanso(int DiasDescanso) {
        this.DiasDescanso = DiasDescanso;
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
