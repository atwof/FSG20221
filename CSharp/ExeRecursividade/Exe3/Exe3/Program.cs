using System;

namespace Exe3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Digite a quantidade itens de Fibonacci: ");
            int v = int.Parse(Console.ReadLine());

            if(v == 0)
            {
                Console.WriteLine("Quantidade não pode ser zero");
                Environment.Exit(0);
            }

            Console.WriteLine($"Sequência de Fibonnaci, com recursividade, de {v} itens");

            for (int i = 0; i < v; i++)
            {
                Console.Write(FiboRecursividade(i));

                if(i < v - 1)
                {
                    Console.Write(", ");
                }
            };

            Console.WriteLine($"\nSequência de Fibonnaci, sem recursividade, de {v} itens");
            Fibo(v);
        }

        static int FiboRecursividade(int v)
        {
            if(v == 0 || v == 1)
            {
                return v;
            }

            return FiboRecursividade(v - 1) + FiboRecursividade(v - 2);
        }

        static void Fibo(int v)
        {
            int first = 0;
            int second = 1;
            int fibo;

            for(int i = 0; i < v; i++)
            {
                if (i == 0 || i == 1)
                {
                    Console.Write(i);
                }
                else
                {
                    fibo = first + second;
                    first = second;
                    second = fibo;

                    Console.Write(second);
                }

                if(i < v-1)
                {
                    Console.Write(", ");
                }
            }
        }
    }
}
