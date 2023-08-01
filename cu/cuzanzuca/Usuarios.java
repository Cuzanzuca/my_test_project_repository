package cu.cuzanzuca;
import java.util.Date;

public class Usuarios 
{
    protected String firstName;
    protected String midleName;
    protected String lastName;
    protected String dataNascimento;
    protected String userName;
    protected String passWord;
    protected String tipoUsuario;

    // Construtor
    public Usuarios(){}
    public void metUsuaroio( String firstName, String midleName, String lastName, 
    String dataNascimento, String userName, String passWord, String tipoUsuario)
    {
        this.firstName = firstName;
        this.midleName = midleName;
        this.lastName = lastName;
        this.dataNascimento = dataNascimento;
        this.userName = userName;
        this.passWord = passWord;
        this.tipoUsuario = tipoUsuario;
    }
    // geters e seters pass
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getPassWord() {
        return passWord;
    }
    // geters e seters UserName
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    // geters e seters UserName
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }


    // METHOTHS
        // Methoth firstName setter e getter
    public void setfirstName( String firstName )
    {
        this.firstName = firstName.toUpperCase();
    }
    public String getFirstName()
    {
        return firstName;
    }
    // Methoth midleName setter e getter
    public void setMidleName ( String midleName )
    {
        this.midleName = midleName.toUpperCase();
    }
    public String getMidleName()
    {
        return midleName;
    }
    // Methoth lastName setter e getter
    public void setLasteName ( String lasteName )
    {
        this.lastName = lasteName.toUpperCase();
    }
    public String getLastName()
    {
        return lastName;
    }
    // Methoth firstName setter e getter
    public void setDataNascimento( String dataNascimento )
    {
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento()
    {
        return dataNascimento;
    }


}
