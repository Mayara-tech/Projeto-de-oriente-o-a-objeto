package Quest�o03;

import java.util.Scanner;

public class CalculadoraApp {
	public static void main(String[] args) {
		String opera��o;
		String c�lculo;
		int numero1;
		int numero2;
		int soma;
		int subtra��o;
		int multiplica��o;
		String valores;
			Scanner ler = new Scanner(System.in);
			System.out.println("Entre com a opera��o a ser realizada (+, - ou *): ");    
			opera��o = ler.nextLine();
			System.out.println("Entre com o primeiro n�mero: ");    
        numero1 = ler.nextInt();
        System.out.println("Entre com o segundo n�mero: ");    
        numero2 = ler.nextInt();
        soma=numero1+numero2;
        subtra��o=numero1-numero2;
        multiplica��o=numero1*numero2;
        switch (opera��o) {
        	case "+": c�lculo = ("O resultado da opera��o �: " + soma);
        	break;
        	case "-": c�lculo = ("O resultado da opera��o �: " + subtra��o);
        	break;
        	case "*": c�lculo = ("O resultado da opera��o �: " + multiplica��o);
        	break;
        	default: c�lculo ="Opera��o inv�lida";
        	break;
        }
        System.out.println(c�lculo);
		
	}
}
