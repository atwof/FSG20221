using System;

namespace Aula11
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Programa iniciado...");
            Console.WriteLine();

            Lista lista = new Lista();
            lista.Adicionar(9);
            lista.Adicionar(2);
            lista.Adicionar(9);
            lista.Adicionar(3);
            lista.Adicionar(1);
            lista.Adicionar(6);

            //lista = lista.Remover(5);
            lista.RemoverDois(4);

            lista.Escrever();

            Console.WriteLine();
            lista.Contar();

            Console.WriteLine();
            Console.WriteLine("Fim do programa!");
        }
    }
}
