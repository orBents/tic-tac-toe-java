package jogo_da_velha;
import java.util.Scanner;

public class Funcoes {
	
	Scanner entrada = new Scanner(System.in);
	
	String[][] jogoVelha = new String[3][3];
	
	String[] preenche = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I"};
	
	String[] backup = preenche;
	
	String player, jogada, rodada, ganhou;
	
	boolean vencedor = false;
	
	
	public void jogadas() {
		
		boolean estado = false;
		
		while(estado == false) {
			
			System.out.println("\nJogador " + rodada +": Insira a posição desejada:");
			jogada = entrada.nextLine().toUpperCase();
			if(jogada.equals("O") || jogada.equals("X")){
				System.out.println("\nInsira uma posição não ocupada!");
			}else
				
			for(int i = 0; i < 9; i++) {
				
				
				if(jogada.equals(preenche[i])) {
					
				preenche[i] = rodada;
				preenchimento();
				estado = true;
						
				}

			}
			
			System.out.println("Insira uma posição válida!");
			imprimeVelha();
			
	
		}
	
	}
	
	public void checagem() {
		
		for(int linha = 0; linha < 3; linha++) {
			
			int contadorx = 0;
			int contadory = 0;
			
			for(int coluna = 0; coluna < 3; coluna ++) {
				
				if(jogoVelha[linha][coluna].equals(rodada)) contadorx++;
				if(jogoVelha[coluna][linha].equals(rodada)) contadory++;
				if(jogoVelha[0][0].equals(rodada) && jogoVelha[1][1].equals(rodada) && jogoVelha[2][2].equals(rodada)) contadorx = 3;
				if(jogoVelha[0][2].equals(rodada) && jogoVelha[1][1].equals(rodada) && jogoVelha[2][0].equals(rodada)) contadorx = 3;
				
				if(contadorx == 3 || contadory == 3) {
					
					vencedor = true;
					
					//GAMBIARRA//
					
					if(vencedor == true) {
						ganhou = rodada; 
						preenchimento();
						};
					
					//GAMBIARRA//
					
					break;
					}
			}		
		}
	}
	
	public void rodada() {
		
		if(rodada.equals("X")) {rodada = "O";}
		else rodada = "X";
		
		
	}
	
	public void player() {
		
		boolean estado = false;
		
		while(estado == false) {
			
			System.out.println("Escolha entre (X ou O): ");
			player = entrada.nextLine().toUpperCase();
			
			if(player.equals("X") || player.equals("O")) {
				estado = true;
			}
			else {
				System.out.println("\nInsira um caractere válido!");
			}
			
		}
		
		rodada = player;
		
	}
	
	public void preenchimento() {
		
		int contador = 0;
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				jogoVelha[i][j] = preenche[contador];
				contador++;
		
			}
		}
	}


	public void imprimeVelha() {
		
		preenchimento();
		
		System.out.println(" \nJOGO DA VELHA\n");
			for(int i = 0; i < 3; i++) {
			
        	   for(int j = 0; j < 3; j++) {
				
				 	System.out.print(jogoVelha[i][j]);
					if(j < 2)System.out.print("  |  ");
		
			 	}
        	   
	        System.out.println("");
	        if(i < 2) System.out.println("———————————————");
			 
         }
	
	}

	public static void main(String[] args) {
		
	}
}