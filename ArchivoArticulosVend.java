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




public class ArchivoArticulosVend {
    static String data="src/archivos/ProductosVendidos.txt";
    int cont;  
    
    public static void crearArchivoad(ArrayList listaprod){
        FileWriter flwriter = null;
        try{
        
            flwriter=new FileWriter(data);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
            for (Producto p: (ArrayList<Producto>)listaprod){
                
                bfwriter.write(p.getCodigo()+","+p.getNombreArtic()+","+p.getNoArticulos()+","+p.getPrecio()+",\n");
                
                
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
    
    public  static ArrayList leerArchivoad(){
        File file = new File(data);
        ArrayList listaad=new ArrayList<>();
        Scanner scanner;
        try{
           scanner = new Scanner(file);
           while(scanner.hasNextLine()){
               String linea = scanner.nextLine();
               Scanner delimitar = new Scanner(linea);
               delimitar.useDelimiter("\\s*,\\s*");

               Producto c=new Producto();

                c.setCodigo(delimitar.nextInt());
                c.setNombreArtic(delimitar.next());
                c.setNoArticulos(delimitar.nextInt());
                c.setPrecio(delimitar.nextFloat());

               listaad.add(c);

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
            
           for (Producto p: (ArrayList<Producto>)listaprod){
                
                bfwriter.write(p.getCodigo()+","+p.getNombreArtic()+","+p.getNoArticulos()+","+p.getPrecio()+",\n");
                
                
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
    
    
    public static void Modificar(int cont,int cod){
        ArrayList listaad=leerArchivoad();FileWriter flwriter = null;
        
        System.out.println("entor");
        try{
            
            flwriter=new FileWriter(data);//true se puede agregar mas informacion
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
            for(Producto a:(ArrayList<Producto>)listaad){
            System.out.println("Codigo: "+a.getCodigo());
            System.out.println("Nombre:"+a.getNombreArtic());
            if(cod==a.getCodigo()){
                System.out.println("fedrf");
                System.out.println("Codigo: "+a.getCodigo());
                System.out.println("Nombre:"+a.getNombreArtic());
                System.out.println("No. Articulos: "+a.getNoArticulos());
                System.out.println("Precio: "+a.getPrecio());
                System.out.println("cont:"+cont);
                cont+=a.getNoArticulos();
                a.setNoArticulos(cont);
                System.out.println("No. Articulosdesp: "+a.getNoArticulos());
            }
            
            bfwriter.write(a.getCodigo()+","+a.getNombreArtic()+","+a.getNoArticulos()+","+a.getPrecio()+",\n");
            System.out.println("Agregado");
        }
            bfwriter.close();bfwriter.close();
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
      
    

