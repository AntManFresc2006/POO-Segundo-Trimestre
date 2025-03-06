package POO_Ejercicio1;

public class TestCarrera {
	
	public static void main(String[] args) {
	
	Coche coche1 = new Coche ("Rivian", "R1T", 2020, false);
	Coche coche2 = new Coche ("Ferrari", "Ferrari 488", 2022, true);
	Piloto piloto1 = new Piloto ("Juan", "Guinea Ecuatorial");
	Piloto piloto2 = new Piloto ("Miguel", "Peru");
	
	if (coche1.isEsDeGasolina() == true) {
		System.out.println("Hola, soy "+piloto1.getNombre()+", soy de "+piloto1.getNacionalidad()+" y conduzco un "+coche1.getFabricante() + coche1.getModelo()+" que se creo en "+coche1.getAñoFabricacion()+ ", mi coche usa gasolina.");
		
	}
	else {
		System.out.println("Hola, soy "+piloto1.getNombre()+", soy de "+piloto1.getNacionalidad()+" y conduzco un "+coche1.getFabricante() + coche1.getModelo()+" que se creo en "+coche1.getAñoFabricacion()+ ", mi coche no usa gasolina.");

	}
	
	if (coche2.isEsDeGasolina() == true) {
		System.out.println("Hola, soy "+piloto2.getNombre()+", soy de "+piloto2.getNacionalidad()+" y conduzco un "+coche2.getFabricante() + coche2.getModelo()+" que se creo en "+coche2.getAñoFabricacion()+ ", mi coche usa gasolina.");
		
	}
	
	else {
		System.out.println("Hola, soy "+piloto2.getNombre()+", soy de "+piloto2.getNacionalidad()+" y conduzco un "+coche2.getFabricante() + coche2.getModelo()+" que se creo en "+coche2.getAñoFabricacion()+ ", mi coche no usa gasolina.");
	
	}
	}
	
}
