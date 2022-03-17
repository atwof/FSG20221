using System;

namespace Aula02
{
    class Program
    {
        static void Main(string[] args)
        {

            int media = 6;

            Console.Write("Digite a primeira nota do aluno: ");
            double n1 = double.Parse(Console.ReadLine());

            Console.Write("Digite a segunda nota do aluno: ");
            double n2 = double.Parse(Console.ReadLine());

            Console.Write("Digite a terceira nota do aluno: ");
            double n3 = double.Parse(Console.ReadLine());

            Console.Write("Digite a quarta nota do aluno: ");
            double n4 = double.Parse(Console.ReadLine());

            double notaFinal = calcularNotaAluno(n1, n2, n3, n4);

            Console.WriteLine($"Nota final do aluno: {Math.Round(notaFinal, 2)} \n");

            // Precisa recuperar nota?
            if (pegouRecuperacao(notaFinal, media))
            {
                double valorFalta;
                double nota`Precisa;

                valorFalta = media - notaFinal;

                notaPrecisa = ((10 * valorFalta) / 5);

                Console.WriteLine($"Para passar, o aluno precisa tirar {Math.Round(notaPrecisa, 2)} de 10 na prova final.");
            }
            else
            {
                Console.WriteLine("* Parabéns, aluno aprovado *");
            }

        }

        private static double calcularNotaAluno(double n1, double n2, double n3, double n4)
        {
            double notaFinal;

            notaFinal = (5 * (n1 / 10)) + (2 * (n2 / 10)) + (2 * (n3 / 10)) + (1 * (n4 / 10));

            return notaFinal;
        }

        private static bool pegouRecuperacao(double nf, int media)
        {
            bool pegou = true;

            if (nf >= media)
            {
                pegou = false;
            }

            return pegou;
        }
    }
}