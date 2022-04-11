// Variáveis
int v1 = 0;

// Leituras dos valores e da operação
System.Console.Write("Digite um valor: ");
try {v1 = int.Parse(Console.ReadLine());}
catch {System.Console.WriteLine("Valor inválido. Valor será 0");}

if(v1 < 1)
    System.Console.WriteLine("Valor deve ser maior que 0");
else
    System.Console.WriteLine($"O fatorial de {v1} é {CalcularFatorial(v1)}");

// Função
static int CalcularFatorial(int v1)
{
    int fatorial = 1;

    for(int i = 1; i <= v1; i++)
    {
        fatorial *= i;
    }

    return fatorial;
}