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

public class OperaArchivosAdmin {
     static String data="src/archivos/Administradores.txt";
     static int num=1;
    
    public static void crearArchivoad(ArrayList listaad){
        FileWriter flwriter = null;
        try{
        
            flwriter=new FileWriter(data);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
            for (Administrativo admin: (ArrayList<Administrativo>)listaad){
                bfwriter.write(admin.getNombre()+ ","+admin.getApellidoPaterno()+ ","+admin.getApellidoMaterno()
                        +","+admin.getTelefono()+","+admin.getPuesto()+ ","+admin.getSueldo()
                        +","+admin.getDiasDescanso()+","+admin.getUsuario()+
                        ","+admin.getObservaciones()+","+admin.getContrasenia()+"\n");
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
                Administrativo a=new Administrativo();         
                a.setNombre(delimitar.next());
                a.setApellidoPaterno(delimitar.next());
                a.setApellidoMaterno(delimitar.next());
                a.setTelefono(delimitar.nextInt());
                a.setPuesto(delimitar.next());
                a.setSueldo(delimitar.nextFloat());
                a.setDiasDescanso(delimitar.nextInt());
                a.setUsuario(delimitar.next());
                a.setObservaciones(delimitar.next());
                a.setContrasenia(delimitar.next());
                listaad.add(a);
              
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return listaad;
    }
     
     
    
    public static void aniadirArchivoad(ArrayList listaad){
        FileWriter flwriter = null;
        try{
        
            flwriter=new FileWriter(data,true);//true se puede agregar mas informacion
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
           for (Administrativo admin: (ArrayList<Administrativo>)listaad){
                System.out.println("Nombre: "+admin.getNombre());
                bfwriter.write(admin.getNombre()+ ","+admin.getApellidoPaterno()+ ","+admin.getApellidoMaterno()
                        +","+admin.getTelefono()+","+admin.getPuesto()+ ","+admin.getSueldo()
                        +","+admin.getDiasDescanso()+","+admin.getUsuario()+","+admin.getObservaciones()+","+admin.getContrasenia()+"\n");
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
    
    
    public static void Modificar(ArrayList listaad){
        FileWriter flwriter = null;
        try{
        
            flwriter=new FileWriter(data);//true se puede agregar mas informacion
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
           for (Administrativo admin: (ArrayList<Administrativo>)listaad){
                System.out.println("Nombre: "+admin.getNombre());
                bfwriter.write(admin.getNombre()+ ","+admin.getApellidoPaterno()+ ","+admin.getApellidoMaterno()
                        +","+admin.getTelefono()+","+admin.getPuesto()+ ","+admin.getSueldo()
                        +","+admin.getDiasDescanso()+","+admin.getUsuario()+","+admin.getObservaciones()+","+admin.getContrasenia()+"\n");
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
