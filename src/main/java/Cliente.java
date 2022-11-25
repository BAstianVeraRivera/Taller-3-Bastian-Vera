public class Cliente extends Persona {

    public String toString(){
        return this.getNombre()+","+this.getRun()+","+this.getRun()+","+this.getDireccion();
    }

    public Cliente (String nombre, String run, String direccion){
        super(nombre, run, direccion);
    }
}