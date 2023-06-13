package app.singleton.config;

public class Configuracao{
    private static Configuracao instancia;

    private Propriedades propriedades;

    public static Configuracao getInstancia(){
        if (instancia == null){
            instancia =  new Configuracao();
        }
        return instancia;
    }

    public void loadPropriedades(Propriedades propriedades){
        this.propriedades = propriedades;
    }    
    private Configuracao(){
        loadPropriedades(propriedades);
    }

    public Propriedades getPropriedades(){
        return this.propriedades;
    }

}