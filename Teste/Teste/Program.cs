using System;
using System.Diagnostics;
using System.Threading;

namespace Teste
{
    class Program
    {
        static int total = 500;

        static void Main(string[] args)
        {
            int valor = 3;

            for (int i = 0; i < valor; i++)
            {
                Thread tid1 = new Thread(new ThreadStart(Calcular));
                tid1.Start();
            }
        }

        static void ThreadExe()
        {
            var sw = Stopwatch.StartNew();
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine(string.Format($"Thread {Thread.CurrentThread.ManagedThreadId}: {i}"));
                Thread.Yield();
            }
            sw.Stop();
            Console.WriteLine($"Time Thread {Thread.CurrentThread.ManagedThreadId}: {sw.ElapsedMilliseconds}");

        }

        static void Calcular()
        {
            var sw = Stopwatch.StartNew();
            for (int i = 0; i < total; i++)
            {
                Console.WriteLine($"MOSTRAR VALOR {i}");
            }
            sw.Stop();
            Console.WriteLine($"Tempo de execução: {sw.ElapsedMilliseconds}");
        }
    }
}
