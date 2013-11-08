
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
			e.getMessage();
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
		String numeroString = numero + "";
		int tamanho = numeroString.length();
		
		int unidade = (numero - ((numero / 100) * 100)) - ((( numero - (((numero / 100)) * 100 )) / 10) * 10);
		int dezena = (numero - ((numero / 100) * 100)) / 10;
		int centena = numero / 100;

		int auxiliarUnidade;
		int auxiliarDezena;
		int auxiliarCentena;
		
		if (tamanho == 1){
			concatenacao = buscaValoresBasico(numero);
		}else if (tamanho == 2){
			auxiliarUnidade = dezena * 10;
			if (unidade != 0){
				concatenacao += buscaValoresBasico(auxiliarUnidade) + " e " + buscaValoresBasico(unidade);
			}else{
				concatenacao += buscaValoresBasico(auxiliarUnidade);
			}
			//U 3D 2 C 1   123
		}else if (tamanho == 3){
			
			auxiliarCentena = centena * 100;
			auxiliarDezena = dezena * 10;

			if (unidade == 0 && dezena == 0){
				concatenacao = "cem";
			}else if(dezena == 0){
				concatenacao += buscaValoresBasico(auxiliarCentena) + " e " + buscaValoresBasico(unidade);
			}else if(unidade == 0){
				concatenacao += buscaValoresBasico(auxiliarCentena) + " e " + buscaValoresBasico(auxiliarDezena);
			}else{
				concatenacao += buscaValoresBasico(auxiliarCentena) + " e " + buscaValoresBasico(auxiliarDezena) + " e " + buscaValoresBasico(unidade);
			}
		}
		
		
	
		return concatenacao;
	}
	
	public String escreverPorExtenso(int numero){
		String saida = null;
		String numeroString = numero + "";
		if (isEntradaValida(numeroString)){
			if(numero >= 0 && numero <= 19){
				saida = buscaValoresBasico(numero);
			}else{
				saida = concatenaValores(numero);
			}
		}
		return saida;
	}
}