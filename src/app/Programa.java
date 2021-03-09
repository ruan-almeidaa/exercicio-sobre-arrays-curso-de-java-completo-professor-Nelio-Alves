package app;
import entities.Quartos;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Quartos[] quartos = new Quartos[10];
        
        System.out.println("quantos quartos serão alugados?");
        int n = sc.nextInt();
        
        for(int i = 0; i<n; i++){
            System.out.println("informe o numero do quarto:");
            int quartoEscolhido = sc.nextInt();
            System.out.println("informe o nome de quem está alugando o quarto:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("informe o email de quem está alugando o quarto: ");
            String email = sc.nextLine();
            quartos[quartoEscolhido] = new Quartos(nome, email);
        }
        
        for(int i = 0; i<quartos.length;i++){
            if (quartos[i] != null) {
                
                System.out.println(i + ", " + quartos[i]);
                
            }
        }
    }
}
