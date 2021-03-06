

public enum ValoresNumericos {
	ZERO("zero", 0), UM("um", 1), DOIS("dois", 2), TRES("tres", 3), QUATRO("quatro", 4), 
	CINCO("cinco", 5), SEIS("seis", 6), SETE("sete", 7), OITO("oito", 8), NOVE("nove", 9), 
	DEZ("dez", 10), ONZE("onze", 11), DOZE("doze", 12), TREZE("treze", 13), QUARTOZE("quartoze", 14),
	QUINZE("quinze", 15), DEZESSEIS("dezesseis", 16), DEZESSETE("dezessete", 17), DEZOITO("dezoito", 18),
	DEZENOVE("dezenove", 19), VINTE("vinte", 20), TRINTA("trinta", 30), QUARENTA("quarenta", 40),
	CINQUENTA("cinquenta", 50), SESSENTA("sessenta", 60), SETENTA("setenta", 70), OITENTA("oitenta", 80),
	NOVENTA("noventa", 90), CENTO("cento", 100), DUZENTOS("duzento", 200), MIL("mil", 1000), BILHAO("bilhao", 1000000000);
	
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
		//System.out.println(ZERO.getValorNumerico());
		//System.out.println(ZERO.getValorExtenso());
		//ValoresNumericos e = null;
		//System.out.println(e.values()[2].getValorExtenso());
		//EscrevePorExtenso s = new EscrevePorExtenso();
		//Scanner n = new Scanner(System.in);
		int numero = 999;
		int centena = numero / 100;
		int dezena = (numero - ((numero / 100) * 100)) / 10;
		int unidade = (numero - ((numero / 100) * 100)) - ((( numero - (((numero / 100)) * 100 )) / 10) * 10);
		
		
		System.out.println("U " + unidade + "D " + dezena + " C " + centena);
		
	}
}
