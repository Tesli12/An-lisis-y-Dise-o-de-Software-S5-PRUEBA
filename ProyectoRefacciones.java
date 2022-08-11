
package proyecto.tienda.de.refacciones.Interfaces;


import java.util.ArrayList;
import javax.swing.JOptionPane;
//import static proyecto.tienda.de.refacciones.AgregarEmp.listaad;
//import static proyecto.tienda.de.refacciones.AgregarEmp.listaemp;
import proyecto.tienda.de.refacciones.*;
import proyecto.tienda.de.refacciones.Clases.*;


public class ProyectoRefacciones {
    static int cont,nusad,nusus; static int tip;
    static Administrativo objadmin[] =new Administrativo [5];
    static Vendedor objvend [] = new Vendedor [50];ArrayList listaad=new ArrayList<>();
    ArrayList listaemp=new ArrayList<>();
    public ProyectoRefacciones(){
        
        
        
    }
    
    public int SistemaLogin(String usuario,String pasw){
        listaad=OperaArchivosAdmin.leerArchivoad();
        listaemp=OperaArchivosEmp.leerArchivoem();
    
        
        for (Administrativo admin: (ArrayList<Administrativo>)listaad){
             
              
                 System.out.println("Usuario: "+admin.getUsuario()+" Contrase;a: "+admin.getContrasenia() );
                if (usuario.equals(admin.getUsuario()) && pasw.equals(admin.getContrasenia())){
                   
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                    tip=1;
                    
                }
            }
         
        for(Vendedor vend:(ArrayList<Vendedor>)listaemp){
            
            if(usuario == null ? vend.getUsuario() == null : usuario.equals(vend.getUsuario())){
                
            }
            if ((usuario.equals(vend.getUsuario())) && (pasw.equals(vend.getContrasenia()))){
                
                    
                    JOptionPane.showMessageDialog(null, "Bienvenido Vendedor");
                    tip=2;
            }
                
        }
        System.out.println("tip="+tip);
          
        return tip;
    }
    
    public static void main(String[] args) {
            
            
            
            Login log =new Login();
            log.setVisible(true); 
    }

   

 
    
}
