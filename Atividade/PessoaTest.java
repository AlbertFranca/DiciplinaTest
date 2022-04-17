import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
	
	@Test
	public void verificaSeOMetodoDoCalculoImcFunciona() {
		Pessoa pessoaIMCTest = new Pessoa(1.75,57);
		
		pessoaIMCTest.calcularIMC();
		
		Assert.assertEquals(18.61, pessoaIMCTest.calcularIMC(), 0.01);
	}
	
	@Test
	public void testaBaixoPesoMuitoGrave() {
		Pessoa pessoa1 = new Pessoa(1.90, 50);
		
		pessoa1.menssagem();

		Assert.assertEquals("Baixo peso muito grave", pessoa1.menssagem());
	}
	
	@Test
	public void testaBaixoPesoGrave() {
		Pessoa pessoa2 = new Pessoa(1.75, 50);
		
		pessoa2.menssagem();

		Assert.assertEquals("Baixo peso grave", pessoa2.menssagem());
	}
	
	@Test
	public void testaBaixoGrave() {
		Pessoa pessoa3 = new Pessoa(1.50, 40);
		
		pessoa3.menssagem();

		Assert.assertEquals("Baixo grave", pessoa3.menssagem());
	}
	
	@Test
	public void testaPesoNormal() {
		Pessoa pessoa4 = new Pessoa(1.75, 70);
		
		pessoa4.menssagem();

		Assert.assertEquals("Peso normal", pessoa4.menssagem());
	}
	
	@Test
	public void testaSobrepeso() {
		Pessoa pessoa5 = new Pessoa(1.55, 67);
		
		pessoa5.menssagem();

		Assert.assertEquals("Sobrepeso", pessoa5.menssagem());
	}
	
	@Test
	public void testaObesidadeGrauI() {
		Pessoa pessoa6 = new Pessoa(1.55, 80);
		
		pessoa6.menssagem();

		Assert.assertEquals("Obesidade Grau I", pessoa6.menssagem());
	}
	
	@Test
	public void testaObesidadeGrauII() {
		Pessoa pessoa7 = new Pessoa(1.55, 90);
		
		pessoa7.menssagem();

		Assert.assertEquals("Obesidade Grau II", pessoa7.menssagem());
	}
	
	@Test
	public void testaObesidadeGrauIII() {
		Pessoa pessoa8 = new Pessoa(1.90, 150);
		
		pessoa8.menssagem();

		Assert.assertEquals("Obesidade Grau III", pessoa8.menssagem());
	}
}