/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_denuarchirinos;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Denuar
 */
public class AdminTecnicos {
    private ArrayList<Tecnico> tecnicos = new ArrayList();
    private File archivo = null;

    public AdminTecnicos(String path) {
        archivo = new File(path);
    }
    

    public ArrayList<Tecnico> getListaTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministradorTecnicos{" + "tecnicos=" + tecnicos + '}';
    }
    //modificador extra:
    public void setTecnico(Tecnico p){
        this.tecnicos.add(p);
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
        fw = new FileWriter(archivo,true);//"true" hace que añada a la informacion que ya tengo guardada
        bw = new BufferedWriter(fw);
        for (Tecnico t : tecnicos) {
            bw.write(t.getNombre()+";");
            bw.write(t.getEdad()+";");
            bw.write(t.getGenero()+";");
            bw.write(t.getCantidad()+";");
            
        }
        bw.flush();
        }
        catch(Exception e){
            
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo(){
        Scanner sc = null;
        tecnicos=new ArrayList();
        if(archivo.exists()){
            try{
                sc=new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    tecnicos.add(new Tecnico(sc.next(),sc.next(),sc.next(), sc.nextInt()));
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            sc.close();
        }
    }  
    
    public void SobreEscribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
        fw = new FileWriter(archivo,false);//"true" hace que añada a la informacion que ya tengo guardada
        bw = new BufferedWriter(fw);
        for (Tecnico t : tecnicos) {
            bw.write(t.getNombre()+";");
            bw.write(t.getEdad()+";");
            bw.write(t.getGenero()+";");
            bw.write(t.getCantidad()+";");
            
        }
        bw.flush();
        }
        catch(Exception e){
            
        }
        bw.close();
        fw.close();
    }
}
