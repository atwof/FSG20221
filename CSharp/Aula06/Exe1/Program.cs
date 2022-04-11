
int v1 = 0;
int v2 = 0;

System.Console.WriteLine("Digite um valor: ");
try {v1 = int.Parse(Console.ReadLine());}
catch {System.Console.WriteLine("Valor inválido. Será considerado 0");}

System.Console.WriteLine("Digite um valor: ");
try {v2 = int.Parse(Console.ReadLine());}
catch {System.Console.WriteLine("Valor inválido. Será considerado 0");}

int resultado = Somar(v1,v2);
System.Console.WriteLine($"A soma dos valores é {resultado}");

static int Somar(int v1, int v2)
{
    int soma = v1+ v2;
    return soma;
}
