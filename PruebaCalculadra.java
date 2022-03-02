public class PruebaCalculadora {

	public static void main(String[] args) {
		Calculadora cuentaHuevos = new Calculadora();
		
		System.out.println("La calculadora está encendida");
		
		System.out.println("El resultado de la suma 5 + 6 es:");
		System.out.println(cuentaHuevos.sumar(5, 6));
		
		System.out.println("El resultado de la resta 21 - 9 es:");
		System.out.println(cuentaHuevos.restar(21, 9));
		
		System.out.println("El resultado de la multiplicación 8 * 7 es:");
		System.out.println(cuentaHuevos.multiplicar(8, 7));
		
		System.out.println("El resultado de la división 39 / 9 es:");
		System.out.println(cuentaHuevos.dividir(39, 9));
		
		System.out.println("El resultado del modulo 13 % 5 es:");
		System.out.println(cuentaHuevos.modulo(13, 5));
		
		System.out.println("La calculadora está apagada");
		
	}
	
}
