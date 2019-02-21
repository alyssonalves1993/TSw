import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCalc {
	// criando um objeto c a apartir do metodo calc
	Calc c = new Calc();

	// declarando as varíaveis
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

		assertEquals(2, result);
	}
}
