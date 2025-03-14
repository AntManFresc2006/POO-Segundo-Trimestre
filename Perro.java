package POO_Interfaces;

public class Perro implements Animal {
	
	private int height, age;
	
	public Perro() {}

	public Perro(int height, int age) {
		this.height = height;
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void comer() {
		System.out.println("Perro: ñam ñam");
		
	}

	@Override
	public void dormir() {
		System.out.println("Perro: ZZZZZZZ");

		
		
	}
	
	@Override
	public void  mostrarDatos() {
		System.out.println("Altura del perro: "+height);
		System.out.println("Edad del perro: "+age);

		
		
	}
	
	
	
	
	
}
