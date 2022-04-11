// Variáveis
int pos = 0;
int valor = 0;
int[] vetor = new int[] { 1, 2, 3, 4, 5 };

// Leituras dos valores e da operação
System.Console.Write("Digite a posição: ");
pos = int.Parse(Console.ReadLine());

System.Console.Write("Digite o valor: ");
valor = int.Parse(Console.ReadLine());

if(pos < 1 || pos > vetor.Length)
{
    System.Console.WriteLine("Posição inválida");
    Environment.Exit(0);
}
else
    vetor = AdicionarValorVetor(pos, valor, vetor);

// Mostrar vetor ordenado
System.Console.WriteLine("Vetor com novo valor e ordenado");
foreach (int item in vetor) {System.Console.Write(item + " ");}

// Função
static int[] AdicionarValorVetor(int pos, int valor, int[] vetor)
{
    vetor[pos] = valor;
    Array.Sort(vetor);
    return vetor;
}