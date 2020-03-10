package app.telas;

import app.config.Configuracao;
import app.config.Propriedades;

public class Tela2 implements Tela {
    Configuracao configuracao;

    public void setConfiguracao(Configuracao configuracao){
        this.configuracao = configuracao;
    }

    @Override
    public void carrega() {
        configuracao = Configuracao.getInstancia();

        Propriedades propriedades = new Propriedades();
        propriedades.addPropriedade("porta1", 8081);
        propriedades.addPropriedade("porta2", 8082);
        propriedades.addPropriedade("porta3", 8083);
        propriedades.addPropriedade("admin", "secret");

        configuracao.loadPropriedades(propriedades);

        System.out.println("Propriedades atualizadas pela Tela2");

        Propriedades propriedadesTela2 =  configuracao.getPropriedades();

        for (String elemento : propriedadesTela2.getPropriedades().keySet()){
            String key = elemento.toString();
            String value = propriedadesTela2.getPropriedades().get(elemento).toString();  
            System.out.println(key + " " + value);  
        }

    }
}