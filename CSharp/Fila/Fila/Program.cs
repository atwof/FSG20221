using System;

namespace Fila
{
    class Program
    {
        static void Main(string[] args)
        {
            Fila fila = new Fila();

            fila.Adicionar("A");
            fila.Adicionar("B");

            Console.WriteLine($"Item removido: {fila.Remover()}");

            fila.Adicionar("C");
            fila.Adicionar("D");

            //Console.WriteLine($"Item removido: {fila.Remover()}");
            //Console.WriteLine($"Item removido: {fila.Remover()}");
            //Console.WriteLine($"Item removido: {fila.Remover()}");

            fila.Escrever();
        }
    }
}
