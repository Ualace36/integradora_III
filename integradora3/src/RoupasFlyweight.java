import java.util.HashMap;
import java.util.Map;

public class RoupasFlyweight {
    private Map<String,Roupas> tudo = new HashMap<String,Roupas>();
    private Map<String,Roupas> tamanhoP = new HashMap<String,Roupas>();
    private Map<String,Roupas> tamanhoM= new HashMap<String,Roupas>();
    private Map<String,Roupas> tamanhoG = new HashMap<String,Roupas>();
    private Map<String,Roupas> importadas = new HashMap<String,Roupas>();
    private Map<String,Roupas> usadas = new HashMap<String,Roupas>();
    public Roupas adicionar(String tamanho,String tipo, boolean Novo, boolean importado){
        String key = tamanho + ":" + tipo;
        if(Novo){
            key += ":novo";
        }
        if(importado){
            key += ":importado";
        }
        if(tudo.containsKey(key)){
            return tudo.get(key);
        }
        else{
            Roupas roupa = new Roupas(tamanho,tipo,Novo,importado);
            tudo.put(key,roupa);
            switch (tamanho){
                case "P":
                    this.tamanhoP.put(key,roupa);
                    break;
                case "M":
                    this.tamanhoM.put(key,roupa);
                    break;
                case "G":
                    this.tamanhoG.put(key,roupa);
                    break;
            }
            if(!Novo){
                this.usadas.put(key,roupa);
            }
            if(importado){
                this.importadas.put(key,roupa);
            }
            return roupa;
        }
    }
    public int getRequest(){
        return this.tudo.size();
    }
}
