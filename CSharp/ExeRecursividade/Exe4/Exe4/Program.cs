using System;

namespace Exe4
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 0;
            int[] vetor = new int[5];

            while (i < 5)
            {
                Console.Clear();
                Console.Write("Digite um número: ");
                vetor[i] = int.Parse(Console.ReadLine());
                i++;
            }

            Console.Clear();
            Console.WriteLine("Array, sem recursividade, ordenado pelo método BubbleSort");
            vetor = OrdenarBubble(vetor);
            
            Console.Write("[");
            for (int j = 0; j < vetor.Length; j++)
            {
                Console.Write(vetor[j]);

                if(j < vetor.Length - 1)
                {
                    Console.Write(", ");
                }

            }
            Console.Write("]");
        }

        static int[] OrdenarBubble(int[] vetor)
        {
            int aux = 0;

            for (int i = 0; i < vetor.Length; i++)
            {
                if (i != vetor.Length - 1)
                {
                    if (vetor[i] > vetor[i + 1])
                    {
                        aux = vetor[i + 1];
                        vetor[i + 1] = vetor[i];
                        vetor[i] = aux;
                        i = -1;
                    }
                }
            }

            return vetor;
        }
    }
}
