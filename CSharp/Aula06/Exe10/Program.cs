int[] vetor = new int[5];

for (int i = 0; i < vetor.Length; i++)
{
    Console.Write("Digite um número: ");

    try { vetor[i] = int.Parse(Console.ReadLine()); }
    catch { vetor[i] = 0; }

    vetor = OrganizarVetor(vetor);

    Console.Clear();
}

System.Console.WriteLine("Vetor ordenado");
foreach(int obj in vetor) {System.Console.WriteLine(obj);}

// Função
static int[] OrganizarVetor(int[] vetor)
{
    Array.Sort(vetor);
    return vetor;
}