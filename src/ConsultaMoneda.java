import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;

public class ConsultaMoneda {

    public String buscarMoneda(String monedaPais){
//        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/96751a3ac8341d281513c692/latest/"
//                +monedaPais);
        String url_str = "https://v6.exchangerate-api.com/v6/96751a3ac8341d281513c692/latest/" +monedaPais;
        try {
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();
            System.out.println();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        } {
            return "USD";

        }
    }
}
