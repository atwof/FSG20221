using System;
namespace Aula05
{
    public class Operacoes
    {
        public static int Somar(int n1, int n2)
        {
            return n1 + n2;
        }

        public static int Subtrair(int n1, int n2)
        {
            return n1 - n2;
        }

        public static double Dividir(int n1, int n2)
        {
            double resultado = 0;

            resultado = (double)n1 / (double)n2;

            return resultado;
        }

        public static int Multiplicar(int n1, int n2)
        {
            return n1 * n2;
        }

        public static int VerificarMaiorValor(int n1, int n2)
        {
            if (n1 > n2)
            {
                return n1;
            }
            else
            {
                return n2;
            }
        }

        public static int SomarIntervalo(int n1, int n2)
        {
            int soma = 0;

            if (n1 > n2)
            {
                soma = 0;
            }
            else if (n1 == n2)
            {
                soma = n1;
            }
            else
            {
                for (int i = n1; i <= n2; i++)
                {
                    soma += i;
                }
            }

            return soma;
        }

        public static int Fatorial(int n1)
        {
            if (n1 <= 0)
                return 0;

            int soma = 1;

            for (int i = 1; i <= n1; i++)
            {
                soma *= i;
            }

            return soma;
        }

        public static void MaiorMenorQuantidadeMedia()
        {
            int soma = 0;
            int maior = 0;
            int menor = 1000;
            int quantidade = 0;


            Console.WriteLine("Digite um valor ou ponto(.) para sair: ");
            while (true)
            {
                string valor = Console.ReadLine();


                if (valor.Contains('.'))
                {
                    Console.WriteLine("INFORMACOES\n" +
                                      $"MAIOR NUMERO: {maior}\n" +
                                      $"MENOR NUMERO: {menor}\n" +
                                      $"QUANTIDADE LIDA: {quantidade}\n" +
                                      $"MEDIA: {(double)soma / quantidade}");
                    break;
                }
                else
                {
                    // Somar
                    soma += int.Parse(valor);

                    // Quantidade
                    quantidade += 1;

                    // Maior
                    if (int.Parse(valor) > maior)
                    {
                        maior = int.Parse(valor);
                    }

                    // Menor
                    if (int.Parse(valor) < menor)
                    {
                        menor = int.Parse(valor);
                    }
                }
            }
        }

        public static void VerificarAprovados(string[] nome, double[] n1, double[] n2)
        {
            Console.WriteLine("Alunos aprovados");
            for (int i = 0; i < nome.Length; i++)
            {
                double media = (n1[i] + n2[i]) / 2;
                if(media >= 7.0)
                {
                    Console.WriteLine($"{nome[i]} - Media: {media}");
                }
            }
        }

        public static void OrganizarVetor()
        {

            int[] vetor = new int[5];

            for (int i = 0; i < 5; i++)
            {
                Console.Write("Digite um número: ");

                try { vetor[i] = int.Parse(Console.ReadLine()); }
                catch { vetor[i] = 0; }

                Console.Clear();

            }

            vetor[0] = 5;

            Array.Sort(vetor);

            foreach (int obj in vetor)
            {
                Console.Write(obj.ToString() + " ");
            }
        }
    }
}
