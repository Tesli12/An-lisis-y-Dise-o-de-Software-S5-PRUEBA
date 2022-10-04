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
import proyecto.tienda.de.refacciones.Clases.*;
import java.util.ArrayList;
import java.util.Scanner;

import static proyecto.tienda.de.refacciones.ArchivoProdTicket.data;

/**
 *
 * @author katty
 */
public class ArchivoProdTicket {
    static String data="src/archivos/TicketDeCompra/Productos.txt";
     
    
    public static void crearArchivoad(ArrayList listaprod){
        FileWriter flwriter = null;
        try{
        
            flwriter=new FileWriter(data);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
            for (TicketDCompra tick: (ArrayList<TicketDCompra>)listaprod){
                
                bfwriter.write(tick.getFolio()+","+tick.getNumeroArt()+","+tick.getArticulos()+",\n");
                
                
            }
           
            bfwriter.close();
            System.out.println("Archivo se ha creado satisfactoriamente");
        }catch(IOException e){
            
            e.printStackTrace();
            
        }finally{
            if(flwriter !=null){
                try{
                    flwriter.close();
                    
                }catch (IOException e){
                    
                    e.printStackTrace();
                }
            }
        
        }
    }
    
     public static ArrayList leerArchivoad(){
        File file = new File (data);
        ArrayList listaad =  new ArrayList();
       
       Scanner scanner;
        try{
            scanner = new Scanner (file);
            while(scanner.hasNext() ){
                String linea =scanner.nextLine();
    
                Scanner delimitar =new Scanner (linea);
                delimitar.useDelimiter("\\s*,\\s*");
                TicketDCompra a=new TicketDCompra(); 
                a.setFolio(delimitar.nextInt());
                a.setNumeroArt(delimitar.nextInt());
                a.setArticulos(delimitar.next());
                a.setTotal(delimitar.nextFloat());
                
                listaad.add(a);
              
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return listaad;
    }
     

     
    
    public static void aniadirArchivo(ArrayList listaprod){
        FileWriter flwriter = null;
        try{
        
            flwriter=new FileWriter(data,true);//true se puede agregar mas informacion
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
           for (TicketDCompra tick: (ArrayList<TicketDCompra>)listaprod){

                bfwriter.write(tick.getFolio()+","+tick.getNumeroArt()+","+tick.getArticulos()+","+tick.getTotal()+",\n");
            }
           
            
            
            bfwriter.close();
            System.out.println("Archivo se ha creado satisfactoriamente");
        }catch(IOException e){
            
            e.printStackTrace();
            
        }finally{
            if(flwriter !=null){
                try{
                    flwriter.close();
                    
                }catch (IOException e){
                    
                    e.printStackTrace();
                }
            }
        
        }
        
    }
    
}





