
public class EscrevePorExtenso {
	
	public EscrevePorExtenso(){
		
	}
	
	public boolean isEntradaValida(String numero){
		boolean saida = false;
		int numeroConvertido;
		try{
			numeroConvertido = Integer.parseInt(numero);
			if (numeroConvertido >= 0 && numeroConvertido <= ValoresNumericos.BILHAO.getValorNumerico()){
				saida = true;
			}
			
		}catch(Exception e){
			System.out.println("Entrada Invalida. Digite Novamente:");
		}
		return saida;
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
	
	public String concatenaValores(int numero){
		String concatenacao = "";
		
		
		
		return concatenacao;
	}
	
	public String escreverPorExtenso(int numero){
		String saida = null;
		String numeroString = numero + "";
		
		
		if (isEntradaValida(numeroString)){
			if (buscaValoresBasico(numero) != null){
				saida = buscaValoresBasico(numero);
			}
		}
			
		
		return saida;
	}
	
	

}


