
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
		
	}

}
