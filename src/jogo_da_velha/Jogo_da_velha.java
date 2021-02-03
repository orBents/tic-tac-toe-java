package jogo_da_velha;

public class Jogo_da_velha {
	
	public static void main(String[] args) {
		
		Funcoes rodando = new Funcoes();
		
		rodando.player();
		
		while(rodando.vencedor == false){
				
			rodando.imprimeVelha();
			
			rodando.jogadas();
			
			rodando.checagem();
			
			rodando.rodada();
			}
		
		rodando.imprimeVelha();
		System.out.println("\nO player " + rodando.ganhou + " venceu!!!");
	}

}
