package app.singleton.telas;

import app.singleton.config.Configuracao;

public interface Tela{
    public void carrega(Configuracao configuracao);
    public void conteudo();
}