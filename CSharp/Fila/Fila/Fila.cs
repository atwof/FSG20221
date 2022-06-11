using System;
namespace Fila
{
    public class Fila
    {
        private ItemFila _primeiroItem;
        private ItemFila _ultimoItem;

        public void Adicionar(String item)
        {
            // Adicionar sempre na última posição

            ItemFila novoItem = new ItemFila();

            novoItem.Valor = item;

            if (_primeiroItem == null)
            {
                _primeiroItem = novoItem;
                _ultimoItem = novoItem;
            }
            else
            {
                _ultimoItem.Prox = novoItem;
                _ultimoItem = _ultimoItem.Prox;
            }
        }

        public String Remover()
        {
            // Remover sempre o primeiro item

            String itemRemovido = _primeiroItem.Valor;

            if (_primeiroItem.Prox == null)
            {
                _primeiroItem.Valor = null;
            }
            else
            {
                _primeiroItem = _primeiroItem.Prox;
            }

            return itemRemovido; 
        }

        public void Escrever()
        {
            // Escrever todos os itens da fila

            Console.WriteLine();
            int count = 1;
            ItemFila item = _primeiroItem;

            if (item.Valor == null)
            {
                Console.WriteLine("Lista ficou sem itens");
                return;
            }
            else
            {
                Console.WriteLine($"Item {count} da lista: {item.Valor}");
                count++;
            }

            while(item.Prox != null)
            {
                item = item.Prox;
                Console.WriteLine($"Item {count} da lista: {item.Valor}");
                count++;
            }
            
        }
    }
}
