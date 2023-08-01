package cu.cuzanzuca;
import java.util.Scanner;

public class Login 
{
    boolean loginSucess;
    Cliente verif_cliente = new Cliente();
    AddCliente cliente = new AddCliente();
    boolean isTrue;
    
    

    public void login_acess( )
    {
        Scanner input = new Scanner(System.in);
       
        int opUsuarios;
        
        System.out.println("******LOGIN******");
        
            System.out.println("1# Login");
            System.out.println("2# Log-out");
            System.out.println("0# Feixar o App ");
            System.out.println("   ");
            System.out.print("Escolha uma Opcao:");
            opUsuarios = input.nextInt();

        limpar_tela();
        for(;;)
        {
           
            
            if( opUsuarios == 1)
            {
                // chama login
                login();
            }
            else 
            if( opUsuarios == 2)
            {
                // chama tela de cadastro Usuario (Cliente)
                limpar_tela();
                 System.out.println("******CADASTRO******");
                 System.out.println("   ");
                isTrue = true;
                    while ( isTrue )
                    {
                        
                        cliente.add_cliente();
                        System.out.println("Cliente cadastrado com Sucesso");
                                
                        System.out.print("0 # Voltar ao Login_ ");
                        opUsuarios = input.nextInt();

                        if(opUsuarios == 0)
                        {
                            isTrue = false;
                            limpar_tela();
                            //login();
                            //cliente.listar();
                        }
                        else
                        {
                            System.out.println("Opcao Invalida, o programa ira fazer um close");
                            break;
                        }
                                
                    }
            }
            if(opUsuarios == 0)
            {
                //cliente.listar();
                //cliente.isValidUser("cuzanzuca", "123");
            }
            else
            {
                
                System.out.println("Opcao invalida ");
                System.out.println("0# Pra continuar");
                opUsuarios = input.nextInt();
                
                if(opUsuarios == 0)
                    login_acess();
                
            }
        }
    }

    

    public void login(  )
    {
        Scanner input = new Scanner(System.in);
            System.out.println("******LOGIN******");
            System.out.println("   ");

            input.nextLine();
            System.out.print("Entra com User name_");
            String nome = input.nextLine();
            System.out.print("Entra com a Senha_");
            String senha = input.nextLine();
            

            if (cliente.isValidUser(nome, senha))
            {
                System.out.println("Login Bem Sucedido");
                Imobiliaria imobiliaria = new Imobiliaria();
                imobiliaria.menu_principal();
                
            }
            else
            {
                System.out.println("Erro: Nome de Usuario ou Senha Incorreta");
                cliente.add_cliente();
            }

    }

    


    public static void limpar_tela()
    {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        } catch (Exception e) 
        {
            System.out.println((e));
        }
        
        
    }
    
}
