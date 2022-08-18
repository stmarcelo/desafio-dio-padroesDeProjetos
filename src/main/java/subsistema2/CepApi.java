package subsistema2;

import com.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarUf(String cep){
        return "SP";
    }
}
