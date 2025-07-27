import java.util.Scanner;

public class Musica{
    public void Tocar(){
        System.out.print("Escolha sua musica :");
    }
    public void Pause(){
        System.out.println("Musica pausada");
    }
    public void TrocarMusica(){
        System.out.println("Escolha sua nova musica :");
    }

    public void MenuMusica(){
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do{
        System.out.println("""
                ===Menu Musical===
                    1 - Tocar 
                    2 - Pausar 
                    3 - Trocar 
                    0 - Voltar
                ==================
                
                """);
     opcao = scanner.nextInt();
     
     switch (opcao) {
        case 1 : Tocar();
            
            break;

            case 2 : Pause();
            
            break;

            case 3 : TrocarMusica();
            
            break;

            case 0 : System.out.println("Voltando ao menu principal...");
            
            break; 
            
     
        default:System.out.println("Opção Invalida");
            break;
     }
    } while (opcao !=0); {
        
    }
 }
}