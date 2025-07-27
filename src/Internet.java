

import java.util.Scanner;

public class Internet {

  public void Exibir(){
    System.out.println("Qual a URL do site");
  }
  public void AdicionarAba(){
    System.out.println("Nova Aba Dicionada");
  }
  public void Atualizar(){
    System.out.println("Atualizando Pagina...");
  }
  
  public void MenuNet(){
    Scanner scanner = new Scanner(System.in);
    int opcao1;
   
    do {
        System.out.println("""
                ===Menu Internet===
                   1 - Pesquisar
                   2 - Nova Pagina
                   3 - Atualizar 
                   0 - Voltar
                ===================
                """);
        opcao1= scanner.nextInt();

      switch (opcao1)  {
        case 1 : Exibir();
            
            break;
        case 2 : AdicionarAba();
            
            break;
        case 3 : Atualizar();
            
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