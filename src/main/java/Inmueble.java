public class Inmueble {
	private String tipoConstruccion;
	private String ubicacionGeo;
	private String precio;

	public Inmueble (String tipoConstruccion, String ubicacionGeo, String precio){
		this.tipoConstruccion=tipoConstruccion;
		this.ubicacionGeo=ubicacionGeo;
		this.precio=precio;
	}
	public String toString(){
		return this.getTipoConstruccion()+","+this.getUbicacionGeo()+","+this.getPrecio();
	}

	public String getTipoConstruccion() {
		return this.tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public String getUbicacionGeo() {
		return this.ubicacionGeo;
	}

	public void setUbicacionGeo(String ubicacionGeo) {
		this.ubicacionGeo = ubicacionGeo;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
}