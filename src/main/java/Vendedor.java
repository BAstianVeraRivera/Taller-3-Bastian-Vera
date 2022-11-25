public class Vendedor extends Persona {
	private String titulo;
	private String estadoCivil;

	public Vendedor (String nombre, String run, String direccion, String titulo,String estadoCivil){
		super(nombre, run, direccion);
		this.titulo=titulo;
		this.estadoCivil=estadoCivil;
	}
	public String toString(){
		return this.getNombre()+","+this.getRun()+","+this.getRun()+","+this.getDireccion()+","+this.getTitulo()+","+this.getEstadoCivil();
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}