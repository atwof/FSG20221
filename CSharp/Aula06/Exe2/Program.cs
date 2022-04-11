
int v1 = 0;
int v2 = 0;

System.Console.Write("Digite um valor: ");
try { v1 = int.Parse(Console.ReadLine());}
catch {System.Console.WriteLine("Valor inválido. Será considerado 0");}

System.Console.Write("Digite outro valor: ");
try { v2 = int.Parse(Console.ReadLine());}
catch {System.Console.WriteLine("Valor inválido. Será considerado 0");}

int maior = MaiorValor(v1,v2);

System.Console.WriteLine($"O maior valor é {maior}");

static int MaiorValor(int v1, int v2)
{
    int maior;

    if(v1 > v2)
    {
        maior = v1;
    }
    else
    {
        maior = v2;
    }

    return maior;
}
