
import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class testeEscritaPorExtenso {
	
	EscrevePorExtenso e;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		e = new EscrevePorExtenso();

	}	
	
	//CASO MAIS SIMPLES POSSIVEL
	@Test
	public void testCasoMaisSimples(){
	Assert.assertEquals("um", e.escreverPorExtenso(1));
	Assert.assertEquals("dois", e.escreverPorExtenso(2));
	Assert.assertEquals("tres", e.escreverPorExtenso(3));
	Assert.assertEquals("quatro", e.escreverPorExtenso(4));
	Assert.assertEquals("cinco", e.escreverPorExtenso(5));
	Assert.assertEquals("seis", e.escreverPorExtenso(6));
	Assert.assertEquals("sete", e.escreverPorExtenso(7));
	Assert.assertEquals("oito", e.escreverPorExtenso(8));
	Assert.assertEquals("nove", e.escreverPorExtenso(9));
	Assert.assertEquals("dez", e.escreverPorExtenso(10));
	}
	
	//CASO SIMPLES
	@Test
	public void testCasoSimples(){
	Assert.assertEquals("onze", e.escreverPorExtenso(11));
	Assert.assertEquals("doze", e.escreverPorExtenso(12));
	Assert.assertEquals("treze", e.escreverPorExtenso(13));
	Assert.assertEquals("quartoze", e.escreverPorExtenso(14));
	Assert.assertEquals("quinze", e.escreverPorExtenso(15));
	Assert.assertEquals("dezesseis", e.escreverPorExtenso(16));
	Assert.assertEquals("dezessete", e.escreverPorExtenso(17));
	Assert.assertEquals("dezoito", e.escreverPorExtenso(18));
	Assert.assertEquals("dezenove", e.escreverPorExtenso(19));
	Assert.assertEquals("vinte", e.escreverPorExtenso(20));
	Assert.assertEquals("trinta", e.escreverPorExtenso(30));
	Assert.assertEquals("quarenta", e.escreverPorExtenso(40));
	Assert.assertEquals("cinquenta", e.escreverPorExtenso(50));
	Assert.assertEquals("sessenta", e.escreverPorExtenso(60));
	Assert.assertEquals("setenta", e.escreverPorExtenso(70));
	Assert.assertEquals("oitenta", e.escreverPorExtenso(80));
	Assert.assertEquals("noventa", e.escreverPorExtenso(90));
	Assert.assertEquals("cem", e.escreverPorExtenso(100));
	Assert.assertEquals("mil", e.escreverPorExtenso(1000));
	}
	
	//ENTRADA VAZIA
	@Test
	public void testEntradaVazia(){
		String entrada = "";
		Assert.assertFalse(e.isEntradaValida(entrada));
		entrada = "                  ";
		Assert.assertFalse(e.isEntradaValida(entrada));
		Assert.assertFalse(e.isEntradaValida(null));
	}
	
	//ENTRADA INVALIDA
	@Test
	public void testEntradaInvalida(){
		String entrada = "entrada errada";
		Assert.assertFalse(e.isEntradaValida(entrada));
		Assert.assertFalse(e.isEntradaValida(null));
		
		entrada = "23abc";
		Assert.assertFalse(e.isEntradaValida(entrada));
		entrada = "23 ";
		Assert.assertFalse(e.isEntradaValida(entrada));
		
		entrada = "2000000000";
		Assert.assertFalse(e.isEntradaValida(entrada));
	}
	
	//NUMEROS ENTRE 21 E 99
	@Test
	public void testIntervalos21A99(){
		Assert.assertEquals("vinte e dois", e.escreverPorExtenso(22));
		Assert.assertEquals("vinte e tres", e.escreverPorExtenso(23));
		Assert.assertEquals("vinte e quatro", e.escreverPorExtenso(24));
		Assert.assertEquals("vinte e cinco", e.escreverPorExtenso(25));
		Assert.assertEquals("vinte e seis", e.escreverPorExtenso(26));
		Assert.assertEquals("vinte e sete", e.escreverPorExtenso(27));
		Assert.assertEquals("vinte e oito", e.escreverPorExtenso(28));
		Assert.assertEquals("vinte e nove", e.escreverPorExtenso(29));
		Assert.assertEquals("trinta e tres", e.escreverPorExtenso(33));
		Assert.assertEquals("trinta e sete", e.escreverPorExtenso(37));
		Assert.assertEquals("quarenta e um", e.escreverPorExtenso(41));
		Assert.assertEquals("quarenta e seis", e.escreverPorExtenso(46));
		Assert.assertEquals("cinquenta e dois", e.escreverPorExtenso(52));
		Assert.assertEquals("cinquenta e nove", e.escreverPorExtenso(59));
		Assert.assertEquals("sessenta e tres", e.escreverPorExtenso(63));
		Assert.assertEquals("sessenta e oito", e.escreverPorExtenso(68));
		Assert.assertEquals("setenta e sete", e.escreverPorExtenso(77));
		Assert.assertEquals("setenta e oito", e.escreverPorExtenso(78));
		Assert.assertEquals("oitenta e tres", e.escreverPorExtenso(83));
		Assert.assertEquals("oitenta e seis", e.escreverPorExtenso(86));
		Assert.assertEquals("noventa e dois", e.escreverPorExtenso(92));
		Assert.assertEquals("noventa e nove", e.escreverPorExtenso(99));
	}
}
