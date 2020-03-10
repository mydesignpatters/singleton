package app.telas;

import app.config.Configuracao;
import app.config.Propriedades;

public class Tela2 extends TelaAbstrata implements Tela {
    public Tela2(String titulo) {
        super(titulo);
    }

    Configuracao configuracao;

    @Override
    public void carrega(Configuracao configuracao) {
        configuracao = Configuracao.getInstancia();

        Propriedades propriedades = new Propriedades();
        propriedades.addPropriedade("porta1", 8081);
        propriedades.addPropriedade("porta2", 8082);
        propriedades.addPropriedade("porta3", 8083);
        propriedades.addPropriedade("admin", "secret");

        configuracao.loadPropriedades(propriedades);
    }

    @Override
    public void conteudo(){
        System.out.println("Propriedades atualizadas pela Tela " + this.getTitulo());

        configuracao = Configuracao.getInstancia();
        
        Propriedades propriedadesTela1 =  configuracao.getPropriedades();

        for (String elemento : propriedadesTela1.getPropriedades().keySet()){
            String key = elemento.toString();
            String value = propriedadesTela1.getPropriedades().get(elemento).toString();  
            System.out.println(key + " " + value);  
        }
    }

}