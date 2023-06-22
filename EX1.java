import java.util.Scanner;

public class EX1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Infome um numero ");
        int x = entrada.nextInt();
        System.out.println("Infome um numero ");
        int y = entrada.nextInt();
        System.out.println("Infome um numero ");
        int z = entrada.nextInt();
        
        int soma = (x + y + z);
        
        System.out.println("A soma dos três números é: " + soma);

        entrada.close();
    }    
}   

