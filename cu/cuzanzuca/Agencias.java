package cu.cuzanzuca;
import java.util.Scanner;

public class Agencias 
{
    Scanner input = new Scanner(System.in);
    private String nomeAgencia;
    private String NIF;
    private String localizacao;
    Propretarios[] propretarios = new Propretarios[30];
    Funcionarios[] funcionarios = new Funcionarios[30];

    public void castroAgencia( String nomeAgencia, String  NIF, String localizacao )
    {
        this.nomeAgencia = nomeAgencia;
        this.NIF = NIF;
        this.localizacao = localizacao;
    }
    public String getNomeAgencia()
    {
        return nomeAgencia;
    }
    public String getNIF()
    {
        return NIF;
    }
    public String getLocalizacao()
    {
        return localizacao;
    }

    public void addFuncionario()
    {
        for(int i = 0; i < funcionarios.length; i++)
        {
            Funcionarios fc = new Funcionarios();

            System.out.println("Entra com o primeiro Nome");
            fc.setfirstName(input.nextLine()); 
            System.out.println("Entra com o segundo Nome");
            fc.setMidleName(input.nextLine());
            System.out.println("Entra com o ultimo Nome");
            fc.setLasteName(input.nextLine());
            System.out.println("Entra com a Data de nascimento");
            fc.setDataNascimento(input.nextLine());
            System.out.println("Entra com ID do funcionario");
            fc.setFuncionario_Id(input.nextLine());
            System.out.println("Entra com nome da Agencia");
            fc.setNomeAgencia(input.nextLine());
            System.out.println("Entra com o salario");
            fc.setSalario(input.nextLine());
            funcionarios[i] = fc;

        }

    }

    public void addPropretario()
    {
        for(int i = 0+1; i < funcionarios.length; i++)
        {
            propretarios[i] = new Propretarios();

            System.out.println("Entra com o primeiro Nome");
            propretarios[i].setfirstName(input.nextLine()); 
            System.out.println("Entra com o segundo Nome");
            propretarios[i].setMidleName(input.nextLine());
            System.out.println("Entra com o ultimo Nome");
            propretarios[i].setLasteName(input.nextLine());
            System.out.println("Entra com a Data de nascimento");
            propretarios[i].setDataNascimento(input.nextLine());
            System.out.println("Entra com ID do propretario");
            propretarios[i].setNomeAgencia(input.nextLine());
            System.out.println("Entra com nome da Agencia");
            propretarios[i].setNomeAgencia(input.nextLine());

        }

    }
   
    
}
