// Variável
int[] valor = new int[5];

Console.WriteLine("Digite 5 valores:");
for (int i = 0; i < 5; i++)
{
    try {valor[i] = int.Parse(Console.ReadLine());}
    catch {System.Console.WriteLine("Valor inválido. Será considerado 0");
           valor[i] = 0;}
}

Console.WriteLine("Ordem em que os valores foram lidos");
foreach (int p in valor) Console.Write($"{p} ");
Console.WriteLine();

Console.WriteLine("Valores em ordem descrescente");
foreach (int p in OrdenarValores(valor)) Console.Write($"{p} ");

// Função
static int[] OrdenarValores(int[] valores)
{
    Array.Sort(valores);
    Array.Reverse(valores);
    return valores;
}