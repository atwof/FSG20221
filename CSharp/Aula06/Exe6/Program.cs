Console.WriteLine("Digite um valor ou ponto(.) para sair: ");
MaiorMenorQuantidadeMedia();

static void MaiorMenorQuantidadeMedia()
{
    int soma = 0;
    int maior = 0;
    int menor = 1000;
    int quantidade = 0;

    while(true)
    {
        string valor = Console.ReadLine();

        if (valor.Contains('.'))
        {
            Console.WriteLine("\nINFORMACOES\n" +
                             $"MAIOR NUMERO: {maior}\n" +
                             $"MENOR NUMERO: {menor}\n" +
                             $"QUANTIDADE LIDA: {quantidade}\n" +
                             $"MEDIA: {(double)soma / quantidade}");
            break;
        }
        else
        {
            // Somar
            soma += int.Parse(valor);

            // Quantidade
            quantidade += 1;

            // Maior
            if (int.Parse(valor) > maior)
            {
                maior = int.Parse(valor);
            }

            // Menor
            if (int.Parse(valor) < menor)
            {
                menor = int.Parse(valor);
            }
        }
    }
}