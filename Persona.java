
package proyecto.tienda.de.refacciones.Clases;

public abstract class Persona {
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String CorreoElectronico;
    private int Telefono;
    
    public Persona(){}
     Persona(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String CorreoElectronico, int Telefono) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.CorreoElectronico = CorreoElectronico;
        this.Telefono = Telefono;
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
     * @return the ApellidoPaterno
     */
    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    /**
     * @param ApellidoPaterno the ApellidoPaterno to set
     */
    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    /**
     * @return the ApellidoMaterno
     */
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    /**
     * @param ApellidoMaterno the ApellidoMaterno to set
     */
    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    /**
     * @return the CorreoElectronico
     */
    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    /**
     * @param CorreoElectronico the CorreoElectronico to set
     */
    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
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
    
}
