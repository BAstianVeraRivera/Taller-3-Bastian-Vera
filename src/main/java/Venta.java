import java.io.IOException;
import java.util.ArrayList;

public class Venta {
    private int numeroVenta;
    public int getNumeroVenta() {
        return this.numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
    public Venta (int numeroVenta){
        this.numeroVenta=numeroVenta;
    }
    public String toString(){
        return this.numeroVenta+",";
    }
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
    private ArrayList<Inmueble> inmubeles = new ArrayList<Inmueble>();
    private ArrayList<Venta> ventas = new ArrayList<Venta>();
    public ArrayList<Venta> getVentas() {return ventas;}
    public ArrayList<Vendedor> getVendedores() {return vendedores;}
    public ArrayList<Cliente> getClientes() {return clientes;}
    public ArrayList<Inmueble> getInmubeles() {return inmubeles;}

    //agregar cliente
    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        System.out.println("Cliente agregado");
    }
    //agregar vendedor
    public void agregarVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
        System.out.println("Vendedor agregado");
    }
    //agregar inmueble
    public void agregarInmueble(Inmueble inmueble) {
        this.inmubeles.add(inmueble);
        System.out.println("Inmueble agregado");
    }
    // quitar inmueble
    public void quitarInmueble(Inmueble inmueble) {
        this.inmubeles.remove(inmueble);
        System.out.println("El inmueble se ha dado de baja");
    }
    // buscar por material
    public Inmueble buscarInmueblePorMaterial(Inmueble tipoConstruccion){
        for(Inmueble inmueble:this.inmubeles){
            if(inmueble.getTipoConstruccion().equals(tipoConstruccion)){
                return inmueble;
            }
        }
        return null;
    }
    //buscar por precio
    public Inmueble buscarInmueblePorPrecio(Inmueble precio){
        for(Inmueble inmueble:this.inmubeles){
            if(inmueble.getPrecio().equals(precio)){
                return inmueble;
            }
        }
        return null;
    }
}