using System;
using System.Net.Http;

namespace TEste3
{
    class Program
    {
        static void Main(string[] args)
        {
            HttpClient httpClient;
            httpClient = new HttpClient();
            httpClient.BaseAddress = new Uri("https://h-apigateway.conectagov.estaleiro.serpro.gov.br/api-cep/v1/consulta/cep/");
            httpClient.DefaultRequestHeaders.Accept.Clear();
            httpClient.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
        }
    }
}
