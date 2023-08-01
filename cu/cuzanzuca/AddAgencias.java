package cu.cuzanzuca;
import java.util.Scanner;

public class AddAgencias 
{
    Agencias[] agencias = new Agencias[1];
    Scanner input = new Scanner(System.in);
    public void cadastroAg()
    {
        
        for (int i = 0; i < agencias.length; i++)
        {
            Agencias ag = new Agencias();

            System.out.print("Entra com nome Agencia:");
            String nome = input.nextLine();

            System.out.print("Entra com NIF:");
            String NIF = input.nextLine();

            System.out.print("Entra com localizacao:");
            String localizacao = input.nextLine();
            ag.castroAgencia(nome, NIF, localizacao);

            agencias[i] = ag;
        }

        

    }

    public void listar_agencias()
    {
        for( int j = 0; j < agencias.length; j++)
        {
            System.out.println(agencias[j].getNomeAgencia());
            System.out.println(agencias[j].getNIF());
            System.out.println(agencias[j].getLocalizacao());
           
        }

    }
    
}
