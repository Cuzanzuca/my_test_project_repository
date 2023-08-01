package cu.cuzanzuca;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Imobiliaria {
    
    Agencias[] agencias = new Agencias[1]; 
    Usuarios[] usuarios = new Usuarios[30];
    Cliente verif_cliente = new Cliente();
    Vendas[] vendas = new Vendas[30];
    Reservas[] reservas = new Reservas[30];
    Aluguel[] aluguel = new Aluguel[30];

    Scanner input = new Scanner(System.in);
    Propretarios proprietario = new Propretarios();
    AddAgencias add_agencias = new AddAgencias();
    AddCliente add_cliente = new AddCliente();
    Agencias agencia = new Agencias();
    int opUsuarios;
    int add = 0;
    static boolean isTrue;
    
    
    //Agencias ag = new Agencias();

    public void menu_principal()
    {
        
        for(;;)
        {
            String tipoUsuario = verif_cliente.getTipoUsuario();
                System.out.println("____MENU____");

            // Aqui mostarmos o menu consoante o tipo de usuario
                System.out.println("   ");

                if( tipoUsuario.equals("cliente"))
                {
                    System.out.println("1# Reservar Imovel");
                    System.out.println("2# Alugar  Imovel");
                    System.out.println("2# Solicitar a compra de Imovel");
                    System.out.println("3# Encontrar Imoveis Disponiveis ");
                    System.out.println("0# Sair ");

                }
                else
                if( tipoUsuario.equals("proprietario"))
                {
                    System.out.println("1# Cadastra Terreno");
                    System.out.println("1# Cadastra Imovel");
                    System.out.println("1# Cadastra Apartamento");
                    System.out.println("2# Listar Meus Imoveis");
                    System.out.println("3# listar  Meus Imoveis vendidos ");
                    System.out.println("0# Sair ");

                    System.out.print("Escolha uma Opcao:");
                    opUsuarios = input.nextInt();
                    
                        if(opUsuarios == 1)
                        {
                            //Cadastrando Usuarios
                            isTrue = true;
                            while ( isTrue )
                            {
                                limpar_tela();
                                proprietario.add_terreno(); 
                                System.out.println("Terreno cadastrado com Sucesso");
                                
                                System.out.println("1 # Cadastrar mais Terreno ");
                                System.out.println("0 # Voltar ao Menu Principal ");
                                System.out.print("Escolha uma Opcao:");
                                opUsuarios = input.nextInt();

                                if(opUsuarios == 0)
                                {
                                    isTrue = false;
                                    limpar_tela();
                                    menu_principal(); 
                                }
                                
                            }
                        }

                }
                else 
                if(tipoUsuario.equals("funcionario"))
                {
                    System.out.println("1# Cadastra Imovel");
                    System.out.println("2# Listar Terrenos");
                    System.out.println("3# listar Apartamentos ");
                    System.out.println("4# listar Vivendas ");
                    System.out.println("5# listar Imoveis vendidos ");
                    System.out.println("6# Efetuar Venda ");
                    
                    System.out.println("0# Sair ");

                }
                else 
                if(tipoUsuario.equals("admin"))
                {
                    // Menu para o Admin
                }
                else{ System.out.println("Error: Usuario nao encontrado");
            }
        } 
    }
                

    
    // Cadastrar Usuarios 
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
