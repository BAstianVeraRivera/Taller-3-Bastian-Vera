import java.io.File;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GestorDatos {
    public static Vendedor leerArchivoVendedor(Venta venta,String direccion){
        String texto = " ";
        try{
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                venta.getVendedores().add(new Vendedor (data[0],data[1],data[2],data[3],data[4]));
            }
        }catch(Exception e){
            System.err.println("No se encontró el archivo");
        }
        return null;
    }
    public static Cliente leerArchivoCliente(Venta venta,String direccion){
        String texto = " ";
        try{
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                venta.getClientes().add(new Cliente (data[0],data[1],data[2]));
            }
        }catch(Exception e){
            System.err.println("No se encontró el archivo");
        }
        return null;
    }
    public static Inmueble leerArchivoInmubele(Venta venta,String direccion){
        String texto = " ";
        try{
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            while((texto = br.readLine()) != null){
                String[] data = texto.split(",");
                venta.getInmubeles().add(new Inmueble (data[0],data[1],data[2]));
            }
        }catch(Exception e){
            System.err.println("No se encontró el archivo");
        }
        return null;
    }

    public static boolean registrarDatos(List objetos, String direccionArchivo) {
        try {
            File file = new File(direccionArchivo);
            if (Files.deleteIfExists(Paths.get("Ruta Archivo"))) {
                System.out.println("El fichero ha sido borrado satisfactoriamente");
            } else {
                System.out.println("El fichero no puede ser borrado");
            }
            File fichero = new File(direccionArchivo);
            fichero.createNewFile();
            FileWriter fw = new FileWriter(fichero, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Object objeto : objetos) {
                bw.write(objeto.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
