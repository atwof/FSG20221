using System;

namespace Aula04
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite um valor");
            string v = Console.ReadLine();

            int n = int.Parse(v);
        }

        private static int fibo(int n)
        {
            int i = 0;
            int j = 1;
            int t = 0;

            for (int k = 0; k < n; k++)
            {
                t = i + j;
                i = j;
                j = t;
            }
            return j;
        }

        private static int fiboRecur(int n)
        {
            if (n < 2)
            {
                return n;
            }
            else
            {
                return fibo(n - 1) + fibo(n - 2);
            }
        }
    }
}