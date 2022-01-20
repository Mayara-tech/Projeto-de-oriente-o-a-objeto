package Questão03;
// calculadora de soma, subtração e multiplicação de 2 números;
import java.util.Scanner;

public class CalculadoraApp {
	public static void main(String[] args) {
		String operação;
		String cálculo;
		int numero1;
		int numero2;
		int soma;
		int subtração;
		int multiplicação;
		String valores;
			Scanner ler = new Scanner(System.in);
			System.out.println("Entre com a operação a ser realizada (+, - ou *): ");    
			operação = ler.nextLine();
			System.out.println("Entre com o primeiro número: ");    
        numero1 = ler.nextInt();
        System.out.println("Entre com o segundo número: ");    
        numero2 = ler.nextInt();
        soma=numero1+numero2;
        subtração=numero1-numero2;
        multiplicação=numero1*numero2;
        switch (operação) {
        	case "+": cálculo = ("O resultado da operação é: " + soma);
        	break;
        	case "-": cálculo = ("O resultado da operação é: " + subtração);
        	break;
        	case "*": cálculo = ("O resultado da operação é: " + multiplicação);
        	break;
        	default: cálculo ="Operação inválida";
        	break;
        }
        System.out.println(cálculo);
		
	}
}
