package app.telas;

import app.config.Configuracao;
import app.config.Propriedades;

public class Tela1 extends TelaAbstrata implements Tela {
    public Tela1(String titulo) {
        super(titulo);
    }

    Configuracao configuracao;

    @Override
    public void carrega(Configuracao configuracao) {
        configuracao = Configuracao.getInstancia();

        Propriedades propriedades = new Propriedades();
        propriedades.addPropriedade("porta1", 80);

        configuracao.loadPropriedades(propriedades);
    }

    @Override
    public void conteudo(){
        System.out.println("Propriedades atualizadas pela Tela " + this.getTitulo());
        configuracao = Configuracao.getInstancia();

        Propriedades propriedadesTela1 =  this.configuracao.getPropriedades();

        for (String elemento : propriedadesTela1.getPropriedades().keySet()){
            String key = elemento.toString();
            String value = propriedadesTela1.getPropriedades().get(elemento).toString();  
            System.out.println(key + " " + value);  
        }
    }
}