using System;

namespace Exe1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Digite um número maior que zero para saber seu fatorial: ");
            int x = int.Parse(Console.ReadLine());
            if (x < 1)
            {
                Console.WriteLine("Valor inválido");
                Environment.Exit(0);
            }

            Console.WriteLine($"Fatorial de {x}, sem recursividade, é {CalcularFatorial(x)}");
            Console.WriteLine($"Fatorial de {x}, com recursividade, é {CalcularFatorialRecursividade(x)}");
        }

        static int CalcularFatorial(int x)
        {
            int resultado = 1;

            for (int i = 1; i <= x; i++)
            {
                resultado *= i;
            }

            return resultado;
        }

        static int CalcularFatorialRecursividade(int x)
        {
            if(x == 0)
            {
                return 1;
            }
            int valor = CalcularFatorialRecursividade(x - 1) * x;
            return valor;
        }
    }
}
