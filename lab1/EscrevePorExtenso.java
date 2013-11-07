
public class EscrevePorExtenso {
	
	public EscrevePorExtenso(){
		
	}
	
	public String escreverPorExtenso(int numero){
		String saida = null;
		int tamanho =ValoresNumericos.values().length;
		
		for(int indice = 0; indice < tamanho; indice ++){
			System.out.println(ValoresNumericos.values()[indice].getValorExtenso());
			if (ValoresNumericos.values()[indice].getValorNumerico() == numero){
				saida = ValoresNumericos.values()[indice].getValorExtenso();
			}	
		}		
		//CASO MAIS SIMPLES
		
		return saida;
	}
	
}
