import java.io.IOException;

public class Launcher {
    public static void main(String[] args) {
        inicializar();
    }

    public static void inicializar() {
        Venta venta1 = new Venta(1);
        Cliente cliente1 = new Cliente("Christian Ortega", "20.106.947-5", "Calle Rosselot 266");
        Vendedor vendedor1 = new Vendedor("Nacho Riquelme", "10.7288.833-3", "Calle Orella 135", "Administracion de empresas", "Soltera");
        Inmueble inmueble1 = new Inmueble("Madera", "Los Condores 2467, Temuco", "60.000");
        venta1.agregarCliente(cliente1);
        venta1.agregarVendedor(vendedor1);
        venta1.agregarInmueble(inmueble1);
        GestorDatos.registrarDatos(venta1.getVendedores(), "baseDeDatos.txt");
        GestorDatos.registrarDatos(venta1.getClientes(), "baseDeDatos.txt");
        GestorDatos.registrarDatos(venta1.getInmubeles(), "baseDeDatos.txt");

    }
}
