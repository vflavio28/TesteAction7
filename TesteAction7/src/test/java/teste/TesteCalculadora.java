package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadora {

	public Calculadora cal = new Calculadora();
	
	@Test
	public void test() {
		double soma = cal.somar(2, 2);
		assertEquals(4, soma, 0);
	}
}
