package controller;

public class BinarioController {
	
	public BinarioController() {
		super();
	}
	
	public String converteParaBinario(int num, String binario) {
		// se num for igual a zero, retornamos a string binario encontrada
		if (num == 0) {
			return binario;
		} else {
			// se não, retornamos a função, passando como parâmetros (num / 2) e a string de (num % 2)
			// concatenamos isso com a string binario para que o sentido da leitura fique correto
			return converteParaBinario(num / 2, String.valueOf(num % 2)) + binario;
		}
	}
}
