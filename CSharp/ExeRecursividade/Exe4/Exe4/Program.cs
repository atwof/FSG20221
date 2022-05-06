    using System;
    using System.Threading;

namespace Exe4
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 0;
            int[] vetor = new int[5];
            int[] vetorX = new int[5];

            while (i < 5)
            {
                Console.Clear();
                Console.Write("Digite um número: ");
                vetor[i] = int.Parse(Console.ReadLine());
                i++;
            }

            Console.Clear();
            Console.WriteLine("Array, sem recursividade, ordenado pelo método BubbleSort");
            //vetor = OrdenarBubble(vetor);
            vetor = OrdenarBubbleFor(vetor);


            Console.Write("[");
            for (int j = 0; j < vetor.Length; j++)
            {
                Console.Write(vetor[j]);

                if (j < vetor.Length - 1)
                {
                    Console.Write(", ");
                }

            }
            Console.Write("]");

            Thread.Sleep(5000);

            i = 0;
            while (i < 5)
            {
                Console.Clear();
                Console.WriteLine();
                Console.Write("Digite um número: ");
                vetorX[i] = int.Parse(Console.ReadLine());
                i++;
            }

            Console.WriteLine("Array, com recursividade, ordenado pelo método BubbleSort");
            OrdenarBubbleSortRecursividade(vetorX, vetorX.Length);

            Console.Write("[");
            for (int j = 0; j < vetorX.Length; j++)
            {
                Console.Write(vetorX[j]);

                if (j < vetorX.Length - 1)
                {
                    Console.Write(", ");
                }

            }
            Console.Write("]");
        }

        static int[] OrdenarBubble(int[] vetor)
        {
            int aux = 0;

            for (int i = 0; i < vetor.Length - 1; i++)
            {
                if (vetor[i] > vetor[i + 1])
                {
                    aux = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = aux;
                    i = -1;
                }
            }

            return vetor;
        }

        static int[] OrdenarBubbleFor(int[] vetor)
        {
            int aux;
            int cont = 1;

            while (cont > 0)
            {
                cont = 0;
                for (int i = 0; i < vetor.Length - 1; i++)
                {
                    if (vetor[i] > vetor[i + 1])
                    {
                        aux = vetor[i + 1];
                        vetor[i + 1] = vetor[i];
                        vetor[i] = aux;
                        cont++;
                    }
                }
            }

            return vetor;
        }

        static void OrdenarBubbleSortRecursividade(int[] vetor, int n)
        {
            if (n == 1)
            {
                return;
            }

            for (int i = 0; i < n - 1; i++)
            {
                if (vetor[i] > vetor[i + 1])
                {
                    int aux = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = aux;
                }
            }

            OrdenarBubbleSortRecursividade(vetor, n - 1);
        }
    }
}
