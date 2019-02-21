public class Calc implements Calculadora {
	/* Declaração dos métodos */
	public int soma(String num1, String num2) {
		if (num1 == null || num2 == null){
			return 0;
		}
		return Integer.parseInt(num1) + Integer.parseInt(num2);
		
	}

	public double dividir(String num1, String num2) {
		double result = 1.5;
		return result;
	}

	public double raizQuadrada(String num) {
		double result = 1.5;
		return result;
	}

}
