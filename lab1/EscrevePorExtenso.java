
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
		int auxiliar;
		//PARA DOIS DIGITOS DE 21 A 99 
		//INTERVALO ABERTO A DIREITA
		if(numeroString.substring(0,1).equals("2") && numeroString.length() == 2){
			concatenacao += ValoresNumericos.VINTE.getValorExtenso() + " e ";
			auxiliar = Integer.parseInt(numeroString.substring(1, 2));
			concatenacao += buscaValoresBasico(auxiliar);
		}else if(numeroString.substring(0,1).equals("3") && numeroString.length() == 2){
			concatenacao += ValoresNumericos.TRINTA.getValorExtenso() + " e ";
			auxiliar = Integer.parseInt(numeroString.substring(1, 2));
			concatenacao += buscaValoresBasico(auxiliar);
		}else if(numeroString.substring(0,1).equals("4") && numeroString.length() == 2){
			concatenacao += ValoresNumericos.QUARENTA.getValorExtenso() + " e ";
			auxiliar = Integer.parseInt(numeroString.substring(1, 2));
			concatenacao += buscaValoresBasico(auxiliar);
		}else if(numeroString.substring(0,1).equals("5") && numeroString.length() == 2){
			concatenacao += ValoresNumericos.CINQUENTA.getValorExtenso() + " e ";
			auxiliar = Integer.parseInt(numeroString.substring(1, 2));
			concatenacao += buscaValoresBasico(auxiliar);
		}else if(numeroString.substring(0,1).equals("6") && numeroString.length() == 2){
			concatenacao += ValoresNumericos.SESSENTA.getValorExtenso() + " e ";
			auxiliar = Integer.parseInt(numeroString.substring(1, 2));
			concatenacao += buscaValoresBasico(auxiliar);
		}else if(numeroString.substring(0,1).equals("7") && numeroString.length() == 2){
			concatenacao += ValoresNumericos.SETENTA.getValorExtenso() + " e ";
			auxiliar = Integer.parseInt(numeroString.substring(1, 2));
			concatenacao += buscaValoresBasico(auxiliar);
		}else if(numeroString.substring(0,1).equals("8") && numeroString.length() == 2){
			concatenacao += ValoresNumericos.OITENTA.getValorExtenso() + " e ";
			auxiliar = Integer.parseInt(numeroString.substring(1, 2));
			concatenacao += buscaValoresBasico(auxiliar);
		}else if(numeroString.substring(0,1).equals("9") && numeroString.length() == 2){
			concatenacao += ValoresNumericos.NOVENTA.getValorExtenso() + " e ";
			auxiliar = Integer.parseInt(numeroString.substring(1, 2));
			concatenacao += buscaValoresBasico(auxiliar);
		}
		
	
		return concatenacao;
	}
	
	public String escreverPorExtenso(int numero){
		String saida = null;
		String numeroString = numero + "";
		
		if (isEntradaValida(numeroString)){
			if(numero <= 20 || numero == 30 || numero == 40 || numero == 50 || numero == 60 
					|| numero == 70 || numero == 80 || numero == 90 || numero == 100 || numero == 1000){
				saida = buscaValoresBasico(numero);
			}else if(numero >= 21 && numero <= 99){
				saida = concatenaValores(numero);
			}
			
		}
		return saida;
	}
}