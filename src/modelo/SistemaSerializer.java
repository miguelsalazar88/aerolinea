package modelo;

import java.io.*;

public class SistemaSerializer {

    public SistemaSerializer() {
    }

    public static void guardarCambios(SistemaSingleton instancia){
        String rutaArchivo = "src/db/sistema.dat";
        try{
            FileOutputStream fileOut = new FileOutputStream(rutaArchivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(instancia);
            out.close();
            fileOut.close();
            System.out.println("Se ha guardado el Sistema en el Archivo");

        } catch (IOException e){
            System.out.println("Error al guardar el Objeto: " + e.getMessage());
        }
    }

    public static SistemaSingleton recuperarSistema(){
        String rutaArchivo = "src/db/sistema.dat";
        SistemaSingleton instancia = null;
        try{
            FileInputStream fileIn = new FileInputStream(rutaArchivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            instancia = (SistemaSingleton) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
        return instancia;
    }

}
