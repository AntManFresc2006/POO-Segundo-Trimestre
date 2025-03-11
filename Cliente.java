package POO_Ejercicios3;

public class Cliente extends Persona{
	
	private String idCliente, tipoCliente;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, String apellido2, String dni, String domicilio, String telefono,
			String idCliente, String tipoCliente) {
		super(nombre, apellido, apellido2, dni, domicilio, telefono);
		this.idCliente = idCliente;
		this.tipoCliente = tipoCliente;
	}
	
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public void saludar() {
		System.out.println("Hola, mi nombre es "+nombre+" "+apellido+" "+apellido2+".");
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Nombre = "+nombre);
		System.out.println("Apellidos = "+apellido+" "+apellido2);
		System.out.println("Domicilio = "+domicilio);
		System.out.println("IdCliente = "+idCliente);
		System.out.println("Tipo de cliente = "+tipoCliente);
	}
	
}
