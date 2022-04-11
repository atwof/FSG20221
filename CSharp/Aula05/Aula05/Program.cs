using System;
using System.Globalization;

namespace Aula05
{
    class Program
    {
        static void Main(string[] args)
        {

            /*
            // Leitura dos valores inteiros
            Console.Write("Digite um número: ");
            int n1 = int.Parse(Console.ReadLine());

            Console.Write("Digite um número: ");
            int n2 = int.Parse(Console.ReadLine());

            // Exercício 1
            Console.WriteLine($"A soma dos valores é {Operacoes.Somar(n1, n2)}");

            // Exercício 2
            Console.WriteLine($"O maior número é {Operacoes.VerificarMaiorValor(n1, n2)}");

            // Exercício 3
            Console.Write("Digite um número: ");
            int n1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Digite a operação matemática desejada\n" +
                              "[+] ADIÇÃO\n" +
                              "[-] SUBTRAÇÃO\n" +
                              "[*] MULTIPLICAÇÃO\n" +
                              "[/] DIVISÃO");
            Console.Write("Opção: ");
            char op = char.Parse(Console.ReadLine());

            Console.Write("Digite um número: ");
            int n2 = int.Parse(Console.ReadLine());

            Calculadora(n1, n2, op);

            // Exercício 4
            Console.Write("Digite um número: ");
            int n1 = int.Parse(Console.ReadLine());

            Console.Write("Digite um número: ");
            int n2 = int.Parse(Console.ReadLine());

            Console.WriteLine($"A soma do intervalo entre os números [{n1}] e [{n2}] é {Operacoes.SomarIntervalo(n1,n2)}");

            // Exercíio 5
            Console.Write("Digite um número para saber seu fatorial: ");
            int n1 = int.Parse(Console.ReadLine());

            Console.WriteLine($"O fatorial de {n1} é {Operacoes.Fatorial(n1)}");

            // Exercício 6
            Operacoes.MaiorMenorQuantidadeMedia();

            // Exercício 7
            int[] valor = new int[5];

            Console.WriteLine("Digite 5 valores:");
            for (int i = 0; i < 5; i++)
            {
                valor[i] = int.Parse(Console.ReadLine());
            }

            Console.WriteLine("Ordem em que os valores foram lidos");
            foreach (int p in valor) Console.Write($"{p} ");
            Console.WriteLine();

            Console.WriteLine("Valores em ordem descrescente");
            Array.Sort(valor);
            Array.Reverse(valor);
            foreach (int p in valor) Console.Write($"{p} ");

            // Exercício 8
            string[] nome = new string[5];
            double[] nota1 = new double[nome.Length];
            double[] nota2 = new double[nome.Length];

            for (int i = 0; i < nome.Length; i++)
            {
                Console.Write("Digite o nome do aluno: ");
                nome[i] = Console.ReadLine();

                Console.Write("Digite a nota 1: ");
                nota1[i] = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

                Console.Write("Digite a nota 2: ");
                nota2[i] = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

                Console.Clear();
            }

            Operacoes.VerificarAprovados(nome, nota1, nota2);

            */

            // Exercício 9

            // Exercício 10
            Operacoes.OrganizarVetor();

        }

        static void calculadora(int n1, int n2, char op)
        {
            switch(op)
            {
                case '+':
                    Console.WriteLine($"A soma dos valores é {Operacoes.Somar(n1, n2)}");
                    break;
                case '-':
                    Console.WriteLine($"A subtração dos valores é {Operacoes.Subtrair(n1, n2)}");
                    break;
                case '*':
                    Console.WriteLine($"A multiplicação dos valores é {Operacoes.Multiplicar(n1, n2)}");
                    break;
                case '/':
                    Console.WriteLine($"A divisão dos valores é {Operacoes.Dividir(n1, n2)}");
                    break;
                default:
                    Console.WriteLine("Operação inválida");
                    break;
            }
        }
    }
}
