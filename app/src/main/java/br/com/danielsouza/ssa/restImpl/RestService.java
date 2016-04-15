package br.com.danielsouza.ssa.restImpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;

import br.com.danielsouza.ssa.restInteface.RestInterface;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;


/**
 * Classe responsavel por instanciar o framework Retrofit de forma unica (Singleton)
 * @author Daniel Jorge
 * Created by Daniel Jorge on 22/02/2016.
 */
public class RestService {

    protected static RestInterface restInterface;

    public static RestInterface getRestInterface() {

        if (restInterface == null) {

            /**
             * URL do servico
             */
            String url = "http://192.168.0.12:8080/AgendamentoUnifor/rest";

            /**
             * Instancia da biblioteca GSON do google para conversao de JSON
             */
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'")
                    .create();

            /**
             * Instancia do framework Retrofit
             */
            RestAdapter restadapter = new RestAdapter.Builder()
                    .setClient(new OkClient(new OkHttpClient()))
                    .setConverter(new GsonConverter(gson))
                    .setEndpoint(url).build();

            /**
             * Criacao da interface do servico
             */
            restInterface = restadapter.create(RestInterface.class);
        }
        return restInterface;
    }
}
