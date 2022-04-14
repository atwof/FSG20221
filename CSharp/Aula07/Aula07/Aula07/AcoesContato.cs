using System;
using System.IO;

namespace Aula07
{
    public class AcoesContato
    {
        public static bool Adicionar(Contato contato)
        {
            bool confirma = true;
            string linha = contato.getNome() + ";" + contato.getTelefone() + "\n";

            try
            {
                if (File.Exists("Contato.txt"))
                {
                    File.AppendAllText("Contato.txt", linha);
                }
                else
                {
                    File.WriteAllText("Contato.txt", linha);
                }
            }
            catch (Exception)
            {
                confirma = false;
            }

            return confirma;
        }

        public static bool LerContato()
        {
            bool lido = true;
            Console.Write("Digite o nome do contato: ");
            string nome = Console.ReadLine() ?? string.Empty;

            Console.Write("Digite o telefone do contato: ");
            string telefone = Console.ReadLine() ?? string.Empty;

            Contato contato = new Contato(nome, telefone);

            if (!Adicionar(contato))
            {
                lido = false;
            };

            return lido;
        }

        public static void MostrarContatos()
        {
            try
            {
                string[] dados = File.ReadAllLines("Contato.txt");

                if (dados.Length > 0)
                {
                    Console.WriteLine("LISTA DE CONTATOS\n");
                    foreach (string dado in dados)
                    {
                        string[] contato = dado.Split(";");
                        Console.WriteLine($"Nome: {contato[0]} - Telefone: {contato[1]}");
                    }
                }

                Console.WriteLine("\nAperte ENTER para continuar");
                string cont = Console.ReadLine();
            }
            catch (Exception)
            {
                Console.WriteLine("NÃO EXISTEM CONTATOS CADASTRADOS");
            }
        }

        public static bool RemoverContato()
        {
            bool remover = false;

            string arquivo = "Contato.txt";
            string temporario = "Contato_backup.txt";

            if (File.Exists(arquivo))
            {
                Console.Write("Nome do contato: ");
                string nome = Console.ReadLine().ToUpper();

                string[] dados = File.ReadAllLines(arquivo);
                foreach (string linha in dados)
                {
                    string[] cont = linha.ToUpper().Split(";");
                    if (!cont[0].Equals(nome))
                    {
                        File.AppendAllText(temporario, (linha + "\n"));
                    }
                    else
                    {
                        remover = true;
                    }
                }
                File.Delete(arquivo);
                if (File.Exists(temporario))
                {
                    File.Move(temporario, arquivo);
                }
            }
            else
            {
                Console.WriteLine("NÃO EXISTEM CONTATOS CADASTRADOS");
            }

            return remover;
        }
    }
}
