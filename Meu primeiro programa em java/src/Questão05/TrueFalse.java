package Questão05;

import java.util.Scanner;

public class TrueFalse {
	public static void main(String[] args) {
		int numero;
		System.out.println("Digite o numero: ");
		
	Scanner ler = new Scanner (System.in);
	numero = ler.nextInt();
	System.out.print(ePar(numero));
	}

	private static boolean ePar(int numero) {
		// TODO Auto-generated method stub
		if (numero%2==0) {
			return true;
		}
		return false;
	}
	}