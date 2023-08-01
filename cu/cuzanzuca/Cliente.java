package cu.cuzanzuca;

public class Cliente extends Usuarios
{
    private int sizeOff;
    public Cliente(){}
    public Cliente( String firstName, String midleName, String lastName, String dataNascimento
    , String passWord, String userName)
    {
        super.firstName = firstName;
        super.midleName = midleName;
        super.lastName = lastName;
        super.dataNascimento = dataNascimento;
        super.passWord = passWord;
        super.userName = userName;
        super.tipoUsuario = "Cliente"; 
    }

    public void setSizeOff(int sizeOff) 
    {
        this.sizeOff = sizeOff;
    }
    public int getSizeOff() 
    {
        return sizeOff;
    }

    
    
}
