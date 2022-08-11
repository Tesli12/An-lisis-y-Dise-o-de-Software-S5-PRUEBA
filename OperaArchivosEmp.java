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

public class OperaArchivosEmp {
    static String data="src/archivos/Empleados.txt";
    
    
    public static void crearArchivoem(ArrayList listaemp){
        FileWriter flwriter = null;
        try{
        
            flwriter=new FileWriter(data);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
          
            for(Vendedor vend:(ArrayList<Vendedor>)listaemp){
                bfwriter.write(vend.getNombre()+ ","+ vend.getApellidoPaterno()+
                        ","+vend.getApellidoMaterno()+","+vend.getTelefono()+","+vend.getPuesto()+
                        ","+vend.getSueldo()+","+vend.getDiasDescanso()+","
                        +vend.getUsuario()+","+vend.getObservaciones()+","+vend.getContrasenia()+"\n");
                
            
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
    
     
    
     public static ArrayList leerArchivoem(){
        File file = new File (data);
        
        ArrayList listaemp =  new ArrayList();
        Scanner scanner;
        try{
            scanner = new Scanner (file);
            while(scanner.hasNextLine()){
                String linea =scanner.nextLine();
                
                Scanner delimitar =new Scanner (linea);
                delimitar.useDelimiter("\\s*,\\s*");
                Vendedor v=new Vendedor();
                v.setNombre(delimitar.next());
                v.setApellidoPaterno(delimitar.next());
                v.setApellidoMaterno(delimitar.next());
                v.setTelefono(delimitar.nextInt());
                v.setPuesto(delimitar.next());
                v.setSueldo(delimitar.nextFloat());
                v.setDiasDescanso(delimitar.nextInt());
                v.setUsuario(delimitar.next());
                v.setObservaciones(delimitar.next());
                v.setContrasenia(delimitar.next());
               listaemp.add(v);
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return listaemp;
    }
     
    
    public static void aniadirArchivoem(ArrayList listaemp){
        FileWriter flwriter = null;
        try{
        
            flwriter=new FileWriter(data,true);//true se puede agregar mas informacion
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
          
            for(Vendedor vend:(ArrayList<Vendedor>)listaemp){
                bfwriter.write(vend.getNombre()+ ","+ vend.getApellidoPaterno()+
                        ","+vend.getApellidoMaterno()+","+vend.getTelefono()+","+vend.getPuesto()+
                        ","+vend.getSueldo()+","+vend.getDiasDescanso()+","
                        +vend.getUsuario()+","+vend.getObservaciones()+","+vend.getContrasenia()+"\n");
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

    
    public static void Modificar(ArrayList listaemp){
         FileWriter flwriter = null;
        try{
        
            flwriter=new FileWriter(data);//true se puede agregar mas informacion
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
          
            for(Vendedor vend:(ArrayList<Vendedor>)listaemp){
                bfwriter.write(vend.getNombre()+ ","+ vend.getApellidoPaterno()+
                        ","+vend.getApellidoMaterno()+","+vend.getTelefono()+","+vend.getPuesto()+
                        ","+vend.getSueldo()+","+vend.getDiasDescanso()+","
                        +vend.getUsuario()+","+vend.getObservaciones()+","+vend.getContrasenia()+"\n");
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
