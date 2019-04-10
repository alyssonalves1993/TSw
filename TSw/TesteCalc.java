import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteCalc {
	// criando um objeto c a apartir do metodo calc
	Calc c = new Calc();

	// declarando as varíaveis
	@Before
	public void Inicializar(){
	String num1 = null;
	String num2 = null;
	}
	
	@Test
	public void TesteSoma() {

		String num1 = "1";
		String num2 = "1";
		int result;

		result = c.soma(num1,num2);
		
		assertEquals(2, result);
	}
	@Test
	public void TesteSomaNegativoPositivo() {

		String num1 = "-1";
		String num2 = "+1";
		int result;

		result = c.soma(num1,num2);

		assertEquals(0, result);
	}
	//incluindo timeout para entendimento de teste
	@Test(timeout=1000)
	public void VerificarTempoExecucao() {
		String num1 = null;
		String num2 = null;
		int result;

		result = c.soma(num1,num2);

		assertEquals(0, result);
	}
	//informar que esperava que desse um exception de não possibilidade de divisão por 0 
	@Test(expected = ArithmeticException.class)
	public void TesteLancarExecaoDividirPorZero() {
		String num1 = "2";
		String num2 = "0";
		double result;

		result = c.dividir(num1,num2);
			
		assertEquals(0, result);
	}
	
	@After
	public void Finalizar(){
	String num1 = null;
	String num2 = null;
	Double result = null;
	}
}
