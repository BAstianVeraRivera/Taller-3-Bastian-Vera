public abstract class Persona {
	private String nombre;
	private String run;
	private String direccion;

	public Persona (String nombre, String run, String direccion){
		this.nombre=nombre;
		this.run=run;
		this.direccion=direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}