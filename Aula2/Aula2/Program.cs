using System;

namespace Aula2
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime nasc = new DateTime(1993, 12, 30);
            DateTime atual = DateTime.Today;

            Console.WriteLine($"Idade: {calcularIdade(nasc, atual)}");
        }

        private static int calcularIdade(DateTime nasc, DateTime atual)
        {
            int dias = ((atual - nasc).Days) / 360;

            return dias;
            
        }
    }
}
