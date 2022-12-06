
public class ED_Debug {

	
	public static void funcion1() {
		
		int a=2;
		
		String string1 = "string1";
		String string2 = "string2";

		string2= string2.substring(0, string2.length()-1);
		string2=string2+"1";
		
		// Solventado el problema de condición de igualdad entre Strings.
		// (Aunque siempre van a ser iguales)
		if(string1.equals(string2)) {
			System.out.println("SON IGUALES " + a);
			
		}
		else {
			System.out.println("SON DIFERENTES");
		}
	}
	
	//El método funcion2() debe ser estático si queremos llamarlo desde Main().
	public static void funcion2() {
		System.out.println("--------------------");
		System.out.println("Esta es la función 2");
		System.out.println("Cómo hago la llamada para que funcione????");
	}

	public static void main(String[] args) {
		int a = 3;
		int i;

		// Entiendo que el objetivo del programa era hacer el factorial de 10.
		// Si inicializamos el iterador en 0. Cualquier número multiplicado por 0 va a dar 0.
		for(i = 1; i<10; i++)
			a *= i;
		
		System.out.println("El valor de a es: "+a);

		// Llamamos al método funcion2()
		funcion1();
		funcion2();
	}

}
