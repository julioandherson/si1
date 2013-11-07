
public enum ValoresNumericos {
	ZERO("zero", 0), UM("um", 1), DOIS("dois", 2), TRES("tres", 3), QUATRO("quatro", 4), 
	CINCO("cinco", 5), SEIS("seis", 6), SETE("sete", 7), OITO("oito", 8), NOVE("nove", 9), 
	DEZ("dez", 10);
	
	private String valorExtenso;
	private int valorNumerico;
	
	private ValoresNumericos(String valorExtenso, int valorNumerico){
		this.valorExtenso = valorExtenso;
		this.valorNumerico = valorNumerico;
	}
	
	public String getValorExtenso() {
		return valorExtenso;
	}

	public int getValorNumerico() {
		return valorNumerico;
	}

	public static void main(String args[]){
		System.out.println(ZERO.getValorNumerico());
		System.out.println(ZERO.getValorExtenso());
		
	}
	
	

}
