package EjercicioConcatenarTexto;

/*
 * 
 *  Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 */

public class ConcatenarTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String textoConcatenado = "";
		
		String[] textos = {" Hola ", "Soy Mario ", "este es ", "mi ejercicio de ", "contaneacion de texto " };
		
		for (int i = 0; i < textos.length; i++) {
			textoConcatenado += textos[i];
		}
		
		System.out.println(textoConcatenado);
		
	}

}
