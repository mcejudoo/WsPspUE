package herencia;

public class Oso extends Animal {

	@Override
	public void zampar(Object comida) {
		if (comida instanceof Oso) {
			return;
		} else if (comida instanceof Animal) {
			Animal a = (Animal) comida;
			System.out.println("Soy un oso y voy a comerme al animal " + a.getNombre());
			this.setPeso(this.getPeso() + (a.getPeso() / 2));
		} else {
			System.out.println("Soy un oso y solo como animales, pero no osos");
		}
	}
}
