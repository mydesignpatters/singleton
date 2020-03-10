package app.principal;

import app.config.Configuracao;
import app.config.Propriedades;
import app.telas.Tela;
import app.telas.Tela1;
import app.telas.Tela2;

public class App{
    public static void main(String[] args) {
        System.out.println("Teste Design Pattern Singleton");

        Configuracao configuracaoGlobal = Configuracao.getInstancia();

        System.out.println("Propriedades iniciais: porta1=8081, porta2=8082, admin=admin");
        Propriedades p1 = new Propriedades();
        p1.addPropriedade("porta1", 8081);
        p1.addPropriedade("porta2", 8082);
        p1.addPropriedade("admin", "admin");

        configuracaoGlobal.loadPropriedades(p1);
        
        Tela tela1 = new Tela1();
        tela1.setConfiguracao(configuracaoGlobal);
        tela1.carrega();

        Tela tela2 = new Tela2();
        tela2.setConfiguracao(configuracaoGlobal);
        tela2.carrega();

        System.out.println("Propriedades da configuracao global");

        //mostra as configuracoes carregas apos as chamadas das telas 1 e 2
        Propriedades pGlobal = configuracaoGlobal.getPropriedades();

        for (String elemento : pGlobal.getPropriedades().keySet()){
            String key = elemento.toString();
            String value = pGlobal.getPropriedades().get(elemento).toString();  
            System.out.println(key + " " + value);  
        }
    }
}