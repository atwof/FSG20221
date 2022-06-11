package com.example.apploja;

/**
 * Created by RenanTeles on 22/02/16.
 * Consumir Json no Android
 */
public class ServiceGenerator {
    
    public static final String API_BASE_URL = "https://h-apigateway.conectagov.estaleiro.serpro.gov.br/api-cep/v1/consulta/cep/";

    public static <S> S createService(Class<S> serviceClass) {

        //Instancia do interceptador das requisições
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .readTimeout(15, TimeUnit.SECONDS);

        httpClient.addInterceptor(loggingInterceptor);


        //Instância do retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(httpClient.build())
                .build();

        return retrofit.create(serviceClass);
    }
}