
public class EscrevePorExtenso {
	
	public EscrevePorExtenso(){
		
	}
	
	public String buscaValoresBasico(int numero){
		String saida = null;
		int tamanho = ValoresNumericos.values().length;
		for(int indice = 0; indice < tamanho; indice ++){
			if (ValoresNumericos.values()[indice].getValorNumerico() == numero){
				saida = ValoresNumericos.values()[indice].getValorExtenso();
			}	
		}
		return saida;
	}
	
	public String escreverPorExtenso(int numero){
		String saida = null;
		try{
			//int tamanho = ValoresNumericos.values().length;
			
			
			if (buscaValoresBasico(numero) != null){
				saida = buscaValoresBasico(numero);
			}else{
				//CONCATENA
			}
		//	for(int indice = 0; indice < tamanho; indice ++){
			//	if (ValoresNumericos.values()[indice].getValorNumerico() == numero){
			//		saida = ValoresNumericos.values()[indice].getValorExtenso();
			//	}	
			//}		
		}catch(Exception e){
			System.out.println("Entrada invalida. Digite novamente");	
		}
		return saida;
	}
	
	

}


