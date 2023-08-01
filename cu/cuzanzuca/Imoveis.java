package cu.cuzanzuca;

public class Imoveis 
{
    protected String ano_construcao;
    protected String area;
    protected String localizacao;
    protected String tipologia;
    protected String preco;

    // Construtor 
    //public Imoveis(){}
    
    // METHOTHS
        // Methoth AnoConstrucao setter e getter
    public void setAnoConstrucao( String ano_construcao )
    {
        this.ano_construcao = ano_construcao;
    }
    public String getAnoConstrucao()
    {
        return ano_construcao;
    }

        // Methoth Area setter e getter
    public void setArea( String area )
    {
        this.area = area;
    }
    public String getArea()
    {
        return area;
    }
        // Methoth Localizacao setter e getter
    public void setLocalizacao( String localizacao )
    {
        this.localizacao = localizacao;
    }
    public String getLocalizacao()
    {
        return localizacao;
    }
        // Methoth Tipologia setter e getter
    public void setTipologia( String tipologia )
    {
        this.tipologia = tipologia;
    }
    public String getTipologia()
    {
        return tipologia;
    }
        // Methoth Preco setter e getter
    public void setPreco ( String preco )
    {
        this.preco = preco;
    }
    public String getPreco()
    {
        return preco;
    }


    
}
