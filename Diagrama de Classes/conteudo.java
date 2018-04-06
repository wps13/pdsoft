public class conteudo{

    private int ano; 
    private String sinopse;
    private String genero;
    private Float avaliacao;

    public int getAno(){
        return ano;
    }
    protected void setAno(int ano){
        this.ano = ano;
    }
    public String getSinopse(){
        return sinopse;
    }
    protected void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }
    public String getGenero(){
        return genero;
    }
    protected void setGenero(String genero){
        this.genero = genero;
    }
    public Float getAvaliacao(){
        return avaliacao;
    }
    protected void setAvaliacao(Float avaliacao){
        this.avaliacao = avaliacao;
    }

}