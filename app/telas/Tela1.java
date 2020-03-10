package app.telas;

import app.config.Configuracao;
import app.config.Propriedades;

public class Tela1 implements Tela {
    Configuracao configuracao;

    public void setConfiguracao(Configuracao configuracao){
        this.configuracao = configuracao;
    }

    @Override
    public void carrega() {
        configuracao = Configuracao.getInstancia();

        Propriedades propriedades = new Propriedades();
        propriedades.addPropriedade("porta1", 80);

        configuracao.loadPropriedades(propriedades);

        System.out.println("Propriedades atualizadas pela Tela1");

        Propriedades propriedadesTela1 =  configuracao.getPropriedades();

        for (String elemento : propriedadesTela1.getPropriedades().keySet()){
            String key = elemento.toString();
            String value = propriedadesTela1.getPropriedades().get(elemento).toString();  
            System.out.println(key + " " + value);  
        }

    }
}