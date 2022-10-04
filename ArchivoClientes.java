/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tienda.de.refacciones;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import proyecto.tienda.de.refacciones.Clases.*;

public class ArchivoClientes {
    static String data = "src/archivos/TicketDeCompra/Clientes.txt";
   
    public static void crearArchivos(ArrayList lista){  
    FileWriter flwriter = null;
        try{
            flwriter = new FileWriter(data);
            
             BufferedWriter bfwriter = new BufferedWriter(flwriter);
             for(Cliente cliente: (ArrayList<Cliente>)lista){
                  bfwriter.write(cliente.getNombre()+","+cliente.getApellidoPaterno()+","+cliente.getApellidoMaterno()+","+cliente.getTelefono()+","+
                          cliente.getCorreoElectronico()+","+cliente.getFolio()+","+cliente.getGeneral()+","+"\n");
                   
             }
             bfwriter.close();
             System.out.println("Archivo creado con exito......");
             
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(flwriter != null){
                try{
                  flwriter.close();   
                }catch(IOException e){
                  e.printStackTrace();
                }     
            }
        }
    }
    
    
    
    public static ArrayList leerArchivo(){
    File file = new File(data);
    ArrayList listaClientes = new ArrayList();
    Scanner scanner;
    try{
       scanner = new Scanner(file);
       while(scanner.hasNextLine()){
           String linea = scanner.nextLine();
           Scanner delimitar = new Scanner(linea);
           delimitar.useDelimiter("\\s*,\\s*");
           
           Cliente c = new Cliente();
           
           c.setNombre(delimitar.next());
           c.setApellidoPaterno(delimitar.next());
           c.setApellidoMaterno(delimitar.next());
           c.setTelefono(delimitar.nextInt());
           c.setCorreoElectronico(delimitar.next());
           c.setFolio(delimitar.nextInt());
           c.setGeneral(delimitar.next());
           
           listaClientes.add(c);
           
       }
       scanner.close();
       
    }catch(FileNotFoundException e){
          e.printStackTrace();
    }
       
    return listaClientes;
    
    }
    
    public static void aniadirArchivo (ArrayList lista){
    FileWriter flwriter = null;
    try{
         flwriter = new FileWriter(data, true);
             BufferedWriter bfwriter = new BufferedWriter(flwriter);
             for(Cliente cliente: (ArrayList<Cliente>)lista){
                  bfwriter.write(cliente.getNombre()+","+cliente.getApellidoPaterno()+","+cliente.getApellidoMaterno()+","+cliente.getTelefono()+","+
                          cliente.getCorreoElectronico()+","+cliente.getFolio()+","+cliente.getGeneral()+","+"\n");
                   
             }
             bfwriter.close();
             System.out.println("Archivo creado con exito......");
             
    }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(flwriter != null){
                try{
                  flwriter.close();   
                }catch(IOException e){
                  e.printStackTrace();
                }     
            }
        }
    }
    
    public static void Modificar (ArrayList lista){
         FileWriter flwriter = null;
    try{
         flwriter = new FileWriter(data);
             BufferedWriter bfwriter = new BufferedWriter(flwriter);
             for(Cliente cliente: (ArrayList<Cliente>)lista){
                  bfwriter.write(cliente.getNombre()+","+cliente.getApellidoPaterno()+","+cliente.getApellidoMaterno()+","+cliente.getTelefono()+","+
                          cliente.getCorreoElectronico()+","+cliente.getFolio()+","+cliente.getGeneral()+","+"\n");
                   
             }
             bfwriter.close();
             System.out.println("Archivo creado con exito......");
             
    }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(flwriter != null){
                try{
                  flwriter.close();   
                }catch(IOException e){
                  e.printStackTrace();
                }     
            }
        }
        
        
        
    }
    
    
    
}
