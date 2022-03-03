package calculadora;

public class Calculadora {
	
	// Declaración de propiedades
	private String marca;
	private String color;
	private boolean estaEncendida;
	
	// Definir los comportamientos
	
	public int sumar(int numeroUno, int numeroDos) {
		
		if (estaEncendida() == false) {
			//lanzar excepcion
			throw new RuntimeException("¡calculadora apagada!");
		}
		
		int resultado = numeroUno + numeroDos;
		
		return resultado;
	}
	
	public int restar(int numeroUno, int numeroDos) {
		
		if (estaEncendida() == false) {
			//lanzar excepcion
			throw new RuntimeException("¡calculadora apagada!");
		}
		
		int resultado = numeroUno - numeroDos;
		
		return resultado;
	}
	
	public int multiplicar(int numeroUno, int numeroDos) {
		
		if (estaEncendida() == false) {
			//lanzar excepcion
			throw new RuntimeException("¡calculadora apagada!");
		}
		
		int resultado = numeroUno * numeroDos;
		
		return resultado;
	}
	
	public float dividir(int numeroUno, int numeroDos) {
		
		if (estaEncendida() == false) {
			//lanzar excepcion
			throw new RuntimeException("¡calculadora apagada!");
		}
		
		float resultado = numeroUno / numeroDos;
		
		return resultado;
	}
	
	public int hallarModulo(int numeroUno, int numeroDos) {
		
		if (estaEncendida() == false) {
			//lanzar excepcion
			throw new RuntimeException("¡calculadora apagada!");
		}
		
		int resultado = numeroUno % numeroDos;
		
		return resultado;
	}
	
	public void encender() {
		estaEncendida = true;
	}
	
	public void apagar() {
		estaEncendida = false;
	}
	
	public boolean estaEncendida() {
		return estaEncendida;
	}
	
	public void setMarca(String valor) {
		marca = valor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setColor(String valor) {
		color = valor;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
