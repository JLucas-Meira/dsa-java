package java_core.basics.statics_keyword.api_config;

public class ApiConfig {
    public static final String BASE_URL = "http://localhost:8080";

    public static String gerarEndpoint(String recurso){
        return BASE_URL + recurso;
    }
}

