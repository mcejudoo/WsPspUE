package interfaces;

public class ImprimirPantalla implements Imprimible{

	@Override
	public void imprimir(String cadena) {
		System.out.println(cadena);		
	}

}
