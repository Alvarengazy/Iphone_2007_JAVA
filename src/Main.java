import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Musica musica = new Musica();
        Internet internet = new Internet();
        Chamada chamada = new Chamada();
        Scanner scanner =  new Scanner(System.in);
        int opcao;

        

        do{
            System.out.println("""
                    ===Menu Principal===
                       1 - Musicas
                       2 - Chamadas
                       3 - Internet
                    ====================
                    """);
            System.out.print("Escolha uma das opções :");

            opcao = scanner.nextInt();

         switch (opcao) {
            case 1: musica.MenuMusica();
                
                break;
            case 2: chamada.menuChamada();
                
                break;
            case 3: internet.MenuNet();
                
                break;
         
            default: System.out.println("Opção inválida.");
                break;
         }
        }while (opcao != 0);
         {
            
        }
    }
}