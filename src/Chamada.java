import java.util.Scanner;

public class Chamada {
Scanner scanner = new Scanner(System.in);
  public void Ligar(){
    System.out.println("Digite o numero com DD :");
    int numero = scanner.nextInt();
    System.out.println("Sua chamada caiu na caixa posta...");
  }
  public void Atender(){
    System.out.println("Não tem te ligando no momento, desculpe");
  }
  public void VoiceMail(){
    System.out.println("""
            Você tem 1 mensagem guardada, lendo ela em texto...

            Vó: Olá, meu neto querido, como vão as coisas ? 
            """);
  }
  
  public void menuChamada(){
    
    int opcao1;
   
    do {
        System.out.println("""
                ===Menu Chamada===
                   1 - Ligar
                   2 - Atender
                   3 - VoiceMail
                   0 - Voltar
                ===================
                """);
        opcao1= scanner.nextInt();

      switch (opcao1)  {
        case 1 : Ligar();
            
            break;
        case 2 : Atender();
            
            break;
        case 3 : VoiceMail();
            
            break;
        case 0 : System.out.println("Voltando ao menu principal...");
            
            break;
      
        default:System.out.println("Opção Invalida");
            break;
      }

    }while(opcao1 !=0);{

    }



  }
  
}