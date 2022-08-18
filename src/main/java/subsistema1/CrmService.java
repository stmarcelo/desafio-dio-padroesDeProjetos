package subsistema1;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String uf){
        System.out.println("gravarCliente CrmService");
        System.out.println("nome = " + nome + ", cep = " + cep + ", cidade = " + cidade + ", uf = " + uf);
    }
}
