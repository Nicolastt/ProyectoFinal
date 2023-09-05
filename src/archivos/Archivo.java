package archivos;

import model.HoraFecha;
import model.Estudiante;

import java.io.*;

public class Archivo {

    public void escribirArchivo(Estudiante est, HoraFecha horaF, String text){

        String ruta = ".\\ArchivosEscritos\\archivoNormal.txt";
        File fl1 = new File(ruta);

        try {
            FileWriter fr1 = new FileWriter(fl1);
            BufferedWriter bw1 = new BufferedWriter(fr1);

            bw1.write(est.toString());
            bw1.newLine();
            bw1.write(horaF.registrarFecha());
            bw1.newLine();
            bw1.write(text);
            bw1.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
