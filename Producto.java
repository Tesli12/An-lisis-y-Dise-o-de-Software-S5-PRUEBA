
package proyecto.tienda.de.refacciones.Clases;

public class Producto {
    private String Disponible;
    private int NoArticulos;
    private String NombreArtic;
    private String Descripcion;
    private float Precio;
    private int codigo;
    
    public Producto(){}

    Producto(String Disponible, int NoArticulos, String NombreArtic, String Descripcion, float Precio,int codigo) {
        this.Disponible = Disponible;
        this.NoArticulos = NoArticulos;
        this.NombreArtic = NombreArtic;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.codigo=codigo;
    }

    /**
     * @return the Disponible
     */
    public String getDisponible() {
        return Disponible;
    }

    /**
     * @param Disponible the Disponible to set
     */
    public void setDisponible(String Disponible) {
        this.Disponible = Disponible;
    }

    /**
     * @return the NoArticulos
     */
    public int getNoArticulos() {
        return NoArticulos;
    }

    /**
     * @param NoArticulos the NoArticulos to set
     */
    public void setNoArticulos(int NoArticulos) {
        this.NoArticulos = NoArticulos;
    }

    /**
     * @return the NombreArtic
     */
    public String getNombreArtic() {
        return NombreArtic;
    }

    /**
     * @param NombreArtic the NombreArtic to set
     */
    public void setNombreArtic(String NombreArtic) {
        this.NombreArtic = NombreArtic;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Precio
     */
    public float getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
