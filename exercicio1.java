import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       for (int i = 1; i <= 5; i++) {
           System.out.println("Informe um número: ");
           int x = leitor.nextInt();
           if (x % 2 == 0) {
               System.out.println("Par");
               
           } else{
               System.out.println("Ímpar");
           }
           
       } leitor.close();
        
    }
    
}
