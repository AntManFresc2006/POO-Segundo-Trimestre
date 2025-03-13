package POO_Ejercicios4;

public class Ej16 {
	public static void main(String[] args) {

		// He accedido a los atributos privados de las clases implementando el metodo "objeto.getAtributo();", ya que estos son metodos publicos y permiten que se pueda acceder a los atributos independientemente de que sean privados.
		
		//Veamos que ocurre cuando ponemos el metodo cilindrada publico.
		
		Moto moto = new Moto("abkujb", 23, 67);
		
		System.out.println(moto.cilindrada);
		
		System.out.println(moto.matricula);

		
		System.out.println(moto.numeroRuedas);

		
		// Si intentamos hacer un llamado al atributo matricula o numeroRuedas, nos sale error, ya que son atributos privados y solo se pueden acceder a traves de metodos getters
		
		System.out.println(moto.getMatricula());
		
		System.out.println(moto.getNumeroRuedas());
		
		//En el caso de que las 2 clases esten en el mismo paquete, se pueden acceder a los atributos, pero si no estan en el mismo paquete, no se podran acceder A MENOS de que se importe un paquete asi: import.package.nombrePaquete.
		
		//En el caso de que sea un atributo protected, se pueden acceder a estos ya que las clases hijas heredan directamente los atributos de las superclases sin necesidad de setters y getters, no obstante, si ambas clases estan en paquetes diferentes, a pesar de usar modificadores de acceso protected, no nos van a servir.
		
		
		
		
	}
}
