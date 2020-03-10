package app.config;

import java.util.HashMap;
import java.util.Map;

public class Propriedades {
    final Map<String, Object> propriedades = new HashMap<String, Object>();

    public void addPropriedade(String chave, Object valor){
        propriedades.put(chave, valor);
    }

    public Map<String, Object> getPropriedades() {
        return this.propriedades;
    }
}