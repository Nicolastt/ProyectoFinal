package archivos;

import model.HoraFecha;
import model.Estudiante;
import model.Persona;

import java.io.*;

public class ArchivoSerializable {

    private final Archivo archivo = new Archivo();

    private FileOutputStream fileOP = null;
    private ObjectOutputStream objectOP = null;

    public void escribirArchivoSerial(Persona persona, HoraFecha horaFecha, String texto) {
        //String ruta = ".\\ArchivosEscritos\\archivoSerial.txt";
        String ruta = "C:\\Users\\Usuario\\Documents\\WorkSpace\\ProyectoFinal\\ArchivosEscritos\\archivoSerial.txt";
        File fl = new File(ruta);

        try {
            FileOutputStream fileOP = new FileOutputStream(fl);
            ObjectOutputStream objectOP = new ObjectOutputStream(fileOP);

            objectOP.writeObject(persona);
            objectOP.writeObject(horaFecha);
            objectOP.writeObject(texto);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (objectOP != null) {
                    objectOP.close();
                }
                if (fileOP != null) {
                    fileOP.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        leerArchivoSerial();
    }

    public void leerArchivoSerial() {
        //String ruta = ".\\ArchivosEscritos\\archivoSerial.txt";
        String ruta = "C:\\Users\\Usuario\\Documents\\WorkSpace\\ProyectoFinal\\ArchivosEscritos\\archivoSerial.txt";
        File fl = new File(ruta);

        try {
            FileInputStream fileIN = new FileInputStream(fl);
            ObjectInputStream objectIN = new ObjectInputStream(fileIN);

            Estudiante estudiante = (Estudiante) objectIN.readObject();
            HoraFecha horaFecha = (HoraFecha) objectIN.readObject();
            String texto = (String) objectIN.readObject();

            archivo.escribirArchivo(estudiante, horaFecha, texto);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
