/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_denuarchirinos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Denuar
 */
public class AdminCompusFallidas {
    private ArrayList<Computadora> computadoras = new ArrayList();
    private File archivo = null;

    public AdminCompusFallidas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Computadora> getListaComputadoras() {
        return computadoras;
    }

    public void setListapersonas(ArrayList<Computadora> computadoras) {
        this.computadoras = computadoras;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministradorComputadoras{" + "computadoras=" + computadoras + '}';
    }
    //modificador extra:
    public void setComputadora(Computadora p){
        this.computadoras.add(p);
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
        fw = new FileWriter(archivo,true);//"true" hace que añada a la informacion que ya tengo guardada
        bw = new BufferedWriter(fw);
        for (Computadora t : computadoras) {
            bw.write(t.getSerie()+";");
            bw.write(t.getAño()+";");
            bw.write(t.getColor()+";");
            bw.write(t.getMaterial()+";");
            bw.write(t.getParte().getTiempo()+";");
            bw.write(t.getParte().getRam()+";");
            bw.write(t.getParte().getHdd()+";");
            bw.write(t.getParte().getBateria()+";");
            bw.write(t.getParte().getTeclado()+";");
            bw.write(t.getParte().getPantalla()+";");
            bw.write(t.getParte().getProcesador()+";");
        }
        bw.flush();
        }
        catch(Exception e){
            
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo(){
        System.out.println("cargando archivo");
        Scanner sc = null;
        int tiempo = 0;
        String serie, año, color, material, ram, hdd, bateria, teclado, pantalla, procesador;
        computadoras=new ArrayList();
        Parte parte = new Parte();
        if(archivo.exists()){
            try{
                sc=new Scanner(archivo);
                sc.useDelimiter(";");
                System.out.println("hello");
                while(sc.hasNext()){    
                    System.out.println("buye");
                    serie=sc.next();
                    System.out.println(serie);
                    año = sc.next();
                    System.out.println(año);
                    color = sc.next();
                    System.out.println(color);
                    material = sc.next();
                    System.out.println(material);
                    tiempo = sc.nextInt();
                    System.out.println(tiempo);
                    ram = sc.next();
                    System.out.println(ram);
                    hdd = sc.next();
                    System.out.println(hdd);
                    bateria = sc.next();
                    System.out.println(bateria);
                    teclado = sc.next();
                    System.out.println(teclado);
                    pantalla = sc.next();
                    System.out.println(pantalla);
                    procesador =sc.next();
                    System.out.println(procesador);
                    parte = new Parte(tiempo, ram, hdd, bateria, teclado, pantalla, procesador);
                    computadoras.add(new Computadora(serie, año, color, material, parte));                 
                                    System.out.println("tamaño: " + computadoras.size());

                }
                System.out.println("tamaño: " + computadoras.size());
                for (int i = 0; i < computadoras.size(); i++) {
                    System.out.print("serie: " + computadoras.get(i).getSerie());
                    System.out.println("tiempo: " + computadoras.get(i).getParte().getTiempo());
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            sc.close();
        }
    }  
}
