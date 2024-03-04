package controller;

public class ToBinaryController {
	
	public ToBinaryController() {
		super();
	}
	
	public String toBinary(int n) {
		//A recursividade se encerra quando nao for mais possivel dividir o numero por 2,
		//retornando o resto da divisao por 2 como string
		if(n / 2 == 0) {
			return String.valueOf(n % 2);
		} else {
			//O metodo e chamado passando com parametro a divisao do 'n' atual por 2
			//concatenado ao resto da divisao da execucao do metodo atual
			//A chamada e feita primeiro para que no fim os digitos do binario estejam na ordem correta
			return toBinary(n / 2) + String.valueOf(n % 2);
		}
	}
}
