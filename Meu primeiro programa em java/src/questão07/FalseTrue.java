package questão07;
// Verificador de caractere;
import java.util.Scanner;

public class FalseTrue {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        	char digito;
        System.out.print("Digite o caracter a ser verificado: ");  
        		digito = ler.next().charAt(0);
        			if(Character.digit(digito, 10)>0) {
        					System.out.print(true);
        					}else System.out.print(false);
      
    } 
    }




