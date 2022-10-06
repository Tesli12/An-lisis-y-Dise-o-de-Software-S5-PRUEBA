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
public class Producto extends Provedor {
    private String Estado;
    private int Cantidad;
    private String NombreP;
    private String Descripcion;
    private float Precio;
    private int ID_Procucto;
    
    public Producto(String ID_Provedor,String Nombre,String APaterno,String AMaterno,int Telefono,String Correo){
    super(ID_Provedor,Nombre,APaterno,AMaterno,Telefono,Correo);
    
    
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the NombreP
     */
    public String getNombreP() {
        return NombreP;
    }

    /**
     * @param NombreP the NombreP to set
     */
    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
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
     * @return the ID_Procucto
     */
    public int getID_Procucto() {
        return ID_Procucto;
    }

    /**
     * @param ID_Procucto the ID_Procucto to set
     */
    public void setID_Procucto(int ID_Procucto) {
        this.ID_Procucto = ID_Procucto;
    }
    
    
}
