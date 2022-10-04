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
/**
 *
 * @author Francisco
 */
public class ArchivoProducto {
    static String data = "src/archivos/productos.txt";
   
    public static void crearArchivos(ArrayList lista){  
        System.out.println("Entrando a Archivo...........");
    FileWriter flwriter = null;
        try{
            flwriter = new FileWriter(data);
            
             BufferedWriter bfwriter = new BufferedWriter(flwriter);
             for(Producto producto: (ArrayList<Producto>)lista){
                  bfwriter.write(producto.getDisponible()+","+producto.getCodigo()+","+producto.getNombreArtic()+","+ producto.getDescripcion()
                    +","+producto.getNoArticulos()+","+producto.getPrecio()+","+"\n");
                   
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
    ArrayList listaProductos = new ArrayList();
    Scanner scanner;
    try{
       scanner = new Scanner(file);
       while(scanner.hasNextLine()){
           String linea = scanner.nextLine();
           Scanner delimitar = new Scanner(linea);
           delimitar.useDelimiter("\\s*,\\s*");
           
           Producto e = new Producto();
           
           e.setDisponible(delimitar.next());
           e.setCodigo(delimitar.nextInt());
           e.setNombreArtic(delimitar.next());
           e.setDescripcion(delimitar.next());
           e.setNoArticulos(delimitar.nextInt());
           e.setPrecio(delimitar.nextFloat());
           
           
           
           listaProductos.add(e);
           
       }
       scanner.close();
       
    }catch(FileNotFoundException e){
          e.printStackTrace();
    }
       
    return listaProductos;
    
    }
    
    public static void aniadirArchivo (ArrayList lista){
    FileWriter flwriter = null;
    try{
         flwriter = new FileWriter(data, true);
             BufferedWriter bfwriter = new BufferedWriter(flwriter);
             for(Producto producto: (ArrayList<Producto>)lista){
                  bfwriter.write(producto.getDisponible()+","+producto.getCodigo()+","+producto.getNombreArtic()+","+ producto.getDescripcion()
                    +","+producto.getNoArticulos()+","+producto.getPrecio()+","+"\n");
                   
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
    
    
    public static void ModificarTabla(ArrayList lista){
         FileWriter flwriter = null;
    try{
         flwriter = new FileWriter(data);
             BufferedWriter bfwriter = new BufferedWriter(flwriter);
             for(Producto producto: (ArrayList<Producto>)lista){
                  bfwriter.write(producto.getDisponible()+","+producto.getCodigo()+","+producto.getNombreArtic()+","+ producto.getDescripcion()
                    +","+producto.getNoArticulos()+","+producto.getPrecio()+","+"\n");
                   
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
    
    public static void Modificardat(int cod,int cant){
        ArrayList lista=leerArchivo();FileWriter flwriter = null;
        try{
            
            flwriter=new FileWriter(data);//true se puede agregar mas informacion
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
            for(Producto producto:(ArrayList<Producto>)lista){
            System.out.println("Codigo: "+producto.getCodigo());
            System.out.println("Nombre:"+producto.getNombreArtic());
            if(cod==producto.getCodigo()){
                System.out.println("fedrf");
                System.out.println("Codigo: "+producto.getCodigo());
                System.out.println("Nombre:"+producto.getNombreArtic());
                System.out.println("No. Articulos: "+producto.getNoArticulos());
                System.out.println("Precio: "+producto.getPrecio());
                System.out.println("cont:"+cant);
                cant=producto.getNoArticulos()-cant;
                producto.setNoArticulos(cant);
                System.out.println("No. Articulosdesp: "+producto.getNoArticulos());
            }
            
            bfwriter.write(producto.getDisponible()+","+producto.getCodigo()+","+producto.getNombreArtic()+","+ producto.getDescripcion()
                    +","+producto.getNoArticulos()+","+producto.getPrecio()+","+"\n");
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
        
        }}
    
    
}

