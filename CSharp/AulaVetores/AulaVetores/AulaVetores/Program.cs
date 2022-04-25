using System;

namespace AulaVetores
{
    class Program
    {
        static void Main(string[] args)
        {
            int v = 20;
            /*
            for (int i = 0; i < v; i++)
            {
                Console.Write(fiboRecu(i) + " ");
            }
            */

            fiboNormal(v);

        }

        static int fiboRecu(int v)
        {
            int valor = 0;
            if (v == 0 || v == 1)
            {
                valor = v;
            }
            else
            {
                valor = fiboRecu(v - 1) + fiboRecu(v - 2);
            }
            return valor;
        }

        static void fiboNormal(int v)
        {
            int valor = 0;
            for (int i = 0; i < v; i++)
            {
                if(i == 0 || i == 1)
                {
                    Console.Write(i + " ");
                }
                else
                {
                    valor = (valor - 1) + (valor - 2);
                    Console.Write(valor + " ");
                    valor = i;
                }
            }
        }
    }
}
