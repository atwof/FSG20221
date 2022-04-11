using System.Globalization;

// Variáveis
string[] nome = new string[5];
double[] nota1 = new double[nome.Length];
double[] nota2 = new double[nome.Length];

for (int i = 0; i < nome.Length; i++)
{
    Console.Write("Digite o nome do aluno: ");
    nome[i] = Console.ReadLine();

    Console.Write("Digite a nota 1: ");
    try {nota1[i] = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);}
    catch {System.Console.WriteLine("Valor inválido. Será considerado 0");
           nota1[i] = 0;}

    Console.Write("Digite a nota 2: ");
    try {nota2[i] = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);}
    catch {System.Console.WriteLine("Valor inválido. Será considerado 0");
           nota2[i] = 0;}

    if(!ValidarNota(nota1[i], nota2[i]))
    {
        System.Console.WriteLine("Verifique os valores digitados");
        Environment.Exit(1);
    }
    Console.Clear();
}

VerificarAprovados(nome, nota1, nota2);

// Função
static void VerificarAprovados(string[] nome, double[] n1, double[] n2)
{
    Console.WriteLine("Alunos aprovados");
    for (int i = 0; i < nome.Length; i++)
    {
        double media = (n1[i] + n2[i]) / 2;
        if(media >= 7.0)
        {
            Console.WriteLine($"{nome[i]} - Media: {media}");
        }
    }
}

static bool ValidarNota(double n1, double n2)
{
    bool x = true;

    if(n1 > 10 || n2 > 10 || n1 < 0 || n2 < 0)
    {
        x = false;
    }

    return x;
}