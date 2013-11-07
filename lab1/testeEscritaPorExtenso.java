
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
	
	//Comportamentos:
		//Cen�rio: caso mais simples poss�vel 
		//Dado que: o sistema est� esperando um n�mero
		//Quanto eu: informo um n�mero entre 0 e 10, por exemplo 10
		//E: aperto enter
		//Ent�o: Eu vejo "dez" como resultado. 

		//Cen�rio: caso simples
		//Dado que: o sistema est� esperando um n�mero
		//Quanto eu: informo <n�mero>, que � um n�mero cuja vers�o em portugu�s tem apenas 
	//uma palavra
		//E: aperto enter
		//Ent�o: Eu vejo <n�mero> (em portugu�s) como resultado. 
	
	
	//CASO MAIS SIMPLES POSSIVEL
	@Test
	public void testPorExtenso(){
	Assert.assertEquals("um", e.escreverPorExtenso(1)); 
	Assert.assertEquals("dez", e.escreverPorExtenso(10));
	}
	
	//CASO SIMPLES
	@Test
	public void testNumero(){
	//Assert.assertEquals("um", e.escreverPorExtenso("um"));
	//Assert.assertEquals("dez", e.escreverPorExtenso("dez"));
	}

}
