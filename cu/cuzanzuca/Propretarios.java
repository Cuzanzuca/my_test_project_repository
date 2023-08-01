package cu.cuzanzuca;
import java.util.Arrays;
import java.util.Scanner;

public class Propretarios extends Usuarios
{
    private String propretario_id;
    private String nomeAgencia;

    int cont = 0;
    Apartamentos[] apartamento = new Apartamentos[15];
    Vivendas[] vivendas = new Vivendas[30];
    Terrenos[] terrenos = new Terrenos[30];
    Apartamentos[] auxVet = new Apartamentos[30];
    Scanner input = new Scanner(System.in);


    public void add_to_propretario(  String firstName, String midleName, String lastName, String dataNascimento)
    {
        super.firstName = firstName;
        super.midleName = midleName;
        super.lastName = lastName;
        super.dataNascimento = dataNascimento;
    }

    public void setPropretarioID(String propretario_id)
    {
        this.propretario_id = propretario_id;
    }
    public void setNomeAgencia( String nomeAgencia)
    {
        this.nomeAgencia = nomeAgencia;
    }

    public  void  add_apartamento( )
    { 
        
        for(int i = 0+cont; i < apartamento.length; i++)
        {
            
            apartamento[i] = new Apartamentos();

            System.out.print("Entra com ano de construcao_ ");
            apartamento[i].setAnoConstrucao(input.nextLine());

            System.out.print("Entra com a area_ ");
            apartamento[i].setArea(input.nextLine());

            System.out.print("Entra com a localizacao_ ");
            apartamento[i].setLocalizacao(input.nextLine());

            System.out.print("Entra com a Tipologia_ ");
            apartamento[i].setTipologia(input.nextLine());

            System.out.print("Entra com preco_ ");
            apartamento[i].setPreco(input.nextLine());
                
            break;
        }
        
                
    }
         
    public void listar_apartamentos()
    {
        for (int i = 0; i < apartamento.length; i++)
        {
            System.out.println(apartamento[i].getAnoConstrucao());
            System.out.println(apartamento[i].getArea());
            System.out.println(apartamento[i].getLocalizacao());
            System.out.println(apartamento[i].getPreco());
            System.out.println(apartamento[i].getTipologia());
            System.out.println(apartamento[i].getTipologia());
        } 
        
    }
    //Methoth para adicionar vivendas
    public void add_vivenda()
    {
       for(int i = 0; i < vivendas.length; i++)
       {
            vivendas[i] = new Vivendas();

            System.out.print("Entra com ano de construcao_ ");
            vivendas[i].setAnoConstrucao(input.nextLine());

            System.out.print("Entra com a area_ ");
            vivendas[i].setArea(input.nextLine());

            System.out.print(" Entra com a localizacao_ ");
            vivendas[i].setLocalizacao(input.nextLine());

            System.out.print("Entra com a Tipologia_ ");
            vivendas[i].setTipologia(input.nextLine());

            System.out.print("Entra com preco_ ");
            vivendas[i].setPreco(input.nextLine());

       }
       
   
    }
    //listar Vivenda
    public void listar_vivenda()
    {
        for (int i = 0; i < apartamento.length; i++)
        {
            System.out.println(vivendas[0].getAnoConstrucao());
            System.out.println(vivendas[0].getArea());
            System.out.println(vivendas[0].getLocalizacao());
            System.out.println(vivendas[0].getPreco());
            System.out.println(vivendas[0].getTipologia());
            System.out.println(vivendas[0].getTipologia());
        } 
        
    }
    // listar apartamentos
    
    public void add_terreno()
    {
       for(int i = 0; i < terrenos.length; i++)
       {
            terrenos[i] = new Terrenos();

            System.out.print("Entra com a area_ ");
            terrenos[i].setArea(input.nextLine());

            System.out.print(" Entra com a localizacao_ ");
            terrenos[i].setLocalizacao(input.nextLine());

            System.out.print("Entra com preco_ ");
            terrenos[i].setPreco(input.nextLine());


       }
   
    }
    // listar apartamentos
    public void listar_terrenos()
     {
        for (int i = 0; i < terrenos.length;i++ )
        {
            System.out.println(terrenos[i].getAnoConstrucao());
            System.out.println(terrenos[i].getArea());
            System.out.println(terrenos[i].getLocalizacao());
            System.out.println(terrenos[i].getPreco());
        }
     }
    
    
    

    
}
