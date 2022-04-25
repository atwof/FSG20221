using System;

namespace Exe2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Digite o primeiro número: ");
            int v1 = int.Parse(Console.ReadLine());

            Console.Write("Digite o segundo número: ");
            int v2 = int.Parse(Console.ReadLine());

            if(v1 > v2)
            {
                Console.WriteLine("Primeiro número deve ser menor que o segundo");
                Environment.Exit(0);
            }

            Console.WriteLine($"A soma, sem recursividade, de todos os valores entre {v1} e {v2} é {CalcularValor(v1, v2)}");
            Console.WriteLine($"A soma, com recursividade, de todos os valores entre {v1} e {v2} é {CalcularValorRecursividade(v1, v2)}");
        }

        static int CalcularValor(int v1, int v2)
        {
            int soma = 0;

            for (int i = v1; i <= v2; i++)
            {
                soma += i;
            }

            return soma;
        }

        static int CalcularValorRecursividade(int v1, int v2)
        {
            if(v1 > v2)
            {
                return 0;
            }

            int soma = CalcularValorRecursividade(v1 + 1, v2) + v1;

            return soma;
        }
    }
}
