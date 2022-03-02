public class Calculadora {
	
	// Declaración de propiedades
	String marca;
	String color;
	
	// Definir los comportamientos
	public int sumar(int numeroUno, int numeroDos) {
		int resultado = numeroUno + numeroDos;
		
		return resultado;
	}
	
	public int restar(int numeroUno, int numeroDos) {
		int resultado = numeroUno - numeroDos;
		
		return resultado;
	}
	
	public int multiplicar(int numeroUno, int numeroDos) {
		int resultado = numeroUno * numeroDos;
		
		return resultado;
	}
	
	public float dividir(int numeroUno, int numeroDos) {
		float resultado = numeroUno / numeroDos;
		
		return resultado;
	}
	
	public int modulo(int numeroUno, int numeroDos) {
		int resultado = numeroUno % numeroDos;
		
		return resultado;
	}
	
	
}
