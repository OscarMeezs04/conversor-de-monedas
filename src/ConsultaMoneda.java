import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsultaMoneda {

    public Moneda buscarMoneda(String monedaPais){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/96751a3ac8341d281513c692/latest/"
                +monedaPais);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
    }

}
