using System;

namespace Aula09_01
{
    class Program
    {
        static void Main(string[] args)
        {
            int aux;
            int[] numeros = new int[20];

            numeros[0] = 10;
            numeros[2] = 22131;
            numeros[5] = 11011;
            numeros[11] = 1120;
            numeros[19] = 103;
            numeros[4] = 101;
            numeros[7] = 1033;

            // Troca de valores com auxiliar
            aux = numeros[2];
            numeros[4] = aux;
            numeros[2] = numeros[4];

            Console.WriteLine($"Posição 5: {numeros[4]}");

        }
    }
}
