package app.singleton.telas;

public abstract class TelaAbstrata{
    private String titulo;
    private int altura;
    private int largura;

    public TelaAbstrata(String titulo){
        this.titulo = titulo;
        this.altura = 300;
        this.largura = 500;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public int getAltura(){
        return this.altura;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getLargura(){
        return this.largura;
    }

}