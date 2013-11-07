
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
		//Cenário: caso mais simples possível 
		//Dado que: o sistema está esperando um número
		//Quanto eu: informo um número entre 0 e 10, por exemplo 10
		//E: aperto enter
		//Então: Eu vejo "dez" como resultado. 

		//Cenário: caso simples
		//Dado que: o sistema está esperando um número
		//Quanto eu: informo <número>, que é um número cuja versão em português tem apenas 
	//uma palavra
		//E: aperto enter
		//Então: Eu vejo <número> (em português) como resultado. 
	
	
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
