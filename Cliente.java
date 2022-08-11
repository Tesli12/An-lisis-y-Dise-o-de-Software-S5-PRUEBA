
package proyecto.tienda.de.refacciones.Clases;

public class Cliente extends Persona{
    
    protected int Folio;
    protected String general;
    
    public Cliente(){}

    public Cliente(int Folio, String general, String Nombre, String ApellidoPaterno, String ApellidoMaterno, String CorreoElectronico, int Telefono) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, CorreoElectronico, Telefono);
        this.Folio = Folio;
        this.general= general;
    }

  

    /**
     * @return the Folio
     */
    public int getFolio() {
        return Folio;
    }

    /**
     * @param Folio the Folio to set
     */
    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    /**
     * @return the general
     */
    public String getGeneral() {
        return general;
    }

    /**
     * @param general the general to set
     */
    public void setGeneral(String general) {
        this.general = general;
    }
    
}
