package POO_Interfaces;

public class Moto implements Vehiculo{
	
	private String fabricante, modelo;
	private int año_Fabricacion;
	private boolean esGasolina = false;
	
	public Moto() {}

	public Moto(String fabricante, String modelo, int año_Fabricacion, boolean esGasolina) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.año_Fabricacion = año_Fabricacion;
		this.esGasolina = esGasolina;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño_Fabricacion() {
		return año_Fabricacion;
	}

	public void setAño_Fabricacion(int año_Fabricacion) {
		this.año_Fabricacion = año_Fabricacion;
	}

	public boolean isEsGasolina() {
		return esGasolina;
	}

	public void setEsGasolina(boolean esGasolina) {
		this.esGasolina = esGasolina;
	}

	@Override
	public void arrancar() {
		System.out.println("Arranca la moto");
		
	}

	@Override
	public void detener() {
		System.out.println("Se detiene la moto");
	}

	public void esGasolina() {
		if (esGasolina==false) {
			System.out.println("Tu moto no es de gasolina");
		}
		
		else {
			System.out.println("Tu moto es de gasolina");
		}
		
	}
}
