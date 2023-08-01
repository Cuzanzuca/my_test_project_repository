package cu.cuzanzuca;
import java.util.Date;

public class Funcionarios extends Usuarios
{
    protected String funcionario_id;
    protected String nomeAgencia;
    protected String salario;
    //private  Agencias agencia;
    public void add_to_funcionario( String firstName, String midleName, String lastName, String dataNascimento)
    {
        super.firstName = firstName;
        super.midleName = midleName;
        super.lastName = lastName;
        super.dataNascimento = dataNascimento;

    }

    public void setFuncionario_Id( String funcionario_Id)
    {
        this.funcionario_id = funcionario_Id;
    }
    public void setNomeAgencia( String nomeAgencia)
    {
        this.nomeAgencia = nomeAgencia;
    }
    public void setSalario( String salario)
    {
        this.salario = salario;
    }

    public String getFuncionarioID()
    {
        return funcionario_id;
    }
    public String getNomeAgencia()
    {
        return nomeAgencia;
    }
    public String getSalario()
    {
        return salario;
    }

   
    
}
