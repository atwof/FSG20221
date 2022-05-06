using System;

namespace Exe5
{
    class Program
    {
        static void Main(string[] args)
        {
            char inicio = 'A'; 
            char fim = 'C'; 
            char trabalho = 'B';
            int discos = 3;

            Console.WriteLine("Torre de Hanoi, com recursividade");
            //TorreHanoiRecursividade(discos, inicio, fim, trabalho);
            TorreHanoi(discos, inicio, fim, trabalho);

        }

        static void TorreHanoiRecursividade(int discos, char inicio, char fim, char trabalho)
        {
            if (discos > 0)
            {
                TorreHanoiRecursividade(discos - 1, inicio, trabalho, fim);
                Console.WriteLine($"Mova o disco de {inicio} para {fim}");
                TorreHanoiRecursividade(discos - 1, trabalho, fim, inicio);

            }
        }

        static void TorreHanoi(int discos, char inicio, char fim, char trabalho)
        {
            while(true)
            {
                Console.WriteLine($"Mova {inicio} para {fim}");
                break;
            }
        }
    }
}
