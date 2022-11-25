public class Cliente extends Persona {
    public Cliente (String nombre, String run, String direccion){
        super(nombre, run, direccion);
    }
    public String toString(){
        return this.getNombre()+","+this.getRun()+","+this.getRun()+","+this.getDireccion();
    }
}