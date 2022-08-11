
package proyecto.tienda.de.refacciones.Clases;

public class TicketDCompra {
    /*Clase para imprimir el Ticket de compra
    De los clientes,donde se indicara el numero de Articulos
    El producto que se llevaron y cuanto es el total a Pagar
    
   */
    private int num;
    private int folio;
    private int numeroArt;//Variable para numero de Articulos
    private float Total;//VariableTotal de la compra despues del descuento
    private float SubTotal;//Subtotal
    private String  Articulos;//Variable con el nombre del Producto que se compra
    
    public TicketDCompra(){}//Contructor
    //Constructor

    //Se establecen los getters y los setters de cada una de las variables

    public TicketDCompra(int num, int numeroArt, float Total, float SubTotal, String Articulos,int folio) {
        this.num = num;
        this.numeroArt = numeroArt;
        this.Total = Total;
        this.SubTotal = SubTotal;
        this.Articulos = Articulos;
        this.folio=folio;
    }
  
   
    /**
     * @return the Total
     */
    public float getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(float Total) {
        this.Total = Total;
    }

    /**
     * @return the SubTotal
     */
    public float getSubTotal() {
        return SubTotal;
    }

    /**
     * @param SubTotal the SubTotal to set
     */
    public void setSubTotal(float SubTotal) {
        this.SubTotal = SubTotal;
    }

  
   
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the numeroArt
     */
    public int getNumeroArt() {
        return numeroArt;
    }

    /**
     * @param numeroArt the numeroArt to set
     */
    public void setNumeroArt(int numeroArt) {
        this.numeroArt = numeroArt;
    }

    /**
     * @return the Articulos
     */
    public String getArticulos() {
        return Articulos;
    }

    /**
     * @param Articulos the Articulos to set
     */
    public void setArticulos(String Articulos) {
        this.Articulos = Articulos;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }
    
    
}
