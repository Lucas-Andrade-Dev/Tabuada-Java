package MeusProjetos;

import java.util.Scanner;

public class TabuadaComFor {
	
	private static Scanner ler;

	public static void main (String[] arg) {
		
		ler = new Scanner (System.in);
		
		int resultado=0; 
	    int vezes=0;
		int taboada=0;
		
		System.out.println("Escolha o numero da Taboada: ");
		taboada= ler.nextInt();
		
		System.out.println("Digite ate aonde deseja Muliplicar: ");
		vezes=ler.nextInt();
				
		for(int i = 0; i<=vezes; i++) {
			
			resultado= i*taboada;
			System.out.println(taboada+" X "+i+" = "+resultado);
		}
	}

}
