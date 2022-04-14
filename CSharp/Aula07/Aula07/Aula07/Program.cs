using System;
using System.Threading;

namespace Aula07
{
    class Program
    {
        static void Main(string[] args)
        {
            int opc = 0;

            while (true)
            {
                Console.WriteLine("+ + LISTA DE OPÇÕES + + \n\n" +
                                  "1 - Adicionar contato\n" +
                                  "2 - Remover contato\n" +
                                  "3 - Listar contatos\n" +
                                  "4 - Finalizar prgrama\n");

                Console.Write("Opção desejada: ");

                try
                {
                    opc = int.Parse(Console.ReadLine());
                }
                catch (Exception)
                {
                    Console.WriteLine("\nOpção inválida");
                    Console.Clear();
                    continue;
                }

                Console.Clear();
                switch (opc)
                {
                    case 1: // Adicionar contato
                        if (AcoesContato.LerContato())
                        {
                            Console.WriteLine("Contato adicionado");
                        }
                        else
                        {
                            Console.WriteLine("Erro ao adicionar o contato");
                        }
                        break; // Remover contato
                        if(AcoesContato.RemoverContato())
                        {
                            Console.WriteLine("Contato removido");
                        }
                        break;
                    case 3: // Mostrar contatos
                        AcoesContato.MostrarContatos();
                        break;
                    case 4:
                        Environment.Exit(0);
                        break;
                    default: // Nenhuma das oções
                        Console.WriteLine("Opção inválida");
                        break;
                }

                Thread.Sleep(1000);
                Console.Clear();
            }
        }
    }
}
