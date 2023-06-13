package app.singleton.principal;

import app.singleton.config.Configuracao;
import app.singleton.config.Propriedades;
import app.singleton.telas.Tela;
import app.singleton.telas.Tela1;
import app.singleton.telas.Tela2;

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
        
        Tela tela1 = new Tela1("Tela1");
        tela1.carrega(configuracaoGlobal);
        tela1.conteudo();

        Tela tela2 = new Tela2("Tela2");
        tela2.carrega(configuracaoGlobal);
        tela2.conteudo();

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