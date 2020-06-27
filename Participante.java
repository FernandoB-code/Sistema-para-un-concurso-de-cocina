package parcial;

public class Participante {
	
	private String dni;	
	private String nombre;
	private String apellido;
	private int votos;
	
	
	public Participante(String dni, String nombre, String apellido) {		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		setVotos(votos);
		
	
	}
	@Override
	public String toString() {
		return "Participante [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", votos=" + votos + "]";
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {		
		
		this.votos = votos;
	}
	
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
		
		
	}
	private void setDni(String dni) {
		this.dni = dni;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}
	
	
	