package cu.cuzanzuca;


public class Apartamentos extends Imoveis
{
    public Apartamentos(){}
    public Apartamentos( String anoContrucao, String area, String localizacao,
    String tipologia, String preco )
    {
        super.ano_construcao = anoContrucao;
        super.area = area;
        super.localizacao = localizacao;
        super.tipologia = tipologia;
        super.preco = preco;
    }

    
    
}

