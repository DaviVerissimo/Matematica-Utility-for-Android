package control;

public interface Facada {
	
	/**Retorna um numero elevado em uma raiz
	 * @param numero = numero a ser elevado em uma raiz.
	 * @param baseRaiz = raiz que o numero será elevado.
	 * @return Raiz
	 */
	public long calcularRaiz(float numero, float baseRaiz);
	
	/**Retorna um numero elevado em uma potencia.
	 * @param numero = numero que será elevado.
	 * @param basePotencia = potencia que elevará o numero.
	 * @return Potencia
	 */
	public long calcularPotencia(float numero, float basePotencia);
	
	/**
	 * @param a = incognita ao quadrado (X²).
	 * @param b = incognita na base 1(X).
	 * @param c = termo conhecido (numero).
	 * @return a raiz, ou as raizes de umas eqaução do 2º Grau.
	 */
	public double[] calcularRaizEquacao(float a, float b, float c); 
	
	/**
	 * @param a = incognita ao quadrado (X²).
	 * @param b = incognita na base 1(X).
	 * @param c = termo conhecido (numero).
	 * @return a retorna se a equação tem raizes validas.
	 */
	public boolean validarRaizes(float a, float b, float c);
	
	/**Retorna o valor correspodente a porcetagem. 
	 * @param numero Numero que representa a totalidade (100%).
	 * @param porcento Valor da porcentagem.
	 * @return valor da porcetagem
	 */
	public float calcularPorcentagem(float numero, float porcento);
	
	/**Retorna a porcetagem correspodente ha um valor.
	 * @param numero Numero que representa a totalidade (100%).
	 * @param valor Valor que deserja descobrir ha quantos porcento equivale.
	 * @return porcentagem
	 */
	public float calcularQuantosPorcentoDoNumero(float numero, float valor);
}
