package model;

public class NaoExistemRaizesReaisException extends Exception{
	
	public NaoExistemRaizesReaisException() {
		super("Não existem raizes Reais para Delta negativo!");
	}

}
