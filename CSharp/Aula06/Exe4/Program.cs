// Variáveis
int v1 = 0;
int v2 = 0;

// Leituras dos valores e da operação
System.Console.Write("Digite um valor: ");
try {v1 = int.Parse(Console.ReadLine());}
catch {System.Console.WriteLine("Valor inválido. Valor será 0");}

System.Console.Write("Digite outro valor: ");
try {v2 = int.Parse(Console.ReadLine());}
catch {System.Console.WriteLine("Valor inválido. Valor será 0");}

if(SomarIntervalo(v1, v2) != -1)
{
    System.Console.WriteLine($"A soma do intervalo entre {v1} e {v2} é {SomarIntervalo(v1, v2)} ");
}

// Função
static int SomarIntervalo(int v1, int v2)
{   
    int soma = 0;

    if(v1 > v2)
    {
        System.Console.WriteLine("Primeiro número deve ser menor que o segundo");
        return -1;
    }

    for (int i = v1; i <= v2; i++)
    {
        soma += i;
    }

    return soma;
}
