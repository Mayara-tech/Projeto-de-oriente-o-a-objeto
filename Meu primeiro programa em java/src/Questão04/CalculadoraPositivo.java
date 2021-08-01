package Questão04;

import java.util.Scanner;

public class CalculadoraPositivo {
	public static void main(String[] args) {
		int numero;
		int resultado=0;
		
		
	Scanner ler = new Scanner (System.in);
		
		do {
				System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
				numero = ler.nextInt();
				if (numero>=0) {
					resultado += numero;
				}
			
		} while(numero >=0); 
			System.out.println("A soma é: "+ resultado);
			
		}
		}

