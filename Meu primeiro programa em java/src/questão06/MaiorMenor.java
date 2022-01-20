package questão06;
// verificador de maior número de 5 variaveis.
import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a[] = new int[10];
       
        int temp = 0;
        System.out.print("Entre com o primeiro numero:\n");  
        a[0] = ler.nextInt();
        System.out.print("Entre com o segundo numero:\n");  
        a[1] = ler.nextInt();
        System.out.print("Entre com o terceiro numero:\n");  
        a[2] = ler.nextInt();
        System.out.print("Entre com o quarto numero:\n");  
        a[3] = ler.nextInt();
        System.out.print("Entre com o quinto numero:\n");  
        a[4] = ler.nextInt();
        
        for(int i=0; i<5;i++) {
            
            if(temp<a[i]) {
                temp=a[i];
            }
        }
        System.out.print(temp);
        
    }
}





