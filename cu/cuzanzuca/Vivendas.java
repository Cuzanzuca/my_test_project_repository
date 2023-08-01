package cu.cuzanzuca;

public class Vivendas extends Imoveis
{
    public void add_to_vivenda( String anoContrucao, String area, String localizacao,
    String tipologia, String preco)
    {
        super.ano_construcao = anoContrucao;
        super.area = area;
        super.localizacao = localizacao;
        super.tipologia = tipologia;
        super.preco = preco;
    }
    
}
