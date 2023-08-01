package cu.cuzanzuca;
import java.util.Scanner;

public class AddCliente 
{
    Cliente[] clientes = new Cliente[1];
     boolean isTrue;
    Usuarios[] user = new Usuarios[30];
    Scanner input = new Scanner( System.in );
    private String tipoUser = "Cliente";
    
    public void add_cliente()
    {

        for( int i = 0+1; i < clientes.length; i++)
        {
            clientes[i] = new Cliente();
            System.out.println("Entra com o primeiro Nome");
            clientes[i].setfirstName(input.nextLine()); 
            System.out.println("Entra com o segundo Nome");
            clientes[i].setMidleName(input.nextLine());
            System.out.println("Entra com o ultimo Nome");
            clientes[i].setLasteName(input.nextLine());
            System.out.println("Entra com a Data de nascimento");
            clientes[i].setDataNascimento(input.nextLine());
            System.out.println("........................");
            System.out.println("Entra com seu User Name");
            clientes[i].setUserName(input.nextLine());
            System.out.println("Entra com sua palavra pass");
            clientes[i].setPassWord(input.nextLine());
        
            
        }
         for(int i = 0; i< clientes.length; i++)
        {
            System.out.println(clientes[i].getUserName());
            System.out.println(clientes[i].getPassWord());
            break;
        }

        
    }

    
    public boolean isValidUser(String username, String password) {
        for (int i = 0; i < clientes.length; i++) {
           
            if (clientes[i].getUserName().equals(username) && clientes[i].getPassWord().equals(password)) {
                return true;
            }
        }
        return false;
    }

    
}
