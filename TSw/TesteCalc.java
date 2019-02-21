import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCalc {
	// criando um objeto c a apartir do metodo calc
	Calc c = new Calc();

	// declarando as varíaveis
	@Test
	public void TesteSoma() {

		int num1 = 1;
		int num2 = 1;
		int result;

		result = c.som(num1,num2);
		
		assertEquals(2, result);
	}
	@Test
	public void TesteSomaNegativoPositivo() {

		int num1 = +1;
		int num2 = -1;
		int result;

		result = c.som(num1,num2);

		assertEquals(2, result);
	}
}
